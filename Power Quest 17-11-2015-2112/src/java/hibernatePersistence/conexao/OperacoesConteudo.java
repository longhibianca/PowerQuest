/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatePersistence.conexao;

import hibernatePersistence.conteudo.Conteudo;
import hibernatePersistence.conteudo.ConteudoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bianca
 */
public class OperacoesConteudo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ConteudoDAO conteudoHibernateDAO = new ConteudoDAO();
          Conteudo conteudo = new Conteudo();

          conteudo.setCodigo_conteudo(Integer.parseInt(request.getParameter("codigo_conteudo")));
          conteudo.setConteudo_nome(request.getParameter("conteudo_nome"));
          conteudo.setCod_disciplina(Integer.parseInt(request.getParameter("cod_disciplina")));
          
          conteudoHibernateDAO.salvar(conteudo);
        
                response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<script type=\"text/javascript\">");  
        out.println("alert('O cadastro da disciplina foi realizado com sucesso :D');"); 
        out.println("location='MenuProfessor.jsp';");
        out.println("</script>");   
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
    @Override
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
