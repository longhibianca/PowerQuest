/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatePersistence.conteudo;

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
public class ConteudoDAO {
    private Session session;
    private Transaction transaction;
        public void salvar(Conteudo conteudo) {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            this.session.save(conteudo);
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
    
}
