/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package EntidadesSistema;

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
/*public class Disciplina implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nome_disciplina;
    private int cod_disciplina;
    private String siape;

    /**
     * @return the nome_disciplina
     */
    /*public String getNome_disciplina() {
        return nome_disciplina;
    }

    /**
     * @param nome_disciplina the nome_disciplina to set
     */
    /*public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    /**
     * @return the cod_disciplina
     */
  /* public int getCod_disciplina() {
        return cod_disciplina;
    }

    /**
     * @param cod_disciplina the cod_disciplina to set
     */
   /* public void setCod_disciplina(int cod_disciplina) {
        this.cod_disciplina = cod_disciplina;
    }

    /**
     * @return the siape
     */
    /*public String getSiape() {
        return siape;
    }

    /**
     * @param siape the siape to set
     */
   /* public void setSiape(String siape) {
        this.siape = siape;
    }
    
    public Disciplina(String nome_disciplina)
    {
        super();
        this.nome_disciplina = nome_disciplina;
    }

    public Disciplina(String nome_disciplina, int cod_disciplina)
    {
        super();
        this.nome_disciplina = nome_disciplina;
        this.cod_disciplina = cod_disciplina;
    }
    public Disciplina ()
    {
    
    }
    
    public String toString() {
        return "Disciplina [nome_disciplina=" + nome_disciplina
             //   + ", cpf_usuario=" + cpf_usuario
              //  + ", matricula=" + matricula
                + // ", datanascimento=" + dataNascimentoProf +
                ", cod_disciplina=" + cod_disciplina + "]";
    }

    public void SalvarDisciplina() {
        String sql = "insert into disciplina values (";

        sql = sql + "'" + nome_disciplina + "', ";
        //sql = sql + "'" + cpf_usuario + "', ";
        //sql = sql + "'" + matricula + "', ";
        //sql = sql + "'" + dataNascimentoProf + "', ";
        sql = sql + "'" + cod_disciplina + "')";

        ConectarBanco banco = new ConectarBanco();
        try {
            banco.SalvarObjeto(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void DeletarDisciplina() {
        String sql = "delete from disciplina where cod_disciplina = ";

      //  sql = sql + "'" + nome + "', ";
      //  sql = sql + "'" + cpf + "', ";
        sql = sql + "'" + cod_disciplina +  "'";
        //sql = sql + "'" + dataNascimentoProf + "', ";
       // sql = sql + "'" + senha + "')";

        ConectarBanco banco = new ConectarBanco();
        try {
            banco.SalvarObjeto(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   /* public void SalvarDisciplina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}*/
