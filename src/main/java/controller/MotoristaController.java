/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import model.Login;
import model.Motorista;
import model.dao.MotoristaDao;
import model.exceptions.MotoristaException;
import model.valid.ValidateMotorista;

/**
 *
 * @author mateu
 */
public class MotoristaController {
    private MotoristaDao repositorio;
    
    public MotoristaController(){
        repositorio = new MotoristaDao();
    }
    public void cadastrarMotorista(int id,String nome, String email,
            String cpf, String sexo, Date dataNascimento, 
            Double remuneracaoMensal, Date horaInicio, Date horaFim, String tipoDeCarteira, String senha/*,
            ArrayList diasTrabalhados/*/){
        ValidateMotorista valid = new ValidateMotorista();
        Motorista novoMotorista = valid.validaCamposEntrada(nome, cpf, email, sexo, dataNascimento, 
                remuneracaoMensal, horaInicio, horaFim,tipoDeCarteira/*,diasTrabalhados*/);
        if(repositorio.findByCpf(novoMotorista.getCpf()) != null){
            throw new MotoristaException("ERROR - JA EXISTE MOTORISTA COM ESSE CPF.");
        }else{
            repositorio.save(novoMotorista);
            int ultimoId = repositorio.ultimoRegistro();
            Login login = new Login();
            login.setCpf(cpf);
            login.setSenha(senha);
            login.setTipoDeUsuario(2);
            login.setId_usuario(ultimoId);
        }
        
    }
    
    public void atualizarMotorista(int idMotorista,String nome, String email,
            String cpf, String sexo, Date dataNascimento, 
            Double remuneracaoMensal, Date horaInicio, Date horaFim,String tipoDeCarteira
            /*ArrayList diasTrabalhados*/){
            ValidateMotorista valid = new ValidateMotorista();
            Motorista novoMotorista = valid.validaCamposEntrada(nome, cpf, email,  sexo,dataNascimento, 
             remuneracaoMensal, horaInicio,  horaFim, tipoDeCarteira/*,  diasTrabalhados*/);
            novoMotorista.setId(idMotorista);
            repositorio.save(novoMotorista);
        
    }
    
    public void atualizarTabela(JTable grd){
        Util.jTableShow(grd, new TMCadMotorista((List<Motorista>) repositorio.findAll()), null);
    }
    
    public void excluirMotorista(Motorista motorista){
        if(motorista != null){
            repositorio.delete(motorista);
        }else{
            throw new MotoristaException("ERROR - MOTORISTA INEXISTENTE");
        }
    }
}
