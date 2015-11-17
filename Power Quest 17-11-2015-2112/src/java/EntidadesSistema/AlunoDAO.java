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

import EntidadesSistema.Aluno;
import java.sql.SQLException;
/**
 *
 * @author Bianca
 */
public class AlunoDAO extends ConectarBanco {
    
    public void inserir(Aluno aluno)
    {
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("Insert into usuario (nome_usuario, cpf_usuario, matricula, senha_aluno) values	(?,?,?,?)");
            pstm.setString(1, aluno.getNome_usuario());
            pstm.setString(2, aluno.getCpf_usuario());
            pstm.setString(3, aluno.getMatricula());
           // pstm.setString(4, professor.getDataNascimentoProf());
            pstm.setString(4, aluno.getSenha_aluno());
            pstm.execute();
            pstm.close();
            conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean existe(Aluno aluno)
    {
        boolean achou = false;
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("Select * from usuario where matricula = ?");
            pstm.setString(3, aluno.getMatricula());
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
    
    public Aluno getAluno( String matricula, String senha_aluno )
    {
        Connection conexao = CriarConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            ps = conexao.prepareStatement("select * from usuario where matricula = ? and senha_aluno = ?");
            ps.setString(1, matricula);
            ps.setString(2, senha_aluno);
 
            
            rs = ps.executeQuery();
            System.out.println("o nome da tabela é usuario, o  matricula é " + matricula + " e a senha é " + senha_aluno);
 
            
            
            if ( rs.next() )
            {
                Aluno user = new Aluno();
                user.setMatricula(matricula);
                user.setSenha_aluno(senha_aluno);
 
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
    
}
