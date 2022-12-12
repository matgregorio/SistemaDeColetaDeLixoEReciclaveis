/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import factory.Database;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Login;

/**
 *
 * @author mateu
 */
public class LoginDao {
    EntityManager entityManager;
    
    Query qry;
    String sql;
    
    public LoginDao(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    public void save(Login login){
        this.entityManager.getTransaction().begin();
        if(login != null && login.getId() > 0){
           this.entityManager.merge(login);
        }else{
            this.entityManager.persist(login);
        }
        this.entityManager.getTransaction().commit();
    }
    
    public void delete(Login login){
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(login);
        this.entityManager.getTransaction().commit();
    }
    
    public Login find(String cpf, String senha){
        //13074586613
        //RXz8DDBt
        sql = " SELECT l "
                + " FROM Login l "
                + " WHERE cpf LIKE :cpf "
                + " AND senha LIKE :senha ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("cpf", cpf);
        qry.setParameter("senha", senha);
        
        List lst = qry.getResultList();
        if(lst.isEmpty()){
            return null;
        }else{
            return (Login) lst.get(0);
        }              
    }
}
