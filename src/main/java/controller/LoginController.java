/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.security.auth.login.LoginException;
import model.Login;
import model.dao.LoginDao;
/**
 *
 * @author mateu
 */
public class LoginController {
    private LoginDao repositorio;
    
    public LoginController(){
        repositorio = new LoginDao();
    }
    
    public Login findLogin(String cpf, String senha) throws LoginException{
        Login loginNovo = repositorio.find(cpf, senha);
        if(repositorio.find(cpf, senha) == null){
            throw new LoginException("Erro! CPF OU SENHA INVALIDOS");
        }
        return loginNovo;
    }
}
