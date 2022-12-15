/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import factory.Database;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Prefeitura;

/**
 *
 * @author mateu
 */
public class PrefeituraDao {
    EntityManager entityManager;
    
    Query qry;
    String sql;
    
    public PrefeituraDao(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    public void save(Prefeitura prefeitura){
        this.entityManager.getTransaction().begin();
        if(prefeitura != null && prefeitura.getId() > 0){
           this.entityManager.merge(prefeitura);
        }else{
            this.entityManager.persist(prefeitura);
        }
        this.entityManager.getTransaction().commit();
    }
    
    public void delete(Prefeitura prefeitura){
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(prefeitura);
        this.entityManager.getTransaction().commit();
    }
    
    public int ultimoRegistro(){
        List<Prefeitura> lst = this.findAll();
        int tamanhoLista = lst.size() - 1;
        Prefeitura ultimoLixeiro = lst.get(tamanhoLista);
        return ultimoLixeiro.getId();
    }
    
    public Prefeitura find(int id){
        sql = " SELECT p "
                + " FROM Prefeitura p"
                + " WHERE id = :id ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        if(lst.isEmpty()){
            return null;
        }else{
            return (Prefeitura) lst.get(0);
        }              
    }
    
    public List<Prefeitura> findAll(){
        sql = " SELECT p "
                + " FROM Prefeitura p ";
        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        
            return (List<Prefeitura>) lst;
    }
    
    public Prefeitura findByCnpj(String cnpj){
        sql = " SELECT p "
                + " FROM Prefeitura p "
                + " WHERE cnpj like :cnpj ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("cnpj" , cnpj);
        
        List lst = qry.getResultList();
        
        if(lst.isEmpty()){
            return null;
        }else{
            return (Prefeitura) lst.get(0);
        }
    }
}
