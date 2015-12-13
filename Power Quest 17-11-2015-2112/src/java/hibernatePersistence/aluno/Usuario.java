/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatePersistence.aluno;
import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Entity;

import hibernatePersistence.conexao.ConectarBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Bianca
 */
@Entity
public class Usuario implements Serializable {
    

    private static final long serialVersionUID = 1L;
    
    private String senha_aluno;

    public final String getSenha_aluno() {
        return senha_aluno;
    }

    public final void setSenha_aluno(String value) {
        senha_aluno = value;
    }

    private String nome_usuario;

    public final String getNome_usuario() {
        return nome_usuario;
    }

    public final void setNome_usuario(String value) {
        nome_usuario = value;
    }

    private String cpf_usuario;

    public final String getCpf_usuario() {
        return cpf_usuario;
    }

    public final void setCpf_usuario(String value) {
        cpf_usuario = value;
    }
    @Id
    private String matricula;

    public final String getMatricula() {
        return matricula;
    }

    public final void setMatricula(String value) {
        this.matricula = value;
    }
    
    public Usuario(String nome_usuario)
    {
        super();
        this.nome_usuario = nome_usuario;
    }

    public Usuario(String nome_usuario, String matricula)
    {
        super();
        this.nome_usuario = nome_usuario;
        this.matricula = matricula;
    }
    public Usuario ()
    {
    
    }
    
}
