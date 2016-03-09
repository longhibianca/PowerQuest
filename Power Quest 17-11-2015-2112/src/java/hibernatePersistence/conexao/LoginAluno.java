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

import hibernatePersistence.aluno.Usuario;
import hibernatePersistence.aluno.AlunoDAO;
import hibernatePersistence.conexao.ConectarBanco;

@WebServlet(name = "LoginAluno", urlPatterns = {"/LoginAluno"})
public class LoginAluno extends HttpServlet
{
   // private static final long serialVersionUID = 7633293501883840556L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession(); //obtem a sessao do usuario, caso exista

        Usuario user = null;
        String matricula = request.getParameter("matricula"); // Pega o Login vindo do formulario da pag inicial
        String senha_aluno = request.getParameter("senha_aluno"); //Pega a senha vinda do formulario da pag inicial

        try
        {
            AlunoDAO dao = new AlunoDAO(); //cria uma instancia do DAO usuario
            user = dao.getUsuario(matricula, senha_aluno);
        }
        catch (Exception e)
        {

        }

        //se nao encontrou usuario no banco, redireciona para a pagina de erro!
        if (user != null)
        {
            //se o dao retornar um usuario, coloca o mesmo na sessao
            session.setAttribute("user", user);
            request.getRequestDispatcher("PaginaAluno.jsp").forward(request, response);
        }
        else
        {
            session.invalidate();
            request.getRequestDispatcher("PaginaInicial.jsp").forward(request, response);   
            System.out.println("NAO FUNCIONOU");
        }
    }
}
