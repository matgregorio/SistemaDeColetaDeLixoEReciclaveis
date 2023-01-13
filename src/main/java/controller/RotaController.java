/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import model.Deposito;
import model.Lixeiro;
import model.Material;
import model.Motorista;
import model.Prefeitura;
import model.Rota;
import model.dao.PrefeituraDao;
import model.dao.RotaDao;
import model.exceptions.RotaException;
import model.valid.ValidateRota;

/**
 *
 * @author Mateus
 */
public class RotaController {
    private RotaDao repositorio;
    private PrefeituraDao repositorioPrefeitura;
    
    
    public RotaController(){
        repositorio = new RotaDao();
        repositorioPrefeitura = new PrefeituraDao();
    }
    
    public void cadastrarRota(int id,String origem, Deposito deposito, Material material,
            Double quantidadeMaterial,Date data,Lixeiro lixeiro, Motorista motorista, int idPrefeitura){
        ValidateRota valid = new ValidateRota();
        Prefeitura prefeitura = repositorioPrefeitura.find(idPrefeitura);
        Rota rotaNova = valid.validaCamposEntrada(origem, deposito, material, quantidadeMaterial, data, lixeiro, motorista, prefeitura);
        repositorio.save(rotaNova);  
    }
    
    public void atualizarRota(int id,String origem, Deposito deposito, Material material,
            Double quantidadeMaterial,Date data,Lixeiro lixeiro, Motorista motorista, int idPrefeitura){
        ValidateRota valid = new ValidateRota();
        Prefeitura prefeitura = repositorioPrefeitura.find(idPrefeitura);
        Rota rotaNova = valid.validaCamposEntrada(origem, deposito, material, quantidadeMaterial, data, lixeiro, motorista, prefeitura);
        rotaNova.setId(id);
        repositorio.save(rotaNova);
    }
    
    public void atualizarTabela(JTable grd, int idPrefeitura){
        Util.jTableShow(grd, new TMCadRota((List<Rota>) repositorio.findAll(idPrefeitura)), null);
    }
    
    public void excluirRota(Rota rota){
        if(rota != null){
            repositorio.delete(rota);
        }else{
            throw new RotaException("ERROR - ROTA INEXISTENTE");
        }
    }
    
    public List<Rota> atualizaRotas(int idPrefeitura){
        return repositorio.findAll(idPrefeitura);
    }
}
