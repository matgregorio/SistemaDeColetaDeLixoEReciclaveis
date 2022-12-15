/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import model.Material;
import model.dao.MaterialDao;
import model.exceptions.MaterialException;
import model.valid.ValidateMaterial;

/**
 *
 * @author mateu
 */
public class MaterialController {
    private MaterialDao repositorio;
    
    public MaterialController(){
        repositorio = new MaterialDao();
    }
    
    public void cadastrarMaterial(int id,String nome, String descricao, String unidadeDeMedida, boolean materialReciclavel, int codigoMaterial){
        ValidateMaterial valid = new ValidateMaterial();
        Material novoMaterial = valid.validaCamposEntrada(nome,descricao,unidadeDeMedida,materialReciclavel,codigoMaterial);
        if(repositorio.findByCodigo(novoMaterial.getCodigoMaterial()) != null){
            throw new MaterialException("ERROR - JA EXISTE MATERIAL COM ESSE CODIGO.");
        }else{
            repositorio.save(novoMaterial);
        }
        
    }
    
    public void atualizarMaterial(int idMaterial,String nome, String descricao, String unidadeDeMedida, boolean materialReciclavel, int codigoMaterial){
            ValidateMaterial valid = new ValidateMaterial();
            Material novoMaterial = valid.validaCamposEntrada(nome,descricao,unidadeDeMedida,materialReciclavel,codigoMaterial);
            novoMaterial.setId(idMaterial);
            repositorio.save(novoMaterial);
        
    }
    
    public void atualizarTabela(JTable grd){
        Util.jTableShow(grd, new TMCadMaterial((List<Material>) repositorio.findAll()), null);
    }
    
    public void excluirLixeiro(Material material){
        if(material != null){
            repositorio.delete(material);
        }else{
            throw new MaterialException("ERROR - LIXEIRO INEXISTENTE");
        }
    }
}
