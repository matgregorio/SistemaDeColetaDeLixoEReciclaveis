/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Lixeiro;

/**
 *
 * @author mateus
 */
public class TMCadLixeiro extends AbstractTableModel{
    private ArrayList<Lixeiro> lista;
    
    private final int COL_NOME = 0;
    private final int COL_CPF = 1;
    private final int COL_EMAIL = 2;
    private final int COL_DATADENASCIMENTO = 3;
    private final int COL_REMUNERACAOMENSAL = 4;
    
    public TMCadLixeiro(ArrayList<Lixeiro> lstLixeiros){
        lista = lstLixeiros;
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
           case COL_NOME:
               return "Nome";
           case COL_CPF:
               return "CPF";
           case COL_EMAIL:
               return "Email";
           case COL_DATADENASCIMENTO:
               return "Data de Nascimento";
           case COL_REMUNERACAOMENSAL:
               return "Remuneração Mensal";
           default:
               break;
       }
        return null;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Lixeiro lixeiro = this.lista.get(row);
        if(col == COL_NOME){
            return lixeiro.getNome();
        }else if(col == COL_CPF){
            return lixeiro.getCpf();
        }else if(col == COL_EMAIL){
            return lixeiro.getEmail();
        }else if(col == COL_DATADENASCIMENTO){
            return lixeiro.getDataNascimento();
        }else if(col == COL_REMUNERACAOMENSAL){
            return lixeiro.getRemuneracaoMensal();
        }
        return "-";
    }
    
}
