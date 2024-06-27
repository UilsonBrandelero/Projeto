/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
 * @author uilso
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    UsuarioLogado usuarioLogado = new UsuarioLogado();

    public Login() {
        initComponents();
        setImagemLogin();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        tfSenha = new javax.swing.JTextField();
        botaoLogin = new javax.swing.JButton();
        jlCadastre = new javax.swing.JLabel();
        loginDigitacao = new javax.swing.JLabel();
        loginDigitacao1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        tfUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfUsuario.setBorder(null);
        tfUsuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfUsuario.setSelectionColor(new java.awt.Color(102, 102, 102));

        tfSenha.setBackground(new java.awt.Color(255, 255, 255));
        tfSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSenha.setBorder(null);

        botaoLogin.setBackground(new java.awt.Color(0, 102, 255));
        botaoLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botaoLogin.setText("Login");
        botaoLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginDigitacao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginDigitacao, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSenha)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlCadastre)
                    .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginDigitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginDigitacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(botaoLogin)
                .addGap(18, 18, 18)
                .addComponent(jlCadastre)
                .addGap(70, 70, 70))
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

        setSize(new java.awt.Dimension(481, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

//        String usuario = tfUsuario.getText();
//        if (usuario.equals("1") || usuario.equals("centro")) {
//            PrincipalCentroRecebimento principalCentro = new PrincipalCentroRecebimento();
//            principalCentro.setVisible(true);
//            this.dispose();
//
//        } else if (usuario.equals("2") || usuario.equals("doador")) {
//            PrincipalDoador principalDoador = new PrincipalDoador();
//            principalDoador.setVisible(true);
//            this.dispose();
//        }
        System.out.println(usuarioLogado.getTipoUsuario());
        System.out.println(usuarioLogado.getIdUsuario());

    }//GEN-LAST:event_botaoLoginActionPerformed

    public void logarDoador() {
        DoadorServico doadorServico = new DoadorServico(); // Esntancia objeto uq faz consulta na tabela de doadores
        EnderecoServico enderecoServico = new EnderecoServico();//Esntancia objeto uq faz consulta na tabela de endereco_doadores
        
        //variavel que recebe a validação se os dados digitados existem no banco
        boolean validacao = doadorServico.consultaDoadorLogin(tfUsuario.getText(), tfSenha.getText());

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

    public void logarCentroRecebimento() {
        CentroRecebimentoServico centroServico = new CentroRecebimentoServico();
        EnderecoServico enderecoServico = new EnderecoServico();
        
        boolean validadcao = centroServico.consultaCentroRecebimentoLogin(tfUsuario.getText(), tfSenha.getText());
        if(validadcao == true){
            CentroRecebimento centroLogado = centroServico.consultaCentroRecebimentoId(usuarioLogado.getIdUsuario());
            usuarioLogado.setCentroLogado(centroLogado);
            
            Endereco enderecoLogado = enderecoServico.buscaEnderecoCentroRecebimentoPorId(usuarioLogado.getIdUsuario());
            usuarioLogado.setEnderecoUsuarioLogado(enderecoLogado);
            
        }
        
        
        new PrincipalCentroRecebimento().setVisible(true);
        this.dispose();

    }

    public void setImagemLogin() {
        ImageIcon iconeLogin = new ImageIcon("src/main/resources/img/login.jpg");
        iconeLogin.setImage(iconeLogin.getImage().getScaledInstance(140, 140, 1));
        login.setIcon(iconeLogin);

    }

    public void setImagemLoginDigitacao() {
        ImageIcon iconeLogin = new ImageIcon("src/main/resources/img/login2.png");
       
        loginDigitacao.setIcon(iconeLogin);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botaoLogin;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JLabel jlCadastre;
    protected javax.swing.JLabel login;
    protected javax.swing.JLabel loginDigitacao;
    protected javax.swing.JLabel loginDigitacao1;
    protected javax.swing.JTextField tfSenha;
    protected javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
