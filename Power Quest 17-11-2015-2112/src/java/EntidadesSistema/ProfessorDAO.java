/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesSistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import EntidadesSistema.Professor;
import java.sql.SQLException;
//import EntidadesSistema.ConectarBanco;
//import java.sql.SQLException;

/**
 *
 * @author Bianca
 */

public class ProfessorDAO extends ConectarBanco {
    public void inserir(Professor professor)
    {
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("Insert into professor (nome, cpf, siape, senha) values	(?,?,?,?)");
            pstm.setString(1, professor.getNome());
            pstm.setString(2, professor.getCpf());
            pstm.setString(3, professor.getSiape());
           // pstm.setString(4, professor.getDataNascimentoProf());
            pstm.setString(4, professor.getSenha());
            pstm.execute();
            pstm.close();
            conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean existe(Professor professor)
    {
        boolean achou = false;
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("Select * from professor where siape = ?");
            pstm.setString(3, professor.getSiape());
            ResultSet rs = pstm.executeQuery();
            if (rs.next())
            {
                achou = true;
            }
            pstm.close();
            conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return achou;
    }
    
    public Professor getProfessor( String siape, String senha )
    {
        Connection conexao = CriarConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            ps = conexao.prepareStatement("select * from professor where siape = ? and senha = ?");
            ps.setString(1, siape);
            ps.setString(2, senha);
 
            
            rs = ps.executeQuery();
            System.out.println("o nome da tabela é professor, o  siape é " + siape + " e a senha é " + senha);
 
            
            
            if ( rs.next() )
            {
                Professor user = new Professor();
                user.setSiape(siape);
                user.setSenha(senha);
 
                return user;
            } else {
                System.out.println("VOLTOU NADA DA BASE, MANO! LOKO!!!  SEI LA O QUE E ISSO");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (rs != null )
            {
                try { rs.close();
                }
                catch (SQLException e)
                {
                    ;
                }
                rs = null;
            }
            if (ps != null )
            {
                try { ps.close();
                } catch (SQLException e)
                {
                    ;
                }
                ps = null;
            }
            if (conexao != null )
            {
                try { conexao.close();
                } catch (SQLException e)
                {
                    ;
                }
                conexao = null;
            }
        }
        return null;
    }
    
    public void deletar(Professor professor)
    {
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("delete from professor where siape = ?");
           // pstm.setString(1, professor.getNome());
           // pstm.setString(2, professor.getCpf());
            pstm.setString(3, professor.getSiape());
           // pstm.setString(4, professor.getDataNascimentoProf());
          // pstm.setString(4, professor.getSenha());
            pstm.execute();
            pstm.close();
            conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
}
