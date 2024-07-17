/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import modelo.CentroRecebimento;
import modelo.Doador;
import modelo.Endereco;
import servico.CentroRecebimentoServico;
import servico.DoadorServico;
import servico.EnderecoServico;
import util.TipoUsuario;
import util.UsuarioLogado;

/**
 *
 * Tela utilizada para realizar Login no sistema
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setImagemLogin();
        jlSenha.setVisible(false);
        eventoBotao();

    }

    UsuarioLogado usuarioLogado = new UsuarioLogado();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        botaoLogin = new javax.swing.JButton();
        jlCadastre = new javax.swing.JLabel();
        loginDigitacao = new javax.swing.JLabel();
        loginDigitacao1 = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        tbVisializarSenha = new javax.swing.JToggleButton();
        tfSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        tfUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfUsuario.setBorder(null);
        tfUsuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfUsuario.setSelectionColor(new java.awt.Color(102, 102, 102));

        botaoLogin.setBackground(new java.awt.Color(0, 102, 255));
        botaoLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botaoLogin.setText("Login");
        botaoLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });
        botaoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                botaoLoginKeyTyped(evt);
            }
        });

        jlCadastre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCadastre.setText("Cadastrar-se");
        jlCadastre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCadastreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlCadastreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCadastreMouseExited(evt);
            }
        });

        loginDigitacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginDigitacao.setText("Usuário");
        loginDigitacao.setOpaque(true);

        loginDigitacao1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginDigitacao1.setText("Senha");
        loginDigitacao1.setOpaque(true);

        jlSenha.setText("LABEL SENHA");

        tbVisializarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hide.png"))); // NOI18N
        tbVisializarSenha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tbVisializarSenhaItemStateChanged(evt);
            }
        });
        tbVisializarSenha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tbVisializarSenhaStateChanged(evt);
            }
        });

        tfSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSenhaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginDigitacao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginDigitacao, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jlSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbVisializarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCadastre)
                    .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginDigitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loginDigitacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tbVisializarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlSenha)
                .addGap(63, 63, 63)
                .addComponent(botaoLogin)
                .addGap(18, 18, 18)
                .addComponent(jlCadastre)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(481, 603));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void eventoBotao (){
        botaoLogin.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "doClick");
        botaoLogin.getActionMap().put("doClick", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e ){
                botaoLogin.doClick();
            }
        });
    }
        
    
    
    
    
    private void jlCadastreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastreMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        jlCadastre.setCursor(cursor);
        jlCadastre.setForeground(Color.BLUE);


    }//GEN-LAST:event_jlCadastreMouseEntered

    private void jlCadastreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastreMouseExited
        jlCadastre.setForeground(Color.BLACK);
    }//GEN-LAST:event_jlCadastreMouseExited

    private void jlCadastreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastreMouseClicked
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlCadastreMouseClicked

    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed

        if (usuarioLogado.getTipoUsuario() == TipoUsuario.DOADOR) {
            logarDoador();

        } else if (usuarioLogado.getTipoUsuario() == TipoUsuario.CENTRO_RECEBIMENTO) {
            logarCentroRecebimento();
        }


    }//GEN-LAST:event_botaoLoginActionPerformed

    private void botaoLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoLoginKeyTyped

    }//GEN-LAST:event_botaoLoginKeyTyped

    private void tbVisializarSenhaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbVisializarSenhaStateChanged

    }//GEN-LAST:event_tbVisializarSenhaStateChanged

    private void tbVisializarSenhaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tbVisializarSenhaItemStateChanged
        if (tbVisializarSenha.isSelected()) {
            jlSenha.setVisible(true);
            String senha = String.copyValueOf(tfSenha.getPassword());
            jlSenha.setText(senha);

            tbVisializarSenha.setIcon(new ImageIcon("src/main/resources/img/show.png"));
        } else {
            jlSenha.setVisible(false);
            tbVisializarSenha.setIcon(new ImageIcon("src/main/resources/img/hide.png"));
        }
    }//GEN-LAST:event_tbVisializarSenhaItemStateChanged

    private void tfSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSenhaKeyReleased
        if (tbVisializarSenha.isSelected()) {
            String senha = String.copyValueOf(tfSenha.getPassword());
            jlSenha.setText(senha);
        }

    }//GEN-LAST:event_tfSenhaKeyReleased
//Realiza o Login de um usuario do tipo Doador
    public void logarDoador() {
        DoadorServico doadorServico = new DoadorServico(); // Esntancia objeto uq faz consulta na tabela de doadores
        EnderecoServico enderecoServico = new EnderecoServico();//Esntancia objeto uq faz consulta na tabela de endereco_doadores

        //variavel que recebe a validação se os dados digitados existem no banco
        String senha = String.copyValueOf(tfSenha.getPassword());
        jlSenha.setText(senha);

        boolean validacao = doadorServico.consultaDoadorLogin(tfUsuario.getText(), senha);

        if (validacao == true) {
            //Busca e armazena todas as informacoes do usuario atual
            Doador doadorLogado = doadorServico.consultaDoadorPorId(usuarioLogado.getIdUsuario());
            usuarioLogado.setDoadorLogado(doadorLogado);

            //Busca e armazena o endereco do doador que fez login
            Endereco enderecoDoadorLogado = enderecoServico.buscaEnderecoDoadorPorId(usuarioLogado.getIdUsuario());
            usuarioLogado.setEnderecoUsuarioLogado(enderecoDoadorLogado);

            //Estancia a tela principal para doadores e deixa-a visivel
            PrincipalDoador principalDoador = new PrincipalDoador();
            principalDoador.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Dados invalidos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
//Realiza o Login de um usuario do tipo Centro de Recebimento
    public void logarCentroRecebimento() {
        CentroRecebimentoServico centroServico = new CentroRecebimentoServico();
        EnderecoServico enderecoServico = new EnderecoServico();
        String senha = String.copyValueOf(tfSenha.getPassword());
        jlSenha.setText(senha);

        boolean validacao = centroServico.consultaCentroRecebimentoLogin(tfUsuario.getText(), senha);
        if (validacao == true) {
            CentroRecebimento centroLogado = centroServico.consultaCentroRecebimentoId(usuarioLogado.getIdUsuario());
            usuarioLogado.setCentroLogado(centroLogado);

            Endereco enderecoLogado = enderecoServico.buscaEnderecoCentroRecebimentoPorId(usuarioLogado.getIdUsuario());
            usuarioLogado.setEnderecoUsuarioLogado(enderecoLogado);

            new PrincipalCentroRecebimento().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Dados invalidos", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void setImagemLogin() {
        ImageIcon iconeLogin = new ImageIcon("src/main/resources/img/login.png");
        iconeLogin.setImage(iconeLogin.getImage().getScaledInstance(140, 140, 1));
        login.setIcon(iconeLogin);

    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botaoLogin;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JLabel jlCadastre;
    protected javax.swing.JLabel jlSenha;
    protected javax.swing.JLabel login;
    protected javax.swing.JLabel loginDigitacao;
    protected javax.swing.JLabel loginDigitacao1;
    protected javax.swing.JToggleButton tbVisializarSenha;
    protected javax.swing.JPasswordField tfSenha;
    protected javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
