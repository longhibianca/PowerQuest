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
/*public class Pergunta implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String enunciado;
    private String alternativa_a;
    private String alternativa_b;
    private String alternativa_c;
    private String alternativa_d;
    private String alternativa_e;
    private String resp_correta;
    private int cod_perg;
    private int codigo_conteudo;
    private int cod_disciplina;

    /**
     * @return the enunciado
     */
   /* public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    /*public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * @return the alternativa_a
     */
    /*public String getAlternativa_a() {
        return alternativa_a;
    }

    /**
     * @param alternativa_a the alternativa_a to set
     */
   /* public void setAlternativa_a(String alternativa_a) {
        this.alternativa_a = alternativa_a;
    }

    /**
     * @return the alternativa_b
     */
    /*public String getAlternativa_b() {
        return alternativa_b;
    }

    /**
     * @param alternativa_b the alternativa_b to set
     */
    /*public void setAlternativa_b(String alternativa_b) {
        this.alternativa_b = alternativa_b;
    }

    /**
     * @return the alternativa_c
     */
    /*public String getAlternativa_c() {
        return alternativa_c;
    }

    /**
     * @param alternativa_c the alternativa_c to set
     */
   /* public void setAlternativa_c(String alternativa_c) {
        this.alternativa_c = alternativa_c;
    }

    /**
     * @return the alternativa_d
     */
    /*public String getAlternativa_d() {
        return alternativa_d;
    }

    /**
     * @param alternativa_d the alternativa_d to set
     */
    /*public void setAlternativa_d(String alternativa_d) {
        this.alternativa_d = alternativa_d;
    }

    /**
     * @return the alternativa_e
     */
   /* public String getAlternativa_e() {
        return alternativa_e;
    }

    /**
     * @param alternativa_e the alternativa_e to set
     */
    /*public void setAlternativa_e(String alternativa_e) {
        this.alternativa_e = alternativa_e;
    }

    /**
     * @return the resp_correta
     */
    /*public String getResp_correta() {
        return resp_correta;
    }

    /**
     * @param resp_correta the resp_correta to set
     */
    /*public void setResp_correta(String resp_correta) {
        this.resp_correta = resp_correta;
    }

    /**
     * @return the cod_perg
     */
    /*public int getCod_perg() {
        return cod_perg;
    }

    /**
     * @param cod_perg the cod_perg to set
     */
    /*public void setCod_perg(int cod_perg) {
        this.cod_perg = cod_perg;
    }

    /**
     * @return the codigo_conteudo
     */
   /* public int getCodigo_conteudo() {
        return codigo_conteudo;
    }

    /**
     * @param codigo_conteudo the codigo_conteudo to set
     */
  /*  public void setCodigo_conteudo(int codigo_conteudo) {
        this.codigo_conteudo = codigo_conteudo;
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
    
    public Pergunta(String enunciado)
    {
        super();
        this.enunciado = enunciado;
    }

    public Pergunta(String enunciado, int cod_perg)
    {
        super();
        this.enunciado = enunciado;
        this.cod_perg = cod_perg;
    }
    public Pergunta ()
    {
    
    }
    
    public String toString() {
        return "Pergunta [enunciado=" + enunciado
                + ", alternativa_a=" + alternativa_a
                + ", alternativa_b=" + alternativa_b
                + ", alternativa_c=" + alternativa_c
                + ", alternativa_d=" + alternativa_d
                + ", alternativa_e=" + alternativa_e
                + ", resp_correta=" + resp_correta
                + ", cod_perg=" + cod_perg
                + ", codigo_conteudo=" + codigo_conteudo +
                ", cod_disciplina=" + cod_disciplina + "]";
    }

    public void SalvarPergunta() {
        String sql = "insert into pergunta values (";

        sql = sql + "'" + enunciado + "', ";
        sql = sql + "'" + alternativa_a + "', ";
        sql = sql + "'" + alternativa_b + "', ";
        sql = sql + "'" + alternativa_c + "', ";
        sql = sql + "'" + alternativa_d + "', ";
        sql = sql + "'" + alternativa_e + "', ";
        sql = sql + "'" + resp_correta + "', ";
        sql = sql + "'" + cod_perg + "', ";
        sql = sql + "'" + codigo_conteudo + "', ";
        sql = sql + "'" + cod_disciplina + "')";

        ConectarBanco banco = new ConectarBanco();
        try {
            banco.SalvarObjeto(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Pergunta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void DeletarPergunta() {
        String sql = "delete from pergunta where cod_perg = ";

      //  sql = sql + "'" + nome + "', ";
      //  sql = sql + "'" + cpf + "', ";
        sql = sql + "'" + cod_perg +  "'";
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
*/