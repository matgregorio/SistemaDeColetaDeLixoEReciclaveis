/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

public class Rota {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    private String pontoDeOrigem;
    private String pontoDeDestino;
    private Integer idMaterial;
    private Double qntMaterial;
    private Date horaDeSaida;
    
    @ManyToOne
    @JoinColumn(name= "prefeitura_id")
    private Prefeitura prefeitura;
    
    @ManyToOne
    @JoinColumn(name= "lixeiro_id")
    private Lixeiro lixeiro;
    
    @ManyToOne
    @JoinColumn(name = "motorista_id")
    private Motorista motorista;
    
    public Rota(){
        this.id = -1;
        this.pontoDeDestino = "";
        this.pontoDeOrigem = "";
        this.idMaterial = -1;
        this.horaDeSaida = new Date();
        this.qntMaterial = 0.0;
    }
}
