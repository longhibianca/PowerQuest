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

import EntidadesSistema.Pergunta;
import java.sql.SQLException;
/**
 *
 * @author Bianca
 */
/*public class PerguntaDAO extends ConectarBanco {
    public void inserir(Pergunta pergunta)
    {
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("Insert into pergunta (enunciado, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, resp_correta, cod_perg, codigo_conteudo, cod_disciplina) values	(?,?,?,?,?,?,?,?,?,?)");
            pstm.setString(1, pergunta.getEnunciado());
            pstm.setString(2, pergunta.getAlternativa_a());
            pstm.setString(3, pergunta.getAlternativa_b());
            pstm.setString(4, pergunta.getAlternativa_c());
            pstm.setString(5, pergunta.getAlternativa_d());
            pstm.setString(6, pergunta.getAlternativa_e());
            pstm.setString(7, pergunta.getResp_correta());
            pstm.setInt(8, pergunta.getCod_perg());
            pstm.setInt(9, pergunta.getCodigo_conteudo());
            pstm.setInt(10, pergunta.getCod_disciplina());
            pstm.execute();
            pstm.close();
            conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean existe(Pergunta pergunta)
    {
        boolean achou = false;
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("Select * from pergunta where cod_perg = ?");
            pstm.setInt(8, pergunta.getCod_perg());
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
    public Pergunta getPergunta( String enunciado, int cod_perg )
    {
        Connection conexao = CriarConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            ps = conexao.prepareStatement("select * from pergunta where enunciado = ? and cod_perg = ?");
            ps.setString(1, enunciado);
            ps.setInt(2, cod_perg);
 
            
            rs = ps.executeQuery();
            System.out.println("o nome da tabela é pergunta, o  cod da pergunta é " + cod_perg + " e o enunciado é " + enunciado);
 
            
            
            if ( rs.next() )
            {
                Pergunta user = new Pergunta();
                user.setCod_perg(cod_perg);
                user.setEnunciado(enunciado);
 
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
        public void deletar(Pergunta pergunta)
    {
        try
        {
            Connection conexao = CriarConexao();
            PreparedStatement pstm = conexao.prepareStatement("delete from pergunta where cod_perg = ?");
           // pstm.setString(1, professor.getNome());
           // pstm.setString(2, professor.getCpf());
              pstm.setInt(8, pergunta.getCod_perg());
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