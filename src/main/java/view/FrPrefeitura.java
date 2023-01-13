/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Prefeitura;

/**
 *
 * @author mateu
 */
public class FrPrefeitura extends javax.swing.JFrame {

    int idPrefeitura;
    public FrPrefeitura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarMotorista = new javax.swing.JButton();
        btnCadastrarRota = new javax.swing.JButton();
        btnCadastrarLixeiro = new javax.swing.JButton();
        btnCadastrarMaterial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGerarRelatorios = new javax.swing.JButton();
        btnCadastrarDeposito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrarMotorista.setText("Cadastrar Motorista");
        btnCadastrarMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarMotoristaActionPerformed(evt);
            }
        });

        btnCadastrarRota.setText("Cadastrar Rota");
        btnCadastrarRota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarRotaActionPerformed(evt);
            }
        });

        btnCadastrarLixeiro.setText("Cadastrar Lixeiro");
        btnCadastrarLixeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLixeiroActionPerformed(evt);
            }
        });

        btnCadastrarMaterial.setText("Cadastrar Material");
        btnCadastrarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarMaterialActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tela Principal - Prefeitura");

        btnGerarRelatorios.setText("Gerar Relatórios");

        btnCadastrarDeposito.setText("Cadastrar Depósito");
        btnCadastrarDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarDepositoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCadastrarLixeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCadastrarMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnGerarRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarRota, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarRota, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerarRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrarLixeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCadastrarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCadastrarDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarMotoristaActionPerformed
        FrCadMotorista frCadMotorista = new FrCadMotorista(this.idPrefeitura);
        frCadMotorista.idPrefeitura = this.idPrefeitura;
        frCadMotorista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarMotoristaActionPerformed

    private void btnCadastrarLixeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLixeiroActionPerformed
        FrCadLixeiro frCadLixeiro = new FrCadLixeiro(this.idPrefeitura);
        frCadLixeiro.idPrefeitura = this.idPrefeitura;
        frCadLixeiro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarLixeiroActionPerformed

    private void btnCadastrarRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarRotaActionPerformed
        FrCadRota frCadRota = new FrCadRota(this.idPrefeitura);
        frCadRota.idPrefeitura = this.idPrefeitura;
        frCadRota.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarRotaActionPerformed

    private void btnCadastrarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarMaterialActionPerformed
        FrCadMaterial frCadMaterial = new FrCadMaterial(this.idPrefeitura);
        frCadMaterial.idPrefeitura = this.idPrefeitura;
        frCadMaterial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarMaterialActionPerformed

    private void btnCadastrarDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarDepositoActionPerformed
        FrCadDeposito frCadDeposito = new FrCadDeposito(this.idPrefeitura);
        frCadDeposito.idPrefeitura = this.idPrefeitura;
        frCadDeposito.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarDepositoActionPerformed

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
            java.util.logging.Logger.getLogger(FrPrefeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrPrefeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrPrefeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrPrefeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrPrefeitura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarDeposito;
    private javax.swing.JButton btnCadastrarLixeiro;
    private javax.swing.JButton btnCadastrarMaterial;
    private javax.swing.JButton btnCadastrarMotorista;
    private javax.swing.JButton btnCadastrarRota;
    private javax.swing.JButton btnGerarRelatorios;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
