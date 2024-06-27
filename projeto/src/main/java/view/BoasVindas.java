/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Cursor;
import util.TipoUsuario;
import util.UsuarioLogado;

/**
 *
 * @author uilso
 */
public class BoasVindas extends javax.swing.JFrame {

    /**
     * Creates new form Escolha
     */
    UsuarioLogado usuarioLogado = new UsuarioLogado();
    TipoUsuario tipoUsuario;

    public BoasVindas() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoCentroRecebimento = new javax.swing.JButton();
        botaoDoador = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jlCadastrese = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Olá");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Olá ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Seja Bem-Vindo");

        botaoCentroRecebimento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botaoCentroRecebimento.setText("Centro de Recebimento");
        botaoCentroRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCentroRecebimentoActionPerformed(evt);
            }
        });

        botaoDoador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botaoDoador.setText("Doador");
        botaoDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDoadorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Como deseja acessar?");

        jlCadastrese.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCadastrese.setText("Cadastre-se");
        jlCadastrese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCadastreseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlCadastreseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCadastreseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(282, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jlCadastrese, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(botaoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCentroRecebimento)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCentroRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)))
                .addComponent(jlCadastrese)
                .addGap(75, 75, 75))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDoadorActionPerformed
        tipoUsuario = TipoUsuario.DOADOR;
        usuarioLogado.setTipoUsuario(tipoUsuario);
        Login login = new Login();
        login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botaoDoadorActionPerformed

    private void botaoCentroRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCentroRecebimentoActionPerformed
        tipoUsuario = TipoUsuario.CENTRO_RECEBIMENTO;
        usuarioLogado.setTipoUsuario(tipoUsuario);
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCentroRecebimentoActionPerformed

    private void jlCadastreseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastreseMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        jlCadastrese.setCursor(cursor);
        jlCadastrese.setForeground(Color.BLUE);
    }//GEN-LAST:event_jlCadastreseMouseEntered

    private void jlCadastreseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastreseMouseClicked
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlCadastreseMouseClicked

    private void jlCadastreseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastreseMouseExited
        jlCadastrese.setForeground(Color.BLACK);
    }//GEN-LAST:event_jlCadastreseMouseExited

    public TipoUsuario getTipoEscolhido() {
        return tipoUsuario;
    }

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
            java.util.logging.Logger.getLogger(BoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoasVindas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton botaoCentroRecebimento;
    protected javax.swing.JButton botaoDoador;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jlCadastrese;
    // End of variables declaration//GEN-END:variables
}
