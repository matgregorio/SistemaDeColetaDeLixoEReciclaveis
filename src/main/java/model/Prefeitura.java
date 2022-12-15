/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author mateu
 */
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@Entity
@AllArgsConstructor
@Getter
@Setter
public class Prefeitura implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public String nome;
    public String cnpj;
    public String cidade;
    public String telefone;
    public Date dataDeCadastro;
    public String email;
    
    public Prefeitura(){
        this.id = -1;
        this.nome = "";
        this.cnpj = "";
        this.cidade = "";
        this.telefone = "";
        this.dataDeCadastro = new Date();
    }
}
