/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.LixeiroController;
import controller.TMCadLixeiro;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Lixeiro;
import model.exceptions.LixeiroException;
import model.gerador.GeradorDeSenha;
import model.valid.ValidateLixeiro;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author mateus
 */
public class FrCadLixeiro extends javax.swing.JFrame {
    ArrayList<Lixeiro> lst = new ArrayList();
    LixeiroController lixeiroController;
    int idLixeiroEditando;
    /**
     * Creates new form FrCadFuncionario
     */
    public FrCadLixeiro() {
        initComponents();
        lixeiroController = new LixeiroController();
        lixeiroController.atualizarTabela(grdLixeiro);
        this.PreencheHoras();
        this.PreencheMinutos();
        this.DesabilitarCampos();
    }
    
    public void DesabilitarCampos(){
        edtNome.setEnabled(false);
        edtEmail.setEnabled(false);
        edtInicioHora.setEnabled(false);
        edtInicioMin.setEnabled(false);
        edtFimHora.setEnabled(false);
        edtFimMin.setEnabled(false);
        edtCpf.setEnabled(false);
        edtSexo.setEnabled(false);
        edtSegunda.setEnabled(false);
        edtTerca.setEnabled(false);
        edtQuarta.setEnabled(false);
        edtQuinta.setEnabled(false);
        edtSexta.setEnabled(false);
        edtSabado.setEnabled(false);
        edtDomingo.setEnabled(false);
        edtRemuneracao.setEnabled(false);
        edtDataNascimento.setEnabled(false);
    }
    
    public void LimparCampos(){
        edtNome.setText("");
        edtEmail.setText("");
        edtInicioHora.setSelectedIndex(0);
        edtInicioMin.setSelectedIndex(0);
        edtFimHora.setSelectedIndex(0);
        edtFimMin.setSelectedIndex(0);
        edtCpf.setText("");
        edtSexo.setText("");
        edtSegunda.setState(false);
        edtTerca.setState(false);
        edtQuarta.setState(false);
        edtQuinta.setState(false);
        edtSexta.setState(false);
        edtSabado.setState(false);
        edtDomingo.setState(false);
        edtDataNascimento.setEnabled(false);
    }
    public void HabilitarCampos(){
        edtNome.setEnabled(true);
        edtEmail.setEnabled(true);
        edtInicioHora.setEnabled(true);
        edtInicioMin.setEnabled(true);
        edtFimHora.setEnabled(true);
        edtFimMin.setEnabled(true);
        edtCpf.setEnabled(true);
        edtSexo.setEnabled(true);
        edtSegunda.setEnabled(true);
        edtTerca.setEnabled(true);
        edtQuarta.setEnabled(true);
        edtQuinta.setEnabled(true);
        edtSexta.setEnabled(true);
        edtSabado.setEnabled(true);
        edtDomingo.setEnabled(true);
        edtRemuneracao.setEnabled(true);
        edtDataNascimento.setEnabled(true);
    }
    public void PreencheMinutos(){
        for(int i = 0; i <= 59; i++){
            if(i <= 9){
              edtInicioMin.addItem("0" + Integer.toString(i));
              edtFimMin.addItem("0" + Integer.toString(i));
            }else{
            edtInicioMin.addItem(Integer.toString(i));
            edtFimMin.addItem(Integer.toString(i));
            }
        }
    }
    public void PreencheHoras(){
       for(int i = 0; i <= 24; i++){
           if(i <= 9){
               edtInicioHora.addItem("0" + Integer.toString(i));
               edtFimHora.addItem("0" + Integer.toString(i));
           }else{
           edtInicioHora.addItem(Integer.toString(i));
           edtFimHora.addItem(Integer.toString(i));
           }
       }
    }
    
