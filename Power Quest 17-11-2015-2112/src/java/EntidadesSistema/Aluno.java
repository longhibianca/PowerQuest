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
public class Aluno implements Serializable {
    
    private static final long serialVersionUID = 1L;
   // @Id
    private String nome_usuario;
    private String cpf_usuario;
    private String matricula;
    private String senha_aluno;

    /**
     * @return the nome_usuario
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * @param nome_usuario the nome_usuario to set
     */
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    /**
     * @return the cpf_usuario
     */
    public String getCpf_usuario() {
        return cpf_usuario;
    }

    /**
     * @param cpf_usuario the cpf_usuario to set
     */
    public void setCpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the senha_aluno
     */
    public String getSenha_aluno() {
        return senha_aluno;
    }

    /**
     * @param senha_aluno the senha_aluno to set
     */
    public void setSenha_aluno(String senha_aluno) {
        this.senha_aluno = senha_aluno;
    }
    public Aluno(String nome_usuario)
    {
        super();
        this.nome_usuario = nome_usuario;
    }

    public Aluno(String nome_usuario, String matricula)
    {
        super();
        this.nome_usuario = nome_usuario;
        this.matricula = matricula;
    }
    public Aluno ()
    {
    
    }
    
    public String toString() {
        return "Aluno [nome_usuario=" + nome_usuario
                + ", cpf_usuario=" + cpf_usuario
                + ", matricula=" + matricula
                + // ", datanascimento=" + dataNascimentoProf +
                ", senha_aluno=" + senha_aluno + "]";
    }

    public void SalvarAluno() {
        String sql = "insert into usuario values (";

        sql = sql + "'" + nome_usuario + "', ";
        sql = sql + "'" + cpf_usuario + "', ";
        sql = sql + "'" + matricula + "', ";
        //sql = sql + "'" + dataNascimentoProf + "', ";
        sql = sql + "'" + senha_aluno + "')";

        ConectarBanco banco = new ConectarBanco();
        try {
            banco.SalvarObjeto(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
