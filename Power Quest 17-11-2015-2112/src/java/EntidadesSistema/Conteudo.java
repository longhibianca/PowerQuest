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
public class Conteudo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int codigo_conteudo;
    private String conteudo_nome;
    private int cod_disciplina;
    private String siape;

    /**
     * @return the codigo_conteudo
     */
    public int getCodigo_conteudo() {
        return codigo_conteudo;
    }

    /**
     * @param codigo_conteudo the codigo_conteudo to set
     */
    public void setCodigo_conteudo(int codigo_conteudo) {
        this.codigo_conteudo = codigo_conteudo;
    }

    /**
     * @return the conteudo_nome
     */
    public String getConteudo_nome() {
        return conteudo_nome;
    }

    /**
     * @param conteudo_nome the conteudo_nome to set
     */
    public void setConteudo_nome(String conteudo_nome) {
        this.conteudo_nome = conteudo_nome;
    }

    /**
     * @return the cod_disciplina
     */
    public int getCod_disciplina() {
        return cod_disciplina;
    }

    /**
     * @param cod_disciplina the cod_disciplina to set
     */
    public void setCod_disciplina(int cod_disciplina) {
        this.cod_disciplina = cod_disciplina;
    }

    /**
     * @return the siape
     */
    public String getSiape() {
        return siape;
    }

    /**
     * @param siape the siape to set
     */
    public void setSiape(String siape) {
        this.siape = siape;
    }
    public Conteudo(String conteudo_nome)
    {
        super();
        this.conteudo_nome = conteudo_nome;
    }

    public Conteudo(String conteudo_nome, int codigo_conteudo)
    {
        super();
        this.conteudo_nome = conteudo_nome;
        this.codigo_conteudo = codigo_conteudo;
    }
    public Conteudo ()
    {
    
    }
    public String toString() {
        return "Conteudo [codigo_conteudo=" + codigo_conteudo
                + ", conteudo_nome=" + conteudo_nome
              //  + ", matricula=" + matricula
                + // ", datanascimento=" + dataNascimentoProf +
                ", cod_disciplina=" + cod_disciplina + "]";
    }

    public void SalvarConteudo() {
        String sql = "insert into conteudo values (";

        sql = sql + "'" + codigo_conteudo + "', ";
        sql = sql + "'" + conteudo_nome + "', ";
        //sql = sql + "'" + matricula + "', ";
        //sql = sql + "'" + dataNascimentoProf + "', ";
        sql = sql + "'" + cod_disciplina + "')";

        ConectarBanco banco = new ConectarBanco();
        try {
            banco.SalvarObjeto(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conteudo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void DeletarConteudo() {
        String sql = "delete from conteudo where codigo_conteudo = ";

      //  sql = sql + "'" + nome + "', ";
      //  sql = sql + "'" + cpf + "', ";
        sql = sql + "'" + codigo_conteudo +  "'";
        //sql = sql + "'" + dataNascimentoProf + "', ";
       // sql = sql + "'" + senha + "')";

        ConectarBanco banco = new ConectarBanco();
        try {
            banco.SalvarObjeto(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conteudo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
