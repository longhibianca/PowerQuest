/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package EntidadesSistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import EntidadesSistema.Conteudo;
import java.sql.SQLException;
/**
 *
 * @author Bianca
 */
/*public class ConteudoDAO extends ConectarBanco {
    public void inserir(Conteudo conteudo)
    {
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("Insert into conteudo (codigo_conteudo, conteudo_nome, cod_disciplina) values	(?,?,?)");
            pstm.setInt(1, conteudo.getCodigo_conteudo());
            pstm.setString(2, conteudo.getConteudo_nome());
            pstm.setInt(3, conteudo.getCod_disciplina());
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
    public boolean existe(Conteudo conteudo)
    {
        boolean achou = false;
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("Select * from conteudo where codigo_conteudo = ?");
            pstm.setInt(1, conteudo.getCodigo_conteudo());
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
    public Conteudo getConteudo( int codigo_conteudo, String conteudo_nome )
    {
        Connection conexao = CriarConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            ps = conexao.prepareStatement("select * from conteudo where codigo_conteudo = ? and conteudo_nome = ?");
            ps.setInt(1, codigo_conteudo);
            ps.setString(2, conteudo_nome);
 
            
            rs = ps.executeQuery();
            System.out.println("o nome da tabela é conteudo, o  cod do conteudo é " + codigo_conteudo + " e o nome do conteudo é " + conteudo_nome);
 
            
            
            if ( rs.next() )
            {
                Conteudo user = new Conteudo();
                user.setCodigo_conteudo(codigo_conteudo);
                user.setConteudo_nome(conteudo_nome);
 
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
    public void deletar(Conteudo conteudo)
    {
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("delete from conteudo where codigo_conteudo = ?");
           // pstm.setString(1, professor.getNome());
           // pstm.setString(2, professor.getCpf());
              pstm.setInt(1, conteudo.getCodigo_conteudo());
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
*/