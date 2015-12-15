/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatePersistence.professor;
//import hibernatePersistence.professor.Professor;
//import EntidadesSistema.HibernateUtil;

import hibernatePersistence.conexao.ConectarBanco;
import hibernatePersistence.util.HibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.*;

/**
 *
 * @author Bianca
 */
public class ProfessorDAO {

    private Session session;
    private Transaction transaction;

    public void salvar(Professor professor) {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            this.session.save(professor);
            this.transaction.commit();
            System.out.println("entrou aqui");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir. Erro:"
                    + e.getMessage());

        } finally {
            try {
                if (this.session.isOpen()) {
                    this.session.close();

                }
            } catch (Throwable e) {
                System.out.println("Erro ao fechar a operação. Mensagem:"
                        + e.getMessage());
            }
        }
    }

    public boolean existe(Professor professor) {
        boolean achou = false;
        try {
            Session sessao = ConectarBanco.porFavor();
            Professor user = null;
            //PreparedStatement pstm = conexao.prepareStatement("Select * from professor where siape = ?");
           // pstm.setString(3, professor.getSiape());
            //ResultSet rs = pstm.executeQuery();
            user = (Professor) sessao.createQuery("from Professor where siape = ?").setParameter(0, professor.getSiape()).uniqueResult();
    
            if (user != null) {
                achou = true;
            }
            sessao.close();
           // conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return achou;
    }

    public Professor getProfessor(String siape, String senha) {
        Professor user = null;
        Session sessao = ConectarBanco.porFavor();
        try {
            System.out.println("caraca, manooooooooooooo");
            user = (Professor) sessao.createQuery("from Professor where siape = ? and senha = ?").setParameter(0, siape).setParameter(1, senha).uniqueResult();
            System.out.println("entrei no tryyyy");
            if (user == null) {
                System.out.println("VOLTOU NADA DA BASE, MANO! LOKO!!!  SEI LA O QUE E ISSO");
            } else {
                System.out.println("loko.... USUARIO: " + user.getNome());
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return user;
    }
}
