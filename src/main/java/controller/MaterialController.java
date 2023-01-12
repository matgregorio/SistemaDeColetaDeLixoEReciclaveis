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
import model.Prefeitura;
import model.dao.MaterialDao;
import model.dao.PrefeituraDao;
import model.exceptions.MaterialException;
import model.valid.ValidateMaterial;

/**
 *
 * @author mateu
 */
public class MaterialController {
    private MaterialDao repositorio;
    private PrefeituraDao repositorioPrefeitura;
    
    public MaterialController(){
        repositorio = new MaterialDao();
        repositorioPrefeitura = new PrefeituraDao();
    }
    
    public void cadastrarMaterial(int id,String nome, String descricao, 
            String unidadeDeMedida, boolean materialReciclavel, int codigoMaterial, int idPrefeitura){
        ValidateMaterial valid = new ValidateMaterial();
        Prefeitura prefeitura = repositorioPrefeitura.find(idPrefeitura);
        Material novoMaterial = valid.validaCamposEntrada(nome,descricao,unidadeDeMedida,materialReciclavel,codigoMaterial, prefeitura);
        if(repositorio.findByCodigo(novoMaterial.getCodigoMaterial()) != null){
            throw new MaterialException("ERROR - JA EXISTE MATERIAL COM ESSE CODIGO.");
        }else{
            repositorio.save(novoMaterial);
        }
        
    }
    
    public void atualizarMaterial(int idMaterial,String nome, String descricao, String unidadeDeMedida, boolean materialReciclavel, int codigoMaterial, int idPrefeitura){
            ValidateMaterial valid = new ValidateMaterial();
            Prefeitura prefeitura = repositorioPrefeitura.find(idPrefeitura);
            Material novoMaterial = valid.validaCamposEntrada(nome,descricao,unidadeDeMedida,materialReciclavel,codigoMaterial, prefeitura);
            novoMaterial.setId(idMaterial);
            repositorio.save(novoMaterial);
        
    }
    
    public void atualizarTabela(JTable grd, int idPrefeitura){
        Util.jTableShow(grd, new TMCadMaterial((List<Material>) repositorio.findAll(idPrefeitura)), null);
    }
    
    public List<Material> atualizarListaMateriaisAceitos(int idPrefeitura){
        return repositorio.findAll(idPrefeitura);
    }
    
    public void excluirLixeiro(Material material){
        if(material != null){
            repositorio.delete(material);
        }else{
            throw new MaterialException("ERROR - LIXEIRO INEXISTENTE");
        }
    }
}
