/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.valid;

import java.util.Calendar;
import java.util.Date;
import model.Motorista;
import model.exceptions.MotoristaException;

/**
 *
 * @author mateu
 */
public class ValidateMotorista {
    public static boolean validCPF(String cpf){
         //vamos verificar o tamanho primeiro        
        if(cpf.length() != 11  && cpf.length() != 14){
            throw new MotoristaException("CPF inválido -  Tamanho inválido.");
        }
        
        //Retira os caracteres deixando apenas digitos
        if(cpf.length() == 14){
            cpf = cpf.replaceAll("\\.", "");
            cpf = cpf.replaceAll("-", "");
        }
        
        //se tem tamanho 11 e so possui digitos
        if(cpf.length() == 11 && cpf.matches("[0-9]*")){
            String []vet = cpf.split("");                        
            
            int digito1 = Integer.parseInt(vet[9]);
            int digito2 = Integer.parseInt(vet[10]);
            
            //vamos calcular o primeiro verificador
            int soma1 = 0;
            int fator1 = 10;
            for(int i=0; i <=8; i++){
                int val = Integer.parseInt(vet[i]);
                soma1 = soma1 + (fator1 * val);                 
                fator1--;                
            }
            
            int resultado1 = (soma1*10)%11;
            if(resultado1==10)
                resultado1 = 0;
            
            if(resultado1 != digito1){
                return false;
            }
            
            //vamos calcular o segundo verificador
            int soma2 = 0;
            int fator2 = 11;
            for(int i=0; i <= 9; i++){
                int val = Integer.parseInt(vet[i]);
                soma2 = soma2 + (fator2 * val);
                fator2--;
            }
                                   
            int resultado2 = (soma2*10)%11;
            if(resultado2 == 10)
                resultado2 = 0;
            
            if(resultado2 != digito2){
               return false;
            }
            
            //agora so basta verificar se todos são iguais
            for(int i=0; i <= 9; i++){
                int val = Integer.parseInt(vet[i]);
                int valProx = Integer.parseInt(vet[i+1]);
                if(val != valProx)
                    return true;
            }
        }
                
        
        return false;
    }
    
    public Motorista validaCamposEntrada(String nome, String cpf, String email, String sexo,Date dataDeNascimento, 
            Double remuneracaoMensal, Date horaDeEntrada, Date horaDeSaida, String tipoDeCarteira/*, ArrayList diasTrabalhados*/){
        Motorista motorista = new Motorista();
        
//        //PARTE QUE VERIFICA CAMPO DE NOME
//        if(nome.isEmpty()){
//            throw new MotoristaException("ERROR - Campo vazio: 'Nome'.");
//        }
        motorista.setNome(nome);
//        
//        //PARTE QUE VERIFICA CAMPO DE CPF
//        if(cpf.isEmpty()){
//            throw new MotoristaException("ERROR - Campo vazio: 'CPF'.");
//        }
        motorista.setCpf(cpf);
//        
//        //PARTE QUE VERIFICA CAMPO DE EMAIL
//        if(email.isEmpty()){
//            throw new MotoristaException("ERROR - Campo vazio: 'Email'.");
//        }
        motorista.setEmail(email);
//        
//        //PARTE QUE VERIFICA CAMPO DE SEXO
//        if(sexo.isEmpty()){
//            throw new MotoristaException("ERROR - Campo vazio: 'Sexo'.");
//        }
        motorista.setSexo(sexo);
//        
//        //PARTE QUE VERIFICA REMUNERACAO MENSAL
//        if(remuneracaoMensal.isNaN()){
//            throw new MotoristaException("ERROR - Campo vazio: 'Remuneração Mensal'.");
//        }
        motorista.setRemuneracaoMensal(remuneracaoMensal);
//        
//        //PARTE QUE VERIFICA DATA DE NASCIMENTO - PARA TRABALHAR, SERA NECESSÁRIO TER AO MENOS 18 ANOS
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.setTime(dataDeNascimento);
        dataNasc.add(Calendar.YEAR, 18);
        Calendar dataAtual = Calendar.getInstance();
        if(dataNasc.before(dataAtual)){
            throw new MotoristaException("ERROR - Data inválida: 'Favor selecionar a data de nascimento correta'");
        }
        motorista.setDataNascimento(dataDeNascimento);
        if(tipoDeCarteira.isEmpty()){
            throw new MotoristaException("ERROR - Campo vazio: 'Tipo de carteira'");
        }
       
        
        //PARTE QUE VERIFICA QUANTAS HORAS O FUNCIONARIO VAI TRABALHAR POR DIA
//        int maxMinTrabalhadosDia = 480;
//        int minTrabalhados = ((horaDeSaida.getHours() * 60) + horaDeSaida.getMinutes()) - ((horaDeEntrada.getHours() * 60) + horaDeEntrada.getMinutes());
//        if(minTrabalhados <= 120){
//            throw new MotoristaException("ERROR - Carga horaria inválida: Favor selecionar carga horária correta!");
//        }else if(maxMinTrabalhadosDia < minTrabalhados){
//            throw new MotoristaException("ERROR - Carga horaria excessiva");
//        }
        motorista.setHoraDeEntrada(horaDeEntrada);
        motorista.setHoraDeSaida(horaDeSaida);
//        
//        
//        //PARTE DOS DIAS QUE O FUNCIONARIO VAI TRABALHAR
//        int contadorDiasTrabalhados = 0;
//        for(int i = 0; i < diasTrabalhados.size(); i++){
//            boolean tOrF = (boolean) diasTrabalhados.get(i);
//            if(tOrF){
//                contadorDiasTrabalhados ++;
//            }
//        }
//        if(contadorDiasTrabalhados < 2){
//            throw new MotoristaException("ERROR - Favor registrar os dias que o lixeiro vai trabalhar!");
//        }
//        motorista.setDiasTrabalhados(diasTrabalhados);
        
        
        return motorista;
        
    }
}
