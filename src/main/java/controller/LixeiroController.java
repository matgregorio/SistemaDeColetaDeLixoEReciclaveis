/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import model.dao.LixeiroDao;
import model.Lixeiro;
import model.Login;
import model.Prefeitura;
import model.dao.LoginDao;
import model.dao.PrefeituraDao;
import model.exceptions.LixeiroException;
import model.valid.ValidateLixeiro;

/**
 *
 * @author mateus
 */
public class LixeiroController {
    private LixeiroDao repositorio;
    private LoginDao repositorioLogin;
    private PrefeituraDao repositorioPrefeitura;
    
    public LixeiroController(){
        repositorio = new LixeiroDao();
        repositorioLogin = new LoginDao();
        repositorioPrefeitura = new PrefeituraDao();
    }
    
    public void cadastrarLixeiro(int id,String nome, String email,
            String cpf, String sexo, Date dataNascimento, 
            Double remuneracaoMensal, Date horaInicio, Date horaFim, String senha,
            ArrayList diasTrabalhados,int idPrefeitura){
        ValidateLixeiro valid = new ValidateLixeiro();
        Prefeitura prefeitura = repositorioPrefeitura.find(idPrefeitura);
        Lixeiro novoLixeiro = valid.validaCamposEntrada(nome, cpf, email, sexo, dataNascimento, 
                remuneracaoMensal, horaInicio, horaFim,diasTrabalhados, prefeitura);
        if(repositorio.findByCpf(novoLixeiro.getCpf()) != null){
            throw new LixeiroException("ERROR - JA EXISTE LIXEIRO COM ESSE CPF.");
        }else{
            repositorio.save(novoLixeiro);
            int ultimoId = repositorio.ultimoRegistro(idPrefeitura);
            Login login = new Login();
            login.setCpf(cpf);
            login.setSenha(senha);
            login.setTipoDeUsuario(1);
            login.setId_usuario(ultimoId);
            repositorioLogin.save(login);
        }
        
    }
    
    public void atualizarLixeiro(int idLixeiro,String nome, String email,
            String cpf, String sexo, Date dataNascimento, 
            Double remuneracaoMensal, Date horaInicio, Date horaFim,
            ArrayList diasTrabalhados, int idPrefeitura){
            ValidateLixeiro valid = new ValidateLixeiro();
            Prefeitura prefeitura = repositorioPrefeitura.find(idPrefeitura);
            Lixeiro novoLixeiro = valid.validaCamposEntrada(nome, cpf, email,  sexo,dataNascimento, 
             remuneracaoMensal, horaInicio,  horaFim,  diasTrabalhados, prefeitura);
            novoLixeiro.setId(idLixeiro);
            repositorio.save(novoLixeiro);
        
    }
    
    public void atualizarTabela(JTable grd, int idPrefeitura){
        Util.jTableShow(grd, new TMCadLixeiro((List<Lixeiro>) repositorio.findAll(idPrefeitura)), null);
    }
    
    public void excluirLixeiro(Lixeiro lixeiro){
        if(lixeiro != null){
            repositorio.delete(lixeiro);
        }else{
            throw new LixeiroException("ERROR - LIXEIRO INEXISTENTE");
        }
    }
    
    public List<Lixeiro> atualizaLixeiros(int idPrefeitura){
        return repositorio.findAll(idPrefeitura);
    }
}
