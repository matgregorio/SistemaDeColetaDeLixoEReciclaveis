/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.email;

import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author mateu
 */
public class LixeiroEmail {
    public LixeiroEmail(String nome, String emailUsuario, String cpf, String senha){    
    
        
    String EmailRemetente = "mailColetaDeLixo@gmail.com";
        String senhaEmailRemetente = "qxdvdtyjaztzcjgt";
        
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthentication(EmailRemetente, senhaEmailRemetente);
        email.setSSLOnConnect(true);
        
        try{
            email.setFrom(EmailRemetente);
            email.setSubject("Seus dados de login para acessar o sistema");
            email.setMsg("Seja bem-vindo ao nosso sistema, " + nome + ". Segue abaixo seus dados de login: \n CPF: " 
                    + cpf + "\n Senha: " + senha + "");
            email.addTo(EmailRemetente);
            email.send();
            System.out.println("Email foi enviado com sucesso");
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
