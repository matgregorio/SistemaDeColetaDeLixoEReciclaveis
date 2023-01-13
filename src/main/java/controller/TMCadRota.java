/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Rota;

/**
 *
 * @author mateu
 */
public class TMCadRota extends AbstractTableModel{
    private List<Rota> lista;
    
    private final int COL_PONTODEORIGEM = 0;
    private final int COL_PONTODEDESTINO = 1;
    private final int COL_MATERIAL = 2;
    private final int COL_QUANTIDADEMATERIAL = 3;
    private final int COL_DATA = 4;
    
    public TMCadRota(List<Rota> lstRotas){
        lista = lstRotas;
    }

    @Override
    public int getRowCount() {
       return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
       switch(column){
           case COL_PONTODEORIGEM:
               return "Ponto de Origem";
           case COL_PONTODEDESTINO:
               return "Ponto de Destino";
           case COL_MATERIAL:
               return "Material";
           case COL_QUANTIDADEMATERIAL:
               return "Hora de Saida";
           case COL_DATA:
               return "Hora de Entrada";
           default:
               break;
       }
        return null;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Rota aux = new Rota();
        if(lista.isEmpty()){
            return aux;
        }else{
            aux = (Rota) lista.get(row);
        }
        switch (col) {
            case -1:
                return aux;
            case COL_PONTODEORIGEM:
                return aux.getPontoDeOrigem();
            case COL_PONTODEDESTINO:
                return aux.getDeposito().getNome();
            case COL_MATERIAL:
                return aux.getMaterial().getNome();
            case COL_QUANTIDADEMATERIAL:
                return aux.getQntMaterial() + aux.getMaterial().getUnidadeDeMedida();
            case COL_DATA:
                return aux.getDataRota();
            default:
                break;
        }
        return "-";
    }
}
