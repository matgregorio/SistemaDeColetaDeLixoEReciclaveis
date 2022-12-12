/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import com.sun.istack.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author mateus
 */
public class Persistencia {
    private static Connection connection = null;
    
    private Persistencia(){
        try{
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:bdTeste.sqlite");
            System.out.println("CONEXAO FEITA COM SUCESSO");
        }catch(ClassNotFoundException ex){
            System.err.println("ERROR AO ABRIR CONEXAO COM O BANCO DE DADOS " + ex.toString());
        }catch(SQLException ex){
            System.err.println("ERROR AO ABRIR CONEXAO COM O BRANCO DE DADOS " + ex.toString());
        }
    }
    
    public static Connection getConnection(){
        if(connection == null){
            new Persistencia();
        }
        return connection;
    }
    
    public static void closeConnection(){
        try{
            connection.close();
            connection = null;
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
