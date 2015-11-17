/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesSistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bianca
 */
public class ConectarBanco {
    
    public Connection CriarConexao()
    {
        Connection conexao = null;
        String usuario = "postgres";
        String senha = "4skyfull0fst4rs";
        String nomeBancoDados = "Trabalho";

        try
        {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + nomeBancoDados, usuario, senha);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return conexao;
    }

    public final void SalvarObjeto(String sql) throws SQLException
    {
        Connection con = CriarConexao();

        Statement stm = con.createStatement();
        stm.execute(sql);
        con.commit();
    }
}
