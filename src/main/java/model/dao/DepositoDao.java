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
import model.Deposito;

/**
 *
 * @author Mateus
 */
public class DepositoDao {
    EntityManager entityManager;
    
    Query qry;
    String sql;
    
    public DepositoDao(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    public void save(Deposito deposito){
        this.entityManager.getTransaction().begin();
        if(deposito != null && deposito.getId() > 0){
            this.entityManager.merge(deposito);
        }else{
            this.entityManager.persist(deposito);
        }
        this.entityManager.getTransaction().commit();
    }
    
    public void delete(Deposito deposito){
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(deposito);
        this.entityManager.getTransaction().commit();
    }
    
    public Deposito find(int id){
        sql = "SELECT d "
                + " FROM Deposito d "
                + " WHERE id = :id ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("id", id);
        List lst = qry.getResultList();
        if(lst.isEmpty()){
            return null;
        }else{
            return (Deposito) lst.get(0);
        }
    }
////      public void tentativa(int idMaterial){
////          sql = " SELECT m "
////                  + " FROM material m "
////                  + " WHERE id = :idMaterial";
////          qry = this.entityManager.createQuery(sql);
////          qry.setParameter("idMaterial", idMaterial);
////          @SuppressWarnings("unchecked")
////          List<Deposito> lstDeposito = qry.getResultList();
////          sql = " SELECT "
////      }
//    public List<Deposito> findForMaterial(int idMaterial, int idPrefeitura){
//        sql = " SELECT d "
//                + " FROM material d "
//                + " WHERE material_id = :idMaterial ";
//        qry = this.entityManager.createQuery(sql);
//        qry.setParameter("idMaterial", idMaterial);
//        List lst = qry.getResultList();
//        List depositos = new ArrayList();
//        for(int i = 0;i < lst.size(); i++){
//           int idDeposito = (int) lst.get(i);
//           sql = " SELECT d "
//                   + " FROM Deposito d "
//                   + " WHERE id = :idDeposito "
//                   + " AND prefeitura_id = :idPrefeitura ";
//           qry = this.entityManager.createQuery(sql);
//           qry.setParameter("idDeposito", idDeposito);
//           qry.setParameter("idPrefeitura", idPrefeitura);
//           List lst2 = qry.getResultList();
//           depositos.add(lst2.get(0));
//        }
//        return (List<Deposito>) depositos;
//    }
    
    public List<Deposito> findAll(int idPrefeitura){
        sql = " SELECT d "
                + " FROM Deposito d "
                + " WHERE prefeitura_id = :idPrefeitura ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("idPrefeitura", idPrefeitura);
        
        List lst = qry.getResultList();
        
        return (List<Deposito>) lst;
    }
}
