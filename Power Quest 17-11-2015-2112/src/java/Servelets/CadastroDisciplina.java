/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EntidadesSistema.Disciplina;
import EntidadesSistema.DisciplinaDAO;
/**
 *
 * @author Bianca
 */
/*@WebServlet(name = "CadastroDisciplina", urlPatterns = {"/CadastroDisciplina"})
public class CadastroDisciplina extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        Disciplina disciplina = new Disciplina();

        disciplina.setNome_disciplina(request.getParameter("nome_disciplina"));
        disciplina.setCod_disciplina(Integer.parseInt(request.getParameter("cod_disciplina")));
      //  aluno.setMatricula(request.getParameter("matricula"));
        //professor.setDataNascimentoProf(request.getParameter("datanascimento"));
      //  aluno.setSenha_aluno(request.getParameter("senha_aluno"));

        disciplina.SalvarDisciplina();
        DisciplinaDAO dao = new DisciplinaDAO();
        
        PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<script type=\"text/javascript\">");  
        out.println("alert('O cadastro da disciplina foi realizado com sucesso :D');"); 
        out.println("location='MenuProfessor.jsp';");
        out.println("</script>");    
        //response.sendRedirect("MenuProfessor.jsp");//TROCAR PARA OUTRA PAGINA!!!
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   /* @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   /* @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}
*/