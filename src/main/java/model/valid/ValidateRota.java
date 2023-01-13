/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.valid;

import java.util.Date;
import model.Deposito;
import model.Lixeiro;
import model.Material;
import model.Motorista;
import model.Prefeitura;
import model.Rota;
import model.exceptions.RotaException;

/**
 *
 * @author Mateus
 */
public class ValidateRota {
    public Rota validaCamposEntrada(String origem, Deposito deposito, Material material,
            Double quantidadeMaterial,Date data,Lixeiro lixeiro, Motorista motorista, Prefeitura prefeitura){
        Rota rota = new Rota();
        if(origem.isEmpty()){
            throw new RotaException("ERROR - Campo vazio: 'Origem'");
        }
        rota.setPontoDeOrigem(origem);
        rota.setDeposito(deposito);
        rota.setMaterial(material);
        if(quantidadeMaterial.isNaN()){
            throw new RotaException("ERROR - Valor invalido: 'Quantidade Material'");
        }
        rota.setQntMaterial(quantidadeMaterial);
        rota.setDataRota(data);
        rota.setLixeiro(lixeiro);
        rota.setMotorista(motorista);
        rota.setPrefeitura(prefeitura);
        return rota;
    }
}
