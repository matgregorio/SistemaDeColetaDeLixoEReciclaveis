/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.MaterialController;
import controller.TMCadMaterial;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Material;
import model.exceptions.MaterialException;
import static view.FrCadMotorista.idPrefeitura;

/**
 *
 * @author mateu
 */
public class FrCadMaterial extends javax.swing.JFrame {

    ArrayList<Material> lst = new ArrayList();
    MaterialController materialController;
    int idMaterialEditando;
    static int idPrefeitura;

    public FrCadMaterial(int idPrefeituraa) {
        initComponents();
        materialController = new MaterialController();
        materialController.atualizarTabela(grdMaterial, idPrefeituraa);
        this.HabDesCampos(false);
    }

    public void HabDesCampos(boolean flag) {
        edtNome.setEnabled(flag);
        edtDescricao.setEnabled(flag);
        edtMaterialReciclavel.setEnabled(flag);
        edtUnidadeDeMedida.setEnabled(flag);
        edtCodigoMaterial.setEnabled(flag);
    }

    public void LimparCampos() {
        edtNome.setText("");
        edtDescricao.setText("");
        edtMaterialReciclavel.setState(false);
        edtUnidadeDeMedida.setText("");
        edtCodigoMaterial.setText("");
    }

    public void atualizarTabela(JTable grdMaterial) {
        TMCadMaterial tmCadMaterial = new TMCadMaterial(lst);
        grdMaterial.setModel(tmCadMaterial);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdMaterial = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        lblUnidadeDeMedida = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        edtUnidadeDeMedida = new javax.swing.JTextField();
        edtMaterialReciclavel = new java.awt.Checkbox();
        lblDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        edtDescricao = new javax.swing.JTextArea();
        lblCodigoMaterial = new javax.swing.JLabel();
        edtCodigoMaterial = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro De Material");
        lblTitulo.setToolTipText("");

        grdMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(grdMaterial);

        lblNome.setText("Nome");

        lblUnidadeDeMedida.setText("Unidade de Medida");

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoColetaDeLixoImagens/novo_32x32.png"))); // NOI18N
        btnNew.setText("Novo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoColetaDeLixoImagens/edit3_32x32.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoColetaDeLixoImagens/cancel_32x32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoColetaDeLixoImagens/del_32x32.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoColetaDeLixoImagens/save_32x32.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        edtMaterialReciclavel.setLabel("Material Reciclável?");

        lblDescricao.setText("Descrição");

        edtDescricao.setColumns(20);
        edtDescricao.setRows(5);
        jScrollPane2.setViewportView(edtDescricao);

        lblCodigoMaterial.setText("Codigo Do Material");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigoMaterial)
                                .addGap(24, 24, 24)
                                .addComponent(edtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtMaterialReciclavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUnidadeDeMedida)
                        .addGap(24, 24, 24)
                        .addComponent(edtUnidadeDeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addGap(155, 155, 155)))
                .addGap(0, 141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnEditar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtMaterialReciclavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUnidadeDeMedida)
                            .addComponent(edtUnidadeDeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricao))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoMaterial)
                            .addComponent(edtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.HabDesCampos(true);
    }//GEN-LAST:event_btnNewActionPerformed
    private Object getObjectSelectOnGrid() {
        int rowCliked = grdMaterial.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdMaterial.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }
    
    public void PreencherCampos(Material m){
        edtNome.setText(m.getNome());
        edtDescricao.setText(m.getDescricao());
        edtMaterialReciclavel.setState(m.isMaterialReciclavel());
        edtUnidadeDeMedida.setText(m.getUnidadeDeMedida());
        edtCodigoMaterial.setText(Integer.toString(m.getCodigoMaterial()));
    }
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Material materialEditando = (Material) this.getObjectSelectOnGrid();
        if(materialEditando == null){
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela");
        }else{
            this.LimparCampos();
            this.HabDesCampos(true);
            this.PreencherCampos(materialEditando);
            idMaterialEditando = materialEditando.getId();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.LimparCampos();
        this.HabDesCampos(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Material materialEditando = (Material) this.getObjectSelectOnGrid();
        
        if(materialEditando == null){
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela");
        }else{
           try{
               Object[] options = {"Sim", "Não"};
               int opcao = JOptionPane.showOptionDialog(null, "Deseja mesmo excluir o lixeiro " + materialEditando.getNome() + " ?",
                       "Confirmação de exclusão", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null,options, options[0]);
               if(opcao == 0){
                        materialController.excluirLixeiro(materialEditando);
                        materialController.atualizarTabela(grdMaterial, idPrefeitura);
                        JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso");
               }else if(opcao == 1){
                        JOptionPane.showMessageDialog(this, "Exclusão cancelada!");
                        this.HabDesCampos(false);
                }
           }catch(MaterialException ex){
               JOptionPane.showMessageDialog(this, ex.getMessage());
           }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try{
            if(idMaterialEditando > 0){
                materialController.atualizarMaterial(idMaterialEditando, edtNome.getText(), edtDescricao.getText(),edtUnidadeDeMedida.getText(),edtMaterialReciclavel.getState(), Integer.parseInt(edtCodigoMaterial.getText()), idPrefeitura);
            }else {
                int codigoMaterial = Integer.parseInt(edtCodigoMaterial.getText());
                materialController.cadastrarMaterial(idMaterialEditando,edtNome.getText(),edtDescricao.getText(),edtUnidadeDeMedida.getText(),edtMaterialReciclavel.getState(), codigoMaterial, idPrefeitura);
            }
            
            materialController.atualizarTabela(grdMaterial, idPrefeitura);
            
        }catch(MaterialException e){
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
        
        
      this.LimparCampos(); 
      this.HabDesCampos(false);
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FrPrefeitura telaPrefeitura = new FrPrefeitura(idPrefeitura);
        telaPrefeitura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrCadMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCadMaterial(idPrefeitura).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtCodigoMaterial;
    private javax.swing.JTextArea edtDescricao;
    private java.awt.Checkbox edtMaterialReciclavel;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtUnidadeDeMedida;
    private javax.swing.JTable grdMaterial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigoMaterial;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUnidadeDeMedida;
    // End of variables declaration//GEN-END:variables
}
