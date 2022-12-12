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
import model.dao.LoginDao;
import model.exceptions.LixeiroException;
import model.valid.ValidateLixeiro;

/**
 *
 * @author mateus
 */
public class LixeiroController {
    private LixeiroDao repositorio;
    private LoginDao repositorioLogin;
    
    public LixeiroController(){
        repositorio = new LixeiroDao();
        repositorioLogin = new LoginDao();
    }
    
    public void cadastrarLixeiro(int id,String nome, String email,
            String cpf, String sexo, Date dataNascimento, 
            Double remuneracaoMensal, Date horaInicio, Date horaFim, String senha/*,
            ArrayList diasTrabalhados/*/){
        ValidateLixeiro valid = new ValidateLixeiro();
        Lixeiro novoLixeiro = valid.validaCamposEntrada(nome, cpf, email, sexo, dataNascimento, 
                remuneracaoMensal, horaInicio, horaFim/*,diasTrabalhados*/);
        //if(repositorio.findByCpf(novoLixeiro.getEmail()) != null){
            //throw new LixeiroException("ERROR - JA EXISTE LIXEIRO COM ESSE CPF.");
        //}else{
            repositorio.save(novoLixeiro);
            int ultimoId = repositorio.ultimoRegistro();
            Login login = new Login();
            login.setCpf(cpf);
            login.setSenha(senha);
            login.setTipoDeUsuario(1);
            login.setId_usuario(ultimoId);
            repositorioLogin.save(login);
            
        //}
        
    }
    
    public void atualizarLixeiro(int idLixeiro,String nome, String email,
            String cpf, String sexo, Date dataNascimento, 
            Double remuneracaoMensal, Date horaInicio, Date horaFim,
            ArrayList diasTrabalhados){
            ValidateLixeiro valid = new ValidateLixeiro();
            Lixeiro novoLixeiro = valid.validaCamposEntrada(nome, cpf, email,  sexo,dataNascimento, 
             remuneracaoMensal, horaInicio,  horaFim/*,  diasTrabalhados*/);
            novoLixeiro.setId(idLixeiro);
            repositorio.save(novoLixeiro);
        
    }
    
    public void atualizarTabela(JTable grd){
        Util.jTableShow(grd, new TMCadLixeiro((List<Lixeiro>) repositorio.findAll()), null);
    }
    
    public void excluirLixeiro(Lixeiro lixeiro){
        if(lixeiro != null){
            repositorio.delete(lixeiro);
        }else{
            throw new LixeiroException("ERROR - LIXEIRO INEXISTENTE");
        }
    }
}
