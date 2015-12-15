/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatePersistence.aluno;

import hibernatePersistence.conexao.ConectarBanco;
import hibernatePersistence.util.HibernateUtil;
  import java.util.ArrayList;
  import org.hibernate.*;
/**
 *
 * @author Bianca
 */
public class AlunoDAO {
    
   private Session session;
    private Transaction transaction;
    public void salvar(Usuario aluno) {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            this.session.save(aluno);
            this.transaction.commit();
            System.out.println("entrou aqui");
        }catch (HibernateException e) {
            System.out.println("Não foi possível inserir. Erro:"
                    + e.getMessage());
            
        }finally {
            try {
                if (this.session.isOpen()) {
                    this.session.close();
                    
                }
            }catch (Throwable e) {
                System.out.println("Erro ao fechar a operação. Mensagem:"
                        + e.getMessage());
            }
        }
    }
    public boolean existe(Usuario aluno) {
        boolean achou = false;
        try {
            Session sessao = ConectarBanco.porFavor();
            Usuario user = null;
            //PreparedStatement pstm = conexao.prepareStatement("Select * from professor where siape = ?");
           // pstm.setString(3, professor.getSiape());
            //ResultSet rs = pstm.executeQuery();
            user = (Usuario) sessao.createQuery("from Usuario where matricula = ?").setParameter(0, aluno.getMatricula()).uniqueResult();
    
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

    public Usuario getUsuario(String matricula, String senha_aluno) {
        Usuario user = null;
        Session sessao = ConectarBanco.porFavor();
        try {
            System.out.println("caraca, manooooooooooooo");
            user = (Usuario) sessao.createQuery("from Usuario where matricula = ? and senha_aluno = ?").setParameter(0, matricula).setParameter(1, senha_aluno).uniqueResult();
            System.out.println("entrei no tryyyy");
            if (user == null) {
                System.out.println("VOLTOU NADA DA BASE, MANO! LOKO!!!  SEI LA O QUE E ISSO");
            } else {
                System.out.println("loko.... USUARIO: " + user.getNome_usuario());
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return user;
    }
}
