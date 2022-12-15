/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.valid;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import model.Material;
import model.exceptions.MaterialException;

/**
 *
 * @author mateu
 */
public class ValidateMaterial {
    public Material validaCamposEntrada(String nome, String descricao, String unidadeDeMedida, boolean materialReciclavel, int codigoMaterial){
        Material material = new Material();
        
        //PARTE QUE VERIFICA CAMPO DE NOME
        if(nome.isEmpty()){
            throw new MaterialException("ERROR - Campo vazio: 'Nome'.");
        }
        material.setNome(nome);
        material.setDescricao(descricao);
        
        //PARTE QUE VERIFICA CAMPO DE EMAIL
        if(unidadeDeMedida.isEmpty()){
            throw new MaterialException("ERROR - Campo vazio: 'Unidade de Medida'.");
        }
        material.setUnidadeDeMedida(unidadeDeMedida);
        material.setMaterialReciclavel(materialReciclavel);
        material.setCodigoMaterial(codigoMaterial);
        
        
        return material;
        
    }
}
