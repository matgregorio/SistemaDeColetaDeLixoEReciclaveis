/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import factory.Database;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Rota;

/**
 *
 * @author Mateus
 */
public class RotaDao {
    EntityManager entityManager;
    
    Query qry;
    String sql;
    
    public RotaDao(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    public void save(Rota rota){
        this.entityManager.getTransaction().begin();
        if(rota != null && rota.getId() > 0){
            this.entityManager.merge(rota);
        }else{
            this.entityManager.persist(rota);
        }
        this.entityManager.getTransaction().commit();
    }
    
    public void delete(Rota rota){
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(rota);
        this.entityManager.getTransaction().commit();
    }
    
    public List<Rota> findAll(int idPrefeitura){
        sql = " SELECT r "
                + " FROM Rota r "
                + " WHERE prefeitura_id = :idPrefeitura ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("idPrefeitura", idPrefeitura);
        
        List lst = qry.getResultList();
        
        return (List<Rota>) lst;
    }
}
