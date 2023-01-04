/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import factory.Database;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Material;

/**
 *
 * @author mateu
 */
public class MaterialDao {
    EntityManager entityManager;
    
    Query qry;
    String sql;
    
    public MaterialDao(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    public void save(Material material){
        this.entityManager.getTransaction().begin();
        if(material != null && material.getId() > 0){
           this.entityManager.merge(material);
        }else{
            this.entityManager.persist(material);
        }
        this.entityManager.getTransaction().commit();
    }
    
    public void delete(Material material){
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(material);
        this.entityManager.getTransaction().commit();
    }
    
    public int ultimoRegistro(){
        List<Material> lst = this.findAll();
        int tamanhoLista = lst.size() - 1;
        Material ultimoLixeiro = lst.get(tamanhoLista);
        return ultimoLixeiro.getId();
    }
    
    public Material find(int id){
        sql = " SELECT m "
                + " FROM Material m"
                + " WHERE id = :id ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        if(lst.isEmpty()){
            return null;
        }else{
            return (Material) lst.get(0);
        }              
    }
    
    public List<Material> findAll(){
        sql = " SELECT m "
                + " FROM Material m ";
        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        
            return (List<Material>) lst;
    }
    
    public Material findByCodigo(int codigoMaterial){
        sql = " SELECT material "
                + " FROM Material material "
                + " WHERE codigoMaterial like :codigoMaterial ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("codigoMaterial" , codigoMaterial);
        
        List lst = qry.getResultList();
        
        if(lst.isEmpty()){
            return null;
        }else{
            return (Material) lst.get(0);
        }
    }
}
