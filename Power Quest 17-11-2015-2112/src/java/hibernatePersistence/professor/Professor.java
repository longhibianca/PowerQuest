/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatePersistence.professor;

import java.io.Serializable;
import javax.persistence.Entity;

import java.util.Date;
import javax.persistence.Id;

import hibernatePersistence.conexao.ConectarBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bianca
 */
@Entity
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;
    
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
    @Id
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
}