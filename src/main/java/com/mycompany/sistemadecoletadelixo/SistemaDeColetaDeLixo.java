/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemadecoletadelixo;

import model.lixeiros;

/**
 *
 * @author mateus
 */
public class SistemaDeColetaDeLixo {

    public static void main(String[] args) {
        lixeiros l = new lixeiros();
        
        // So para testar as classes abstratas
        System.out.println("Imprimindo dados");
        System.out.println(l.getCpf());
        System.out.println(l.getDataNascimento());
        System.out.println(l.getNome());
        System.out.println(l.getRemuneracaoMensal());
        System.out.println(l.getDataNascimento());
    }
}
