/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatePersistence.pergunta;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
/**
 *
 * @author Bianca
 */
//@WebServlet(name = "CadastroPergunta", urlPatterns = {"/CadastroPergunta"})
public class CadastroPergunta extends HttpServlet{
    
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
          PerguntaDAO perguntaHibernateDAO = new PerguntaDAO();
          pergunta.setEnunciado(request.getParameter("enunciado"));
          pergunta.setAlternativa_a(request.getParameter("alternativa_a"));
          pergunta.setAlternativa_b(request.getParameter("alternativa_b"));
          pergunta.setAlternativa_c(request.getParameter("alternativa_c"));
          pergunta.setAlternativa_d(request.getParameter("alternativa_d"));
          pergunta.setAlternativa_e(request.getParameter("alternativa_e"));
          pergunta.setResp_correta(request.getParameter("resp_correta"));
          pergunta.setCod_perg(Integer.parseInt(request.getParameter("cod_perg")));
          pergunta.setCodigo_conteudo(Integer.parseInt(request.getParameter("codigo_conteudo")));
          pergunta.setCod_disciplina(Integer.parseInt(request.getParameter("cod_disciplina")));

          perguntaHibernateDAO.salvar(pergunta);
    }
}