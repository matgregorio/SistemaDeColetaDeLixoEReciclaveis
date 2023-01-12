/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import model.Login;
import model.Prefeitura;
import model.dao.LoginDao;
import model.dao.PrefeituraDao;
import model.exceptions.LixeiroException;
import model.valid.ValidatePrefeitura;

/**
 *
 * @author mateu
 */
public class PrefeituraController {
    private PrefeituraDao repositorio;
    private LoginDao repositorioLogin;
    
    public PrefeituraController(){
        repositorio = new PrefeituraDao();
        repositorioLogin = new LoginDao();
    }
    
    public void cadastrarPrefeitura(int id,String nome, String email,
            String cnpj, String cidade, String senha,
            String telefone){
        ValidatePrefeitura valid = new ValidatePrefeitura();
        Prefeitura novaPrefeitura = valid.validaCamposEntrada(nome, email, cnpj, cidade, telefone);
        if(repositorio.findByCnpj(novaPrefeitura.getCnpj()) != null){
            throw new LixeiroException("ERROR - JA EXISTE PREFEITURA COM ESSE CNPJ.");
        }else{
            repositorio.save(novaPrefeitura);
            int ultimoId = repositorio.ultimoRegistro();
            Login login = new Login();
            login.setCpf(cnpj);
            login.setSenha(senha);
            login.setTipoDeUsuario(3);
            login.setId_usuario(ultimoId);
            repositorioLogin.save(login);
            
        }
        
    }
    
    public void atualizarPrefeitura(int id,String nome, String email,
            String cnpj, String cidade, String telefone){
            ValidatePrefeitura valid = new ValidatePrefeitura();
            Prefeitura novaPrefeitura = valid.validaCamposEntrada(nome, email, cnpj, cidade, telefone);
            novaPrefeitura.setId(id);
            repositorio.save(novaPrefeitura);
        
    }
    
    public void atualizarTabela(JTable grd){
        Util.jTableShow(grd, new TMCadPrefeitura((List<Prefeitura>) repositorio.findAll()), null);
    }
    
    public void excluirPrefeitura(Prefeitura prefeitura){
        if(prefeitura != null){
            repositorio.delete(prefeitura);
        }else{
            throw new LixeiroException("ERROR - LIXEIRO INEXISTENTE");
        }
    }
}
