/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.dao;

import java.util.List;

/**
 *
 * @author mateus
 */
public interface IDao {
        public void save(Object obj);
        
        public boolean delete(Object obj);
        
        public Object find(Object obj);
        
        public List<Object> findAll();
}
