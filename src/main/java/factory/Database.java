/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mateus
 */
public class Database {
    private EntityManager entityManager;
    
    private static Database INSTANCE = null;
    
    public static Database getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Database();
        }
        
        return INSTANCE;
    }
    
    private Database(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dbColetaDeLixo");
        this.entityManager = factory.createEntityManager();
    }
    
    public EntityManager getEntityManager(){
        return entityManager;
    }
}
