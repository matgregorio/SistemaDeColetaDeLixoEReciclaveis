/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author mateu
 */
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@AllArgsConstructor
@Getter
@Setter
public class Material {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private String unidadeDeMedida;
    private boolean materialReciclavel;
    private int codigoMaterial;
    
    @ManyToOne
    @JoinColumn(name= "prefeitura_id")
    private Prefeitura prefeitura;
    
    public Material(){
        this.id = -1;
        this.nome = "";
        this.descricao = "";
        this.unidadeDeMedida = "";
        this.materialReciclavel = false;
        this.codigoMaterial = -1;
    }
}
