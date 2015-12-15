/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatePersistence.disciplina;

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
//@WebServlet(name = "CadastroDisciplina", urlPatterns = {"/CadastroDisciplina"})
public class CadastroDisciplina extends HttpServlet{
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
        DisciplinaDAO disciplinaHibernateDAO = new DisciplinaDAO();
        Disciplina disciplina = new Disciplina();
        disciplina.setNome_disciplina(request.getParameter("nome_disciplina"));
        disciplina.setCod_disciplina(Integer.parseInt(request.getParameter("cod_disciplina")));
        disciplinaHibernateDAO.salvar(disciplina);
    }
}