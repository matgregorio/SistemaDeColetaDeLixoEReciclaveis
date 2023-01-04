/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Prefeitura;

/**
 *
 * @author mateu
 */
public class TMCadPrefeitura extends AbstractTableModel{
    private List<Prefeitura> lista;
    
    private final int COL_NOME = 0;
    private final int COL_CPF = 1;
    private final int COL_EMAIL = 2;
    private final int COL_DATADENASCIMENTO = 3;
    private final int COL_REMUNERACAOMENSAL = 4;
    
    public TMCadPrefeitura(List<Prefeitura> lstPrefeitura){
        lista = lstPrefeitura;
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
               return "CNPJ";
           case COL_EMAIL:
               return "Cidade";
           case COL_DATADENASCIMENTO:
               return "Data de Cadastro";
           case COL_REMUNERACAOMENSAL:
               return "Telefone";
           default:
               break;
       }
        return null;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Prefeitura aux = new Prefeitura();
        if(lista.isEmpty()){
            return aux;
        }else{
            aux = (Prefeitura) lista.get(row);
        }
        switch (col) {
            case -1:
                return aux;
            case COL_NOME:
                return aux.getNome();
            case COL_CPF:
                return aux.getCnpj();
            case COL_EMAIL:
                return aux.getEmail();
            case COL_DATADENASCIMENTO:
                SimpleDateFormat dataFormatada;
                dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
                return dataFormatada.format(aux.getDataDeCadastro());
            case COL_REMUNERACAOMENSAL:
                return aux.getTelefone();
            default:
                break;
        }
        return "-";
    }
}
