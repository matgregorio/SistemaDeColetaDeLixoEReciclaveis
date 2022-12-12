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
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author mateus
 */
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@AllArgsConstructor
@Getter
@Setter
public class Lixeiro implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private String sexo;
    private double remuneracaoMensal;
    private Date dataNascimento;
    private Date horaDeEntrada;
    private Date horaDeSaida;
    
    public Lixeiro(){
        this.id = -1;
        this.nome = "";
        this.cpf = "";
        this.email = "";
        this.sexo = "";
        this.remuneracaoMensal = 0.0;
        this.dataNascimento = new Date();
        this.horaDeEntrada = new Date();
        this.horaDeSaida = new Date();
    }
}
