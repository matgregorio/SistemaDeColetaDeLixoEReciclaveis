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
import model.Prefeitura;
import model.dao.LoginDao;
import model.dao.MotoristaDao;
import model.dao.PrefeituraDao;
import model.exceptions.MotoristaException;
import model.valid.ValidateMotorista;

/**
 *
 * @author mateu
 */
public class MotoristaController {

    private MotoristaDao repositorio;
    private LoginDao repositorioLogin;
    private PrefeituraDao repositorioPrefeitura;

    public MotoristaController() {
        repositorio = new MotoristaDao();
        repositorioLogin = new LoginDao();
        repositorioPrefeitura = new PrefeituraDao();
    }

    public void cadastrarMotorista(int id, String nome, String email,
            String cpf, String sexo, Date dataNascimento,
            Double remuneracaoMensal, Date horaInicio, Date horaFim, String tipoDeCarteira, String senha/*,
            ArrayList diasTrabalhados/*/, int idPrefeitura) {
        ValidateMotorista valid = new ValidateMotorista();
        Prefeitura prefeitura = repositorioPrefeitura.find(idPrefeitura);
        Motorista novoMotorista = valid.validaCamposEntrada(nome, cpf, email, sexo, dataNascimento,
                remuneracaoMensal, horaInicio, horaFim, tipoDeCarteira/*,diasTrabalhados*/, prefeitura);
        if (repositorio.findByCpf(novoMotorista.getCpf()) != null) {
            throw new MotoristaException("ERROR - JA EXISTE MOTORISTA COM ESSE CPF.");
        } else {
            repositorio.save(novoMotorista);
            int ultimoId = repositorio.ultimoRegistro(idPrefeitura);
            Login login = new Login();
            login.setCpf(cpf);
            login.setSenha(senha);
            login.setTipoDeUsuario(2);
            login.setId_usuario(ultimoId);
            repositorioLogin.save(login);
        }

    }

    public void atualizarMotorista(int idMotorista, String nome, String email,
            String cpf, String sexo, Date dataNascimento,
            Double remuneracaoMensal, Date horaInicio, Date horaFim, String tipoDeCarteira /*ArrayList diasTrabalhados*/,
             int idPrefeitura) {
        ValidateMotorista valid = new ValidateMotorista();
        Prefeitura prefeitura = repositorioPrefeitura.find(idPrefeitura);
        Motorista novoMotorista = valid.validaCamposEntrada(nome, cpf, email, sexo, dataNascimento,
                remuneracaoMensal, horaInicio, horaFim, tipoDeCarteira/*,  diasTrabalhados*/, prefeitura);
        novoMotorista.setId(idMotorista);
        repositorio.save(novoMotorista);

    }

    public void atualizarTabela(JTable grd, int idPrefeitura) {
        Util.jTableShow(grd, new TMCadMotorista((List<Motorista>) repositorio.findAll(idPrefeitura)), null);
    }

    public List<Motorista> atualizaMotoristas(int idPrefeitura) {
        return repositorio.findAll(idPrefeitura);
    }

    public void excluirMotorista(Motorista motorista) {
        if (motorista != null) {
            repositorio.delete(motorista);
        } else {
            throw new MotoristaException("ERROR - MOTORISTA INEXISTENTE");
        }
    }
}
