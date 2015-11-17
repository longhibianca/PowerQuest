/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesSistema;

import java.io.Serializable;
import javax.persistence.Entity;

import java.util.Date;
import javax.persistence.Id;

import EntidadesSistema.ConectarBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bianca
 */
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String Login;

    public final String getLogin() {
        return Login;
    }

    public final void setLogin(String value) {
        Login = value;
    }

    private String senha;

    public final String getSenha() {
        return senha;
    }

    public final void setSenha(String value) {
        senha = value;
    }

    private String nome;

    public final String getNome() {
        return nome;
    }

    public final void setNome(String value) {
        nome = value;
    }

    private String cpf;

    public final String getCpf() {
        return cpf;
    }

    public final void setCpf(String value) {
        cpf = value;
    }

    private String siape;

    public final String getSiape() {
        return siape;
    }

    public final void setSiape(String value) {
        this.siape = value;
    }
    
    public Professor(String nome)
    {
        super();
        this.nome = nome;
    }

    public Professor(String nome, String siape)
    {
        super();
        this.nome = nome;
        this.siape = siape;
    }
    public Professor ()
    {
    
    }
    //private String dataNascimentoProf;
    /*  private String dataNascimentoProf;
     public final String getDataNascimentoProf() {
     return dataNascimentoProf;
     }
     public final String setDataNascimentoProf(String value) {
     dataNascimentoProf = value;
     return null;
     }*/

/*
    public Professor(String nomeProf) {
        super();
        this.nomeProf = nomeProf;
    }

    public Professor(String nomeProf, String siape) {
        super();
        this.nomeProf = nomeProf;
        this.siape = siape;
    }
    public Professor()
    {
        
    }
    */
    public String toString() {
        return "Professor [nome=" + nome
                + ", cpf=" + cpf
                + ", siape=" + siape
                + // ", datanascimento=" + dataNascimentoProf +
                ", senha=" + senha + "]";
    }

    public void SalvarProfessor() {
        String sql = "insert into professor values (";

        sql = sql + "'" + nome + "', ";
        sql = sql + "'" + cpf + "', ";
        sql = sql + "'" + siape + "', ";
        //sql = sql + "'" + dataNascimentoProf + "', ";
        sql = sql + "'" + senha + "')";

        ConectarBanco banco = new ConectarBanco();
        try {
            banco.SalvarObjeto(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void DeletarProfessor() {
        String sql = "delete from professor where siape = ";

      //  sql = sql + "'" + nome + "', ";
      //  sql = sql + "'" + cpf + "', ";
        sql = sql + "'" + siape +  "'";
        //sql = sql + "'" + dataNascimentoProf + "', ";
       // sql = sql + "'" + senha + "')";

        ConectarBanco banco = new ConectarBanco();
        try {
            banco.SalvarObjeto(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
        /**
         *
         * @param userid
         * @param password
         * @return
         */
        /*   public boolean aut(String userid, String password) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
         */
        /**
         * @return the dataNascimentoProf
         */
        /*  public String getDataNascimentoProf() {
         return dataNascimentoProf;
         }
         */
        /**
         * @param dataNascimentoProf the dataNascimentoProf to set
         */
        /* public void setDataNascimentoProf(String dataNascimentoProf) {
         this.dataNascimentoProf = dataNascimentoProf;
         }*/
