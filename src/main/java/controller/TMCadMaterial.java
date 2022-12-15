/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Material;


/**
 *
 * @author mateu
 */
public class TMCadMaterial extends AbstractTableModel{
    private List<Material> lista;
    
    private final int COL_NOME = 0;
    private final int COL_CODIGOMATERIAL = 1;
    private final int COL_UNIDADEDEMEDIDA = 2;
    private final int COL_RECICLAVEL = 3;
    private final int COL_DESCRICAO = 4;
    
    public TMCadMaterial(List<Material> lstMateriais){
        lista = lstMateriais;
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
           case COL_CODIGOMATERIAL:
               return "CPF";
           case COL_UNIDADEDEMEDIDA:
               return "Email";
           case COL_RECICLAVEL:
               return "Data de Nascimento";
           case COL_DESCRICAO:
               return "Remuneração Mensal";
           default:
               break;
       }
        return null;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Material aux = new Material();
        if(lista.isEmpty()){
            return aux;
        }else{
            aux = (Material) lista.get(row);
        }
        switch (col) {
            case -1:
                return aux;
            case COL_NOME:
                return aux.getNome();
            case COL_CODIGOMATERIAL:
                return aux.getCodigoMaterial();
            case COL_UNIDADEDEMEDIDA:
                return aux.getUnidadeDeMedida();
            case COL_RECICLAVEL:
                if(aux.isMaterialReciclavel()){
                    return "Sim";
                }else{
                    return "Não";
                }
            case COL_DESCRICAO:
                return aux.getDescricao();
            default:
                break;
        }
        return "-";
    }
}
