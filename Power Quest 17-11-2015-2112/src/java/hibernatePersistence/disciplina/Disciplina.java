/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatePersistence.disciplina;

import java.io.Serializable;
//import javax.persistence.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 *
 * @author Bianca
 */
@Entity
public class Disciplina implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nome_disciplina;
    
    @Id
    private int cod_disciplina;
    
    private String siape;

    /**
     * @return the nome_disciplina
     */
    public String getNome_disciplina() {
        return nome_disciplina;
    }

    /**
     * @param nome_disciplina the nome_disciplina to set
     */
    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
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
    
}
