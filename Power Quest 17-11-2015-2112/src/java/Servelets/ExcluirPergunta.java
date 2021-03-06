/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

/**
 *
 * @author Bianca
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EntidadesSistema.Pergunta;
import EntidadesSistema.PerguntaDAO;
/**
 *
 * @author Bianca
 */
@WebServlet(name = "ExcluirPergunta", urlPatterns = {"/ExcluirPergunta"})
public class ExcluirPergunta extends HttpServlet
{
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        Pergunta pergunta = new Pergunta();

        //professor.setNome(request.getParameter("nome"));
        //professor.setCpf(request.getParameter("cpf"));
        pergunta.setCod_perg(Integer.parseInt(request.getParameter("cod_perg")));
        //professor.setDataNascimentoProf(request.getParameter("datanascimento"));
        //professor.setSenha(request.getParameter("senha"));

        pergunta.DeletarPergunta();
        PerguntaDAO dao = new PerguntaDAO();
        
        response.sendRedirect("MenuProfessor.jsp");
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
