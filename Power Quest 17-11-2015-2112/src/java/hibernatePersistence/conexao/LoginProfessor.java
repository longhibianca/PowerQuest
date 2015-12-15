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
import hibernatePersistence.conexao.ConectarBanco;

@WebServlet(name = "LoginProfessor", urlPatterns = {"/LoginProfessor"})
public class LoginProfessor extends HttpServlet
{
   // private static final long serialVersionUID = 7633293501883840556L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession(); //obtem a sessao do usuario, caso exista

        Professor user = null;
        String siape = request.getParameter("txtSiape"); // Pega o Login vindo do formulario
        String senha = request.getParameter("txtSenha"); //Pega a senha vinda do formulario
        System.out.println(siape);
        System.out.println(senha);
        try
        {
            ProfessorDAO dao = new ProfessorDAO(); //cria uma instancia do DAO usuario
            user = dao.getProfessor(siape, senha);
            System.out.println("entrei no dao do login");
        }
        catch (Exception e)
        {

        }

        //se nao encontrou usuario no banco, redireciona para a pagina de erro!
        if (user != null)
        {
            //se o dao retornar um usuario, coloca o mesmo na sessao
            session.setAttribute("user", user);
            request.getRequestDispatcher("MenuProfessor.jsp").forward(request, response);
        }
        else
        {
            session.invalidate();
            request.getRequestDispatcher("PaginaInicial.jsp").forward(request, response);   
            System.out.println("NAO FUNCIONOU");
        }
    }
}
