/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.valid;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import model.Lixeiro;
import model.Prefeitura;
import model.exceptions.LixeiroException;
import model.exceptions.PrefeituraException;

/**
 *
 * @author mateu
 */
public class ValidatePrefeitura {

    public static boolean validCnpj(String CNPJ) {
        // considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111")
                || CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333")
                || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
                || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777")
                || CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999")
                || (CNPJ.length() != 14)) {
            return (false);
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

// "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
// converte o i-ésimo caractere do CNPJ em um número:
// por exemplo, transforma o caractere '0' no inteiro 0
// (48 eh a posição de '0' na tabela ASCII)
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }

// Verifica se os dígitos calculados conferem com os dígitos informados.
            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }
    
    public Prefeitura validaCamposEntrada(String nome,String email,String cnpj,String cidade,String telefone){
        Prefeitura prefeitura = new Prefeitura();
        
        //PARTE QUE VERIFICA CAMPO DE NOME
        if(nome.isEmpty()){
            throw new PrefeituraException("ERROR - Campo vazio: 'Nome'.");
        }
        prefeitura.setNome(nome);
        
        //PARTE QUE VERIFICA CAMPO DE CPF
        if(cnpj.isEmpty()){
            throw new PrefeituraException("ERROR - Campo vazio: 'CNPJ'.");
        }
        prefeitura.setCnpj(cnpj);
        
        //PARTE QUE VERIFICA CAMPO DE EMAIL
        if(email.isEmpty()){
            throw new PrefeituraException("ERROR - Campo vazio: 'Email'.");
        }
        prefeitura.setEmail(email);
        prefeitura.setDataDeCadastro(new Date());

       //PARTE QUE VERIFICA O CAMPO DE TELEFONE
       if(telefone.isEmpty()){
           throw new PrefeituraException("ERROR - Campo vazio: 'Telefone'");
       }
       prefeitura.setTelefone(telefone);
        
        return prefeitura;
        
    }
}
