/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author mateus
 */
public class lixeiros extends funcionario{
    public lixeiros(){
        super.setNome("");
        super.setEmail("");
        super.setCpf("");
        super.setDataNascimento(new Date());
        super.setSexo("");
        super.setRemuneracaoMensal(0);
    }
}
