/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@AllArgsConstructor
@Getter
@Setter
public class Deposito implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    
    @ManyToOne
    @JoinColumn(name= "prefeitura_id")
    private Prefeitura prefeitura;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="deposito_material", joinColumns = 
            {@JoinColumn(name="deposito_id")},inverseJoinColumns=
                    {@JoinColumn(name="material_id")})
       //@ManyToMany(mappedBy = "deposito")
    private List<Material> material;
    
    public Deposito(){
        this.id = -1;
        this.nome = "";
    }
}
