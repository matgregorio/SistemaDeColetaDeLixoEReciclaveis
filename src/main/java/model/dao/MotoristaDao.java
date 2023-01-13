/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import factory.Database;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Motorista;

/**
 *
 * @author mateu
 */
public class MotoristaDao {
    EntityManager entityManager;
    
    Query qry;
    String sql;
    
    public MotoristaDao(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    public void save(Motorista motorista){
        this.entityManager.getTransaction().begin();
        if(motorista != null && motorista.getId() > 0){
            this.entityManager.merge(motorista);
        }else{
            this.entityManager.persist(motorista);
        }
        this.entityManager.getTransaction().commit();
    }
    
    public void delete(Motorista motorista){
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(motorista);
        this.entityManager.getTransaction().commit();
    }
    
    public int ultimoRegistro(int idPrefeitura){
        List<Motorista> lst = this.findAll(idPrefeitura);
        int tamanhoLista = lst.size() - 1;
        Motorista ultimoMotorista = lst.get(tamanhoLista);
        return ultimoMotorista.getId();
    }
    
    public Motorista find(int id){
        sql = " SELECT l "
                + " FROM Motorista l"
                + " WHERE id = :id ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        if(lst.isEmpty()){
            return null;
        }else{
            return (Motorista) lst.get(0);
        }              
    }
    
    public List<Motorista> findAll(int idPrefeitura){
        sql = " SELECT M "
                + " FROM Motorista M "
                + " WHERE Prefeitura_id = :idPrefeitura";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("idPrefeitura", idPrefeitura);
        
        List lst = qry.getResultList();
        
        return (List<Motorista>) lst;
    }
    
    public Motorista findByCpf(String cpf){
        sql = " SELECT motorista "
                + " FROM Motorista motorista"
                + " WHERE cpf like :cpf";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("cpf" , cpf);
        
        List lst = qry.getResultList();
        
        if(lst.isEmpty()){
            return null;
        }else{
            return (Motorista) lst.get(0);
        }
    }
}
