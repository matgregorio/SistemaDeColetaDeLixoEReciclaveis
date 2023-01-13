/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Deposito;

/**
 *
 * @author Mateus
 */
public class TMCadDeposito extends AbstractTableModel{
    private List<Deposito> lista;
    
    private final int COL_NAME = 0;
    private final int COL_MATERIAL = 1;
    
    public TMCadDeposito(List<Deposito> lstDeposito){
        lista = lstDeposito;
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    public String getColumnName(int column){
        switch(column){
            case COL_NAME:
                return "Nome";
            case COL_MATERIAL:
                return "Materiais aceitos";
            default:
                break;
        }
        return null;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Deposito aux = new Deposito();
        if(lista.isEmpty()){
            return aux;
        }else{
            aux = lista.get(row);
        }
        switch(col){
            case -1:
                return aux;
            case COL_NAME:
                return aux.getNome();
            case COL_MATERIAL:
                String materiais = " ";
                for(int i = 0; i < aux.getMaterial().size(); i++){
                    materiais += aux.getMaterial().get(i).getNome() + " ";
                }
                return materiais;
            default:
                break;
        }
        return "-";
    }
}
