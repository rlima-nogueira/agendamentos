
package view;

import controller.AgendamentoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.AgendamentoALL;


public class MDI_ALLForm extends javax.swing.JFrame {


    public MDI_ALLForm() {
         initComponents();
         configurarFormulario();
         limparCampo();
         
         preencherTabela(new AgendamentoDAO().listar());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jbEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabResultado = new javax.swing.JTable();
        txtPorNome = new javax.swing.JTextField();
        jButtonPorNome = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agendamento");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(260, 0, 390, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID");
        desktopPane.add(jLabel3);
        jLabel3.setBounds(180, 120, 40, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Nome Completo");
        desktopPane.add(jLabel4);
        jLabel4.setBounds(70, 150, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Celular");
        desktopPane.add(jLabel5);
        jLabel5.setBounds(70, 180, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Horário");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(70, 240, 140, 30);

        txtid.setText("jTextField1");
        desktopPane.add(txtid);
        txtid.setBounds(230, 119, 180, 30);

        txtHora.setText("jTextField1");
        desktopPane.add(txtHora);
        txtHora.setBounds(230, 240, 180, 30);

        txtData.setText("jTextField1");
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        desktopPane.add(txtData);
        txtData.setBounds(230, 210, 180, 30);

        txtNome.setText("jTextField1");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        desktopPane.add(txtNome);
        txtNome.setBounds(230, 150, 180, 30);

        txtCelular.setText("jTextField1");
        desktopPane.add(txtCelular);
        txtCelular.setBounds(230, 180, 180, 30);

        jbEditar.setBackground(new java.awt.Color(204, 255, 204));
        jbEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEditar.setText("EDITAR");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        desktopPane.add(jbEditar);
        jbEditar.setBounds(480, 110, 150, 50);

        btnDeletar.setBackground(new java.awt.Color(255, 51, 51));
        btnDeletar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeletar.setText("DELETAR");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        desktopPane.add(btnDeletar);
        btnDeletar.setBounds(650, 110, 140, 50);

        jbNovo.setBackground(new java.awt.Color(0, 255, 204));
        jbNovo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbNovo.setText("NOVO");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        desktopPane.add(jbNovo);
        jbNovo.setBounds(480, 180, 150, 50);

        jbSalvar.setBackground(new java.awt.Color(204, 204, 255));
        jbSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalvar.setText("SALVAR");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        desktopPane.add(jbSalvar);
        jbSalvar.setBounds(650, 180, 140, 50);

        tabResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tabResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabResultado);

        desktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(30, 300, 860, 160);

        txtPorNome.setText("jTextField1");
        txtPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorNomeActionPerformed(evt);
            }
        });
        desktopPane.add(txtPorNome);
        txtPorNome.setBounds(540, 470, 340, 30);

        jButtonPorNome.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonPorNome.setText("POR NOME");
        jButtonPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorNomeActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonPorNome);
        jButtonPorNome.setBounds(630, 510, 180, 21);

        jbCancelar.setBackground(new java.awt.Color(102, 255, 102));
        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbCancelar.setText("CANCELAR");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        desktopPane.add(jbCancelar);
        jbCancelar.setBounds(30, 530, 140, 60);

        jbSair.setBackground(new java.awt.Color(255, 153, 153));
        jbSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbSair.setText("SAIR");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        desktopPane.add(jbSair);
        jbSair.setBounds(180, 530, 140, 60);

        jButtonListar.setBackground(new java.awt.Color(255, 255, 102));
        jButtonListar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonListar.setText("LISTAR");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonListar);
        jButtonListar.setBounds(330, 530, 160, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Data");
        desktopPane.add(jLabel6);
        jLabel6.setBounds(70, 210, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        if (!txtid.getText().isEmpty()){
            estadoControle(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione o horário que deseja editar.", "Agendamento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        AgendamentoALL p = new AgendamentoALL();
        if(!txtid.getText().isEmpty()){
            p.setId(Integer.parseInt(txtid.getText()));
        }
        p.setNome(txtNome.getText());
        p.setCelular(txtCelular.getText());
        p.setData(txtData.getText());
        p.setHorario(txtHora.getText());
     
        int res = -1;
        
        if(p.getId() == 0){
            res = new AgendamentoDAO().inserir(p);
            txtid.setText(Integer.toString(res));
        }else{
            res = new AgendamentoDAO().atualizar(p);
            
        }
        if (res != -1){
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Agendamento", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.”", "Agendamento", 
                    JOptionPane.ERROR_MESSAGE);
        }
        estadoControle(true);
        preencherTabela(new AgendamentoDAO().listar());
        limparCampo();
        //txtAltura.setText("");
        //txtNomepaciente.setText("");
        //txtPeso.setText("");
        //txtidpaciente.setText("");
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        estadoControle(true);
        limparCampo();
//        txtAltura.setText("");
//        txtNomepaciente.setText("");
//        txtPeso.setText("");
//        txtidpaciente.setText("");

        
        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void tabResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResultadoMouseClicked
        int linha = tabResultado.getSelectedRow();
        if(linha >= 0){
            txtid.setText(tabResultado.getValueAt(linha, 0).toString());
            txtNome.setText(tabResultado.getValueAt(linha, 1).toString());
            txtCelular.setText(tabResultado.getValueAt(linha, 2).toString());
            txtData.setText(tabResultado.getValueAt(linha, 3).toString());
            txtHora.setText(tabResultado.getValueAt(linha, 4).toString());
        }
    }//GEN-LAST:event_tabResultadoMouseClicked

    private void txtPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorNomeActionPerformed

    private void jButtonPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorNomeActionPerformed

        String nome = txtPorNome.getText();
        if(!nome.isEmpty()){
            JOptionPane.showMessageDialog(null,"Pesquisando nomes com a letra ( "
                + txtPorNome.getText() +  " ) ", "Pesquisa por nome",
                 JOptionPane.INFORMATION_MESSAGE);
            preencherTabela(new AgendamentoDAO().pesquisarPorNome(nome));
        }
        else{
             JOptionPane.showMessageDialog(null, "Retornando Lista completa",
                     "Lista completa",
                   JOptionPane.WARNING_MESSAGE);
            preencherTabela(new AgendamentoDAO().listar());
        }
        estadoControle(false);
    }//GEN-LAST:event_jButtonPorNomeActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        preencherTabela(new AgendamentoDAO().listar());
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        AgendamentoALL p = new AgendamentoALL();
        p.setId(Integer.parseInt(txtid.getText()));
        AgendamentoDAO d = new AgendamentoDAO();
        d.deletar(p);
        preencherTabela(new AgendamentoDAO().listar());
        estadoControle(true);
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        estadoControle(false);

        txtid.setText("");
        txtNome.setText("");
        txtCelular.setText("");
        txtData.setText("");
        txtHora.setText("");

        //configurarTabela();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

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
            java.util.logging.Logger.getLogger(MDI_ALLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI_ALLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI_ALLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI_ALLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI_ALLForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonPorNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable tabResultado;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPorNome;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables

    
       
    private void configurarFormulario(){
        this.setTitle("Agendamento de Horários");
        // Desabilita o botão de maximizar 
        this.setResizable(false);
        // Centraliza a tela
        this.setLocationRelativeTo(null);
        
        estadoControle(true); 
        txtid.setEnabled(false);
        //preencherTabela(new PacienteDAOALL().listar());
        //ou
        configurarTabela();
        //limparCampo();
        txtHora.setText("");
        txtNome.setText("");
        txtCelular.setText("");
        txtData.setText("");
        txtid.setText("");
        txtPorNome.setText("");
    }
   
    private void estadoControle(boolean e){
//         jbNovo.setEnabled(e);
         jbEditar.setEnabled(e);
         jbSalvar.setEnabled(!e);
         jbCancelar.setEnabled(!e);

         txtNome.setEnabled(!e);
         txtCelular.setEnabled(!e);
         txtData.setEnabled(!e);
         txtHora.setEnabled(!e);

    }
    
    private void configurarTabela(){
        DefaultTableModel m = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            
                m.addColumn("Id do Agendamento");
                m.addColumn("Nome");
                m.addColumn("Celular");
                m.addColumn("Data"); 
                m.addColumn("Horário"); 
                
                tabResultado.setModel(m);
    }
    
    
    private void preencherTabela(List<AgendamentoALL> lista){
        if(lista.size()>0){
            configurarTabela();
            DefaultTableModel m = (DefaultTableModel)tabResultado.getModel();
            
            for(AgendamentoALL p : lista){
                m.addRow(new Object[]{
                p.getId(), p.getNome(), p.getCelular(), p.getData(), p.getHorario()
            });
            }
            tabResultado.setModel(m);
        }
    }
    
    
    private void limparCampo(){
        txtHora.setText("");
        txtNome.setText("");
        txtData.setText("");
        txtCelular.setText("");
        txtid.setText("");
        txtPorNome.setText("");
    }
}










//listar botao
//       preencherTabela(new PacienteDAOALL().listar());







//Inserir e atualizar
/*
        PacienteALL p = new PacienteALL();
        if(!txtidpaciente.getText().isEmpty()){
            p.setId(Integer.parseInt(txtidpaciente.getText()));
        }
        p.setNome(txtNomepaciente.getText());
        p.setPeso(Float.parseFloat(txtPeso.getText()));
        p.setAltura(Float.parseFloat(txtAltura.getText()));
        
        int res = -1;
        
        if(p.getId() == 0){
            res = new PacienteDAOALL().inserir(p);
            txtidpaciente.setText(Integer.toString(res));
        }
        else{
            res = new PacienteDAOALL().atualizar(p);
        }
        
        if (res != -1){
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Pacientes", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.”", "Pacientes", JOptionPane.ERROR_MESSAGE);
        }
        estadoControle(true);
        preencherTabela(new PacienteDAOALL().listar());
        limparCampo();

*/