/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author mateus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
abstract public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String sexo;
    private Date dataNascimento;
    private String senha;
}
