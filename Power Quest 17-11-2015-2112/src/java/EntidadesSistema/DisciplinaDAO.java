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

import EntidadesSistema.Disciplina;
import java.sql.SQLException;
/**
 *
 * @author Bianca
 */
public class DisciplinaDAO extends ConectarBanco {
    
    public void inserir(Disciplina disciplina)
    {
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("Insert into disciplina (nome_disciplina, cod_disciplina) values	(?,?)");
            pstm.setString(1, disciplina.getNome_disciplina());
            pstm.setInt(2, disciplina.getCod_disciplina());
          //  pstm.setString(3, aluno.getMatricula());
           // pstm.setString(4, professor.getDataNascimentoProf());
            //pstm.setString(4, aluno.getSenha_aluno());
            pstm.execute();
            pstm.close();
            conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean existe(Disciplina disciplina)
    {
        boolean achou = false;
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("Select * from disciplina where cod_disciplina = ?");
            pstm.setInt(2, disciplina.getCod_disciplina());
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
    
    public Disciplina getDisciplina( String nome_disciplina, int cod_disciplina )
    {
        Connection conexao = CriarConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            ps = conexao.prepareStatement("select * from disciplina where nome_disciplina = ? and cod_disciplina = ?");
            ps.setString(1, nome_disciplina);
            ps.setInt(2, cod_disciplina);
 
            
            rs = ps.executeQuery();
            System.out.println("o nome da tabela é disciplina, o  nome disc é " + nome_disciplina + " e a cod_disc é " + cod_disciplina);
 
            
            
            if ( rs.next() )
            {
                Disciplina user = new Disciplina();
                user.setNome_disciplina(nome_disciplina);
                user.setCod_disciplina(cod_disciplina);
 
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
    
    public void deletar(Disciplina disciplina)
    {
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("delete from disciplina where cod_disciplina = ?");
           // pstm.setString(1, professor.getNome());
           // pstm.setString(2, professor.getCpf());
            pstm.setInt(2, disciplina.getCod_disciplina());
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
