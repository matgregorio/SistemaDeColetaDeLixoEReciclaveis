/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import factory.Database;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Lixeiro;

/**
 *
 * @author mateus
 */
public class LixeiroDao {
    EntityManager entityManager;
    
    Query qry;
    String sql;
    
    public LixeiroDao(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    public void save(Lixeiro lixeiro){
        this.entityManager.getTransaction().begin();
        if(lixeiro != null && lixeiro.getId() > 0){
           this.entityManager.merge(lixeiro);
        }else{
            this.entityManager.persist(lixeiro);
        }
        this.entityManager.getTransaction().commit();
    }
    
    public void delete(Lixeiro lixeiro){
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(lixeiro);
        this.entityManager.getTransaction().commit();
    }
    
    public int ultimoRegistro(int prefeitura){
        List<Lixeiro> lst = this.findAll(prefeitura);
        int tamanhoLista = lst.size() - 1;
        Lixeiro ultimoLixeiro = lst.get(tamanhoLista);
        return ultimoLixeiro.getId();
    }
    
    public Lixeiro find(int id){
        sql = " SELECT l "
                + " FROM Lixeiro l"
                + " WHERE id = :id ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        if(lst.isEmpty()){
            return null;
        }else{
            return (Lixeiro) lst.get(0);
        }              
    }
    
    public List<Lixeiro> findAll(int idPrefeitura){
        sql = " SELECT l "
                + " FROM Lixeiro l " + 
                " WHERE prefeitura_id = :idPrefeitura ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("idPrefeitura", idPrefeitura);
        
        List lst = qry.getResultList();
        
            return (List<Lixeiro>) lst;
    }
    
    public Lixeiro findByCpf(String cpf){
        sql = " SELECT lixeiro "
                + " FROM Lixeiro lixeiro "
                + " WHERE cpf like :cpf ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("cpf" , cpf);
        
        List lst = qry.getResultList();
        
        if(lst.isEmpty()){
            return null;
        }else{
            return (Lixeiro) lst.get(0);
        }
    }
}
