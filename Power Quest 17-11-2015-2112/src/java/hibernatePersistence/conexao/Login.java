package hibernatePersistence.conexao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hibernatePersistence.professor.Professor;
import hibernatePersistence.professor.ProfessorDAO;
import hibernatePersistence.aluno.Usuario;
import hibernatePersistence.aluno.AlunoDAO;
import hibernatePersistence.conexao.ConectarBanco;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    // private static final long serialVersionUID = 7633293501883840556L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(); //obtem a sessao do usuario, caso exista

        Professor tio = null;
        Usuario aluno = null;
        String matricula = request.getParameter("txtId"); // Pega o Login vindo do formulario
        String senha = request.getParameter("txtSenha"); //Pega a senha vinda do formulario
        System.out.println(matricula);
        System.out.println(senha);

        try {
            ProfessorDAO dao = new ProfessorDAO(); //cria uma instancia do DAO usuario
            tio = dao.getProfessor(matricula, senha);
        } catch (Exception e) {

        }

        //se nao encontrou usuario no banco, redireciona para a pagina de erro!
        if (tio == null) {
            try {
                AlunoDAO dao = new AlunoDAO(); //cria uma instancia do DAO usuario
                aluno = dao.getUsuario(matricula, senha);
            } catch (Exception e) {

            }

            //se nao encontrou usuario no banco, redireciona para a pagina de erro!
            if (aluno == null) {
                session.invalidate();
                request.getRequestDispatcher("PaginaInicial.jsp").forward(request, response);
            } else {
                //se o dao retornar um usuario, coloca o mesmo na sessao
                session.setAttribute("user", aluno);
                request.getRequestDispatcher("PaginaAluno.jsp").forward(request, response);
            }
        } else {
            //se o dao retornar um usuario, coloca o mesmo na sessao
            session.setAttribute("user", tio);
            request.getRequestDispatcher("MenuProfessor.jsp").forward(request, response);
        }
    }
}
