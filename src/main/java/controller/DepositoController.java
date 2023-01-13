/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import model.Deposito;
import model.Prefeitura;
import model.dao.DepositoDao;
import model.dao.PrefeituraDao;
import model.exceptions.DepositoException;
import model.valid.ValidateDeposito;

/**
 *
 * @author Mateus
 */
public class DepositoController {
    private PrefeituraDao repositorioPrefeitura;
    private DepositoDao repositorio;
    
    public DepositoController(){
        repositorio = new DepositoDao();
        repositorioPrefeitura = new PrefeituraDao();
    }
    
    public void cadastrarDeposito(int id, String nome, ArrayList materiais, int idPrefeitura){
        ValidateDeposito valid = new ValidateDeposito();
        Prefeitura prefeitura = repositorioPrefeitura.find(idPrefeitura);
        Deposito novoDeposito = valid.validaCamposEntrada(nome, materiais, prefeitura);
        repositorio.save(novoDeposito);
    }
    
    public void atualizarDeposito(int id, String nome, ArrayList materiais, int idPrefeitura){
        ValidateDeposito valid = new ValidateDeposito();
        Prefeitura prefeitura = repositorioPrefeitura.find(idPrefeitura);
        Deposito novoDeposito = valid.validaCamposEntrada(nome, materiais, prefeitura);
        novoDeposito.setId(id);
        repositorio.save(novoDeposito);
    }
    
    public void atualizarTabela(JTable grd, int idPrefeitura){
        Util.jTableShow(grd, new TMCadDeposito((List<Deposito>)repositorio.findAll(idPrefeitura)), null);
    }
    
    public void excluirDeposito(Deposito deposito){
        if(deposito != null){
            repositorio.delete(deposito);
        }else{
            throw new DepositoException("ERROR - DEPOSITO INEXISTENTE");
        }
    }
    
    public List<Deposito> atualizaDepositos(int idPrefeitura){
        return repositorio.findAll(idPrefeitura);
    }
}
