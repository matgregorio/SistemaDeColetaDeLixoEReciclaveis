/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.valid;

import java.util.ArrayList;
import model.Deposito;
import model.Prefeitura;
import model.exceptions.DepositoException;

/**
 *
 * @author Mateus
 */
public class ValidateDeposito {
    public Deposito validaCamposEntrada(String nome, ArrayList materiais,Prefeitura prefeitura){
        Deposito deposito = new Deposito();
        if(nome.isEmpty()){
            throw new DepositoException("ERROR - Campo Vazio: 'Nome'");
        }
        deposito.setNome(nome);
        if(materiais.get(0) == ""){
            throw new DepositoException("ERROR - Selecionar ao menos um material");
        }
        deposito.setMaterial(materiais);
        deposito.setPrefeitura(prefeitura);
        return deposito;
    }
}