    public void atualizarTabela(JTable grdLixeiro){
        TMCadLixeiro tmCadLixeiro = new TMCadLixeiro(lst);
        grdLixeiro.setModel(tmCadLixeiro);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        lblTitulo = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelet = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdLixeiro = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        edtCpf = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        edtSexo = new javax.swing.JTextField();
        lblJornadaDeTrabalho = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblFim = new javax.swing.JLabel();
        edtInicioHora = new javax.swing.JComboBox<>();
        edtInicioMin = new javax.swing.JComboBox<>();
        edtFimHora = new javax.swing.JComboBox<>();
        edtFimMin = new javax.swing.JComboBox<>();
        edtDataNascimento = new com.toedter.calendar.JDateChooser();
        lblDataNascimento = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        lblHoras1 = new javax.swing.JLabel();
        lblMinutos = new javax.swing.JLabel();
        lblMinutos1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        edtRemuneracao = new javax.swing.JTextField();
        lblDiasTrabalhados = new javax.swing.JLabel();
        edtSegunda = new java.awt.Checkbox();
        edtTerca = new java.awt.Checkbox();
        edtQuarta = new java.awt.Checkbox();
        edtQuinta = new java.awt.Checkbox();
        edtSexta = new java.awt.Checkbox();
        edtSabado = new java.awt.Checkbox();
        edtDomingo = new java.awt.Checkbox();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblTitulo.setText("                                              Cadastro de Lixeiro");

        btnNew.setText("Novo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelet.setText("Excluir");
        btnDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletActionPerformed(evt);
            }
        });

        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        grdLixeiro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(grdLixeiro);

        lblNome.setText("Nome");

        edtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtNomeKeyTyped(evt);
            }
        });

        lblCpf.setText("CPF");

        edtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtCpfKeyTyped(evt);
            }
        });

        lblEmail.setText("Email");

        lblSexo.setText("Sexo");

        edtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtEmailKeyTyped(evt);
            }
        });

        edtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtSexoActionPerformed(evt);
            }
        });
        edtSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtSexoKeyTyped(evt);
            }
        });

        lblJornadaDeTrabalho.setText("Jornada de Trabalho");

        lblInicio.setText("Início");

        lblFim.setText("Fim");

        edtInicioHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtInicioHoraActionPerformed(evt);
            }
        });

        lblDataNascimento.setText("Data de Nascimento");

        lblHoras.setText("Horas");

        lblHoras1.setText("Horas");

        lblMinutos.setText("Minutos");

        lblMinutos1.setText("Minutos");

        jLabel1.setText("Remuneração Mensal");

        edtRemuneracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtRemuneracaoKeyTyped(evt);
            }
        });

        lblDiasTrabalhados.setText("Dias de Trabalho");

        edtSegunda.setLabel("Segunda-feira");

        edtTerca.setLabel("Terça-feira\n");

        edtQuarta.setLabel("Quarta-feira");

        edtQuinta.setLabel("Quinta-feira");

        edtSexta.setLabel("Sexta-feira");

        edtSabado.setLabel("Sábado");

        edtDomingo.setLabel("Domingo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblJornadaDeTrabalho)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCpf)
                                .addGap(18, 18, 18)
                                .addComponent(edtCpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNew)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelet)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(lblSexo)
                                .addGap(18, 18, 18)
                                .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtFimHora, 0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtInicioHora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHoras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edtInicioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHoras1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edtFimMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMinutos)
                            .addComponent(lblMinutos1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataNascimento)
                            .addComponent(lblDiasTrabalhados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtTerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtQuarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtSexta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(edtDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(edtRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(279, 279, 279)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnCancel)
                    .addComponent(btnDelet)
                    .addComponent(btnSave))
                .addGap(12, 12, 12)
                .addComponent(lblJornadaDeTrabalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail)
                            .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInicio)
                            .addComponent(edtInicioHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtInicioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHoras)
                            .addComponent(lblMinutos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCpf)
                                .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSexo)
                                .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFim)
                                .addComponent(edtFimHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtFimMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblHoras1)
                                .addComponent(lblMinutos1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(edtRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblDataNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiasTrabalhados)
                            .addComponent(edtTerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtQuarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtSexta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edtSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        HabilitarCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewActionPerformed

    private void edtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtSexoActionPerformed

    private void edtInicioHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtInicioHoraActionPerformed

    }//GEN-LAST:event_edtInicioHoraActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            Date horaInicio = new Date();
                Date horaFim = new Date();
                horaInicio.setHours(edtInicioHora.getSelectedIndex());
                horaInicio.setMinutes(edtInicioMin.getSelectedIndex());
                horaFim.setHours(edtFimHora.getSelectedIndex());
                horaFim.setMinutes(edtFimMin.getSelectedIndex());
                ArrayList diasTrabalhados = new ArrayList();
                diasTrabalhados.add(edtSegunda.getState());
                diasTrabalhados.add(edtTerca.getState());
                diasTrabalhados.add(edtQuarta.getState());
                diasTrabalhados.add(edtQuinta.getState());
                diasTrabalhados.add(edtSexta.getState());
                diasTrabalhados.add(edtSabado.getState());
                diasTrabalhados.add(edtDomingo.getState());
                Double remuneracao = Double.parseDouble(edtRemuneracao.getText());
            if(idLixeiroEditando > 0){
                lixeiroController.atualizarLixeiro(idLixeiroEditando, edtNome.getText(), edtEmail.getText(),edtCpf.getText(),edtSexo.getText(), edtDataNascimento.getDate(), remuneracao, horaInicio, horaFim, diasTrabalhados);
            }else {
                String senha = GeradorDeSenha.geradorDeSenha(); 
                lixeiroController.cadastrarLixeiro(idLixeiroEditando,edtNome.getText(), edtEmail.getText(),edtCpf.getText(),edtSexo.getText(), edtDataNascimento.getDate(), remuneracao, horaInicio, horaFim, senha, diasTrabalhados);
            }
            
            lixeiroController.atualizarTabela(grdLixeiro);
            
        }catch(LixeiroException e){
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
        
        
      this.LimparCampos(); 
      this.DesabilitarCampos();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void edtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCpfKeyTyped
        String caracteres="0987654321-.";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtCpfKeyTyped

    private void edtRemuneracaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtRemuneracaoKeyTyped
        String caracteres="0987654321,";
        if(!caracteres.contains(evt.getKeyChar()+ "")){
            evt.consume();
        }
    }//GEN-LAST:event_edtRemuneracaoKeyTyped

    private void edtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNomeKeyTyped
        String caracteresInvalidos="!/#$%{}[]ªº=+-*¨&()_§|@,0123456789";
        if(caracteresInvalidos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtNomeKeyTyped

    private void edtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEmailKeyTyped
        String caracteresInvalidos="!/#$%{}[]ªº=+-*¨&()_§|,";
        if(caracteresInvalidos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtEmailKeyTyped

    private void edtSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtSexoKeyTyped
        String caracteresInvalidos="!/#$%{}[]ªº=+-*¨&()_§|@,0123456789";
        if(caracteresInvalidos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtSexoKeyTyped

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.LimparCampos();
        this.DesabilitarCampos();
    }//GEN-LAST:event_btnCancelActionPerformed

    public void preencherCampos(Lixeiro l){
        edtNome.setText(l.getNome());
        edtCpf.setText(l.getCpf());
        edtDataNascimento.setDate(l.getDataNascimento());
        edtEmail.setText(l.getEmail());
        edtSexo.setText(l.getSexo());
        edtRemuneracao.setText(String.valueOf(l.getRemuneracaoMensal()));
        edtInicioHora.setSelectedIndex(l.getHoraDeEntrada().getHours());
        edtInicioMin.setSelectedIndex(l.getHoraDeEntrada().getMinutes());
        edtFimHora.setSelectedIndex(l.getHoraDeSaida().getHours());
        edtFimMin.setSelectedIndex(l.getHoraDeSaida().getMinutes());
//        for(int i = 0; i < l.getDiasTrabalhados().size(); i++){
//            if((boolean)l.getDiasTrabalhados().get(i)){
//                if(i == 0){
//                    edtSegunda.setState(true);
//                }else if(i == 1){
//                    edtTerca.setState(true);
//                }else if(i == 2){
//                    edtQuarta.setState(true);
//                }else if(i == 3){
//                    edtQuinta.setState(true);
//                }else if(i == 4){
//                    edtSexta.setState(true);
//                }else if(i == 5){
//                    edtSabado.setState(true);
//                }else if(i == 6){
//                    edtDomingo.setState(true);
//                }
//            }
//        }
        
    }
    private Object getObjectSelectOnGrid() {
        int rowCliked = grdLixeiro.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdLixeiro.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Lixeiro lixeiroEditando = (Lixeiro) this.getObjectSelectOnGrid();
        
        if(lixeiroEditando == null){
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela");
        }else{
            this.LimparCampos();
            this.HabilitarCampos();
            this.preencherCampos(lixeiroEditando);
            lixeiroEditando.getId();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletActionPerformed
        Lixeiro lixeiroEditando = (Lixeiro) this.getObjectSelectOnGrid();
        
        if(lixeiroEditando == null){
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela");
        }else{
           try{
               Object[] options = {"Sim", "Não"};
               int opcao = JOptionPane.showOptionDialog(null, "Deseja mesmo excluir o lixeiro " + lixeiroEditando.getNome() + " ?",
                       "Confirmação de exclusão", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null,options, options[0]);
               if(opcao == 0){
                        lixeiroController.excluirLixeiro(lixeiroEditando);
                        lixeiroController.atualizarTabela(grdLixeiro);
                        JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso");
               }else if(opcao == 1){
                        JOptionPane.showMessageDialog(this, "Exclusão cancelada!");
                        this.DesabilitarCampos();
                }
           }catch(LixeiroException ex){
               JOptionPane.showMessageDialog(this, ex.getMessage());
           }
        }
    }//GEN-LAST:event_btnDeletActionPerformed

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
            java.util.logging.Logger.getLogger(FrCadLixeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadLixeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadLixeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadLixeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCadLixeiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelet;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField edtCpf;
    private com.toedter.calendar.JDateChooser edtDataNascimento;
    private java.awt.Checkbox edtDomingo;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JComboBox<String> edtFimHora;
    private javax.swing.JComboBox<String> edtFimMin;
    private javax.swing.JComboBox<String> edtInicioHora;
    private javax.swing.JComboBox<String> edtInicioMin;
    private javax.swing.JTextField edtNome;
    private java.awt.Checkbox edtQuarta;
    private java.awt.Checkbox edtQuinta;
    private javax.swing.JTextField edtRemuneracao;
    private java.awt.Checkbox edtSabado;
    private java.awt.Checkbox edtSegunda;
    private javax.swing.JTextField edtSexo;
    private java.awt.Checkbox edtSexta;
    private java.awt.Checkbox edtTerca;
    private javax.swing.JTable grdLixeiro;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblDiasTrabalhados;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblHoras1;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblJornadaDeTrabalho;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblMinutos1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
