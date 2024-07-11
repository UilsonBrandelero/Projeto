/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.CategoriaItem;
import modelo.CentroRecebimento;
import modelo.Cidade;
import modelo.Endereco;
import modelo.Estado;
import modelo.Item;
import modelo.Requisicao;
import servico.CategoriaItemServico;
import servico.CentroRecebimentoServico;
import servico.CidadeServico;
import servico.EnderecoServico;
import servico.EstadoServico;
import servico.ItemServico;
import servico.RequisicaoServico;
import util.StatusRequisicao;
import util.UsuarioLogado;
import util.VerificaCpf;

/**
 *
 * @author uilso
 */
public class PrincipalCentroRecebimento extends javax.swing.JFrame {

    DefaultTableModel modeloTabelaItensSolicitados;
    DefaultTableModel modeloTabelaItens;
    ListSelectionModel selectionModel;

    public PrincipalCentroRecebimento() {

        initComponents();
        setLabelBemVindo();
        populaCategoria();
        this.modeloTabelaItensSolicitados = (DefaultTableModel) tabelaItensSolicitados.getModel();
        this.modeloTabelaItens = (DefaultTableModel) tabelaItens.getModel();
        this.selectionModel = tabelaItens.getSelectionModel();
        evento();
    }
    UsuarioLogado usuario = new UsuarioLogado();
    CentroRecebimento centroLogado = new CentroRecebimento(usuario.getCentroLogado());
    Endereco enderecoUsuarioLogado = new Endereco(usuario.getEnderecoUsuarioLogado());

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCentroRecebimento = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        painelListaBanco = new javax.swing.JPanel();
        jbDeletar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbSolicitar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaItensSolicitados = new javax.swing.JTable();
        painelAdicionaItens = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaItens = new javax.swing.JTable();
        jlNomeItem = new javax.swing.JLabel();
        jbAdicionar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jsQuantidade = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfAlterarNomeCentroRecebimento = new javax.swing.JTextField();
        jtfAlterarNome = new javax.swing.JTextField();
        jtfAlterarCpfCnpj = new javax.swing.JTextField();
        jtfAlterarTelefone = new javax.swing.JTextField();
        jtfAlterarEmail = new javax.swing.JTextField();
        jbAtualizarDados = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jlEstado = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbAlterarEstado = new javax.swing.JComboBox<>();
        cbAlterarCidade = new javax.swing.JComboBox<>();
        jtfAlterarCep = new javax.swing.JTextField();
        jtfAlterarRua = new javax.swing.JTextField();
        jtfAlterarBairro = new javax.swing.JTextField();
        jtfAlterarNumero = new javax.swing.JTextField();
        jtfAlterarComplemento = new javax.swing.JTextField();
        jbAtualizarEndereco = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlBemVindo = new javax.swing.JLabel();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        painelCentroRecebimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        painelCentroRecebimento.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                painelCentroRecebimentoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        painelCentroRecebimento.addTab("Home", jPanel1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Categoria");

        cbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jbDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pen.png"))); // NOI18N
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbSolicitar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbSolicitar.setText("Solicitar");
        jbSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSolicitarActionPerformed(evt);
            }
        });

        tabelaItensSolicitados.setModel(new javax.swing.table.DefaultTableModel(
            new Item [][] {

            },
            new String [] {
                "Item", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaItensSolicitados.setColumnSelectionAllowed(true);
        tabelaItensSolicitados.setRowHeight(25);
        tabelaItensSolicitados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaItensSolicitados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaItensSolicitados.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tabelaItensSolicitados);
        tabelaItensSolicitados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabelaItensSolicitados.getColumnModel().getColumnCount() > 0) {
            tabelaItensSolicitados.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabelaItensSolicitados.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        javax.swing.GroupLayout painelListaBancoLayout = new javax.swing.GroupLayout(painelListaBanco);
        painelListaBanco.setLayout(painelListaBancoLayout);
        painelListaBancoLayout.setHorizontalGroup(
            painelListaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListaBancoLayout.createSequentialGroup()
                .addGroup(painelListaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelListaBancoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(painelListaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelListaBancoLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jbSolicitar)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        painelListaBancoLayout.setVerticalGroup(
            painelListaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListaBancoLayout.createSequentialGroup()
                .addGroup(painelListaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelListaBancoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelListaBancoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSolicitar)
                .addGap(17, 17, 17))
        );

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Item [][] {

            },
            new String [] {
                "Itens"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaItens.setRowHeight(25);
        tabelaItens.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaItens.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaItens.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaItens);
        tabelaItens.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jlNomeItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNomeItem.setText("Nome Item");

        jbAdicionar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbAdicionar.setText("Adicionar");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Quantidade");

        jsQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jsQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout painelAdicionaItensLayout = new javax.swing.GroupLayout(painelAdicionaItens);
        painelAdicionaItens.setLayout(painelAdicionaItensLayout);
        painelAdicionaItensLayout.setHorizontalGroup(
            painelAdicionaItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionaItensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAdicionaItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAdicionaItensLayout.createSequentialGroup()
                        .addGroup(painelAdicionaItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNomeItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelAdicionaItensLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(45, 45, 45)
                                .addComponent(jsQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(painelAdicionaItensLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jbAdicionar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelAdicionaItensLayout.setVerticalGroup(
            painelAdicionaItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionaItensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAdicionaItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAdicionaItensLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jlNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(painelAdicionaItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(jbAdicionar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAdicionaItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(painelListaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelAdicionaItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(painelListaBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelCentroRecebimento.addTab("Solicitar Itens", jPanel2);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nome Completo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("CPF/CNPJ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Telefone");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("E-mail");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nome do Centro de Recebimento");

        jtfAlterarNomeCentroRecebimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfAlterarNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfAlterarCpfCnpj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfAlterarTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfAlterarEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jbAtualizarDados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbAtualizarDados.setText("Salvar Alterações");
        jbAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jtfAlterarNomeCentroRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfAlterarNome)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtfAlterarCpfCnpj, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfAlterarTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                        .addGap(106, 106, 106))
                                    .addComponent(jtfAlterarEmail)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jbAtualizarDados)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfAlterarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfAlterarCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfAlterarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfAlterarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfAlterarNomeCentroRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jbAtualizarDados)
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("Dados Pessoais", jPanel6);

        jlEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlEstado.setText("Estado");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Cidade");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("CEP");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Rua");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Bairro");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Numero");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Complemento");

        cbAlterarEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAlterarEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAlterarEstadoItemStateChanged(evt);
            }
        });

        cbAlterarCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jtfAlterarCep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfAlterarRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfAlterarBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfAlterarNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfAlterarComplemento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jbAtualizarEndereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbAtualizarEndereco.setText("Salvar Alterações");
        jbAtualizarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarEnderecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtfAlterarComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbAlterarCidade, 0, 177, Short.MAX_VALUE)
                                        .addComponent(cbAlterarEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfAlterarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfAlterarCep, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfAlterarRua, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAlterarBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jbAtualizarEndereco)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEstado)
                    .addComponent(cbAlterarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbAlterarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfAlterarCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtfAlterarRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtfAlterarBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtfAlterarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfAlterarComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jbAtualizarEndereco)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereco", jPanel7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 360, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        painelCentroRecebimento.addTab("Alterar Dados", jPanel3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Centro de Recebimento");

        jlBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlBemVindo.setText("Label Usuario");

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jbSair))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jbSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlBemVindo)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCentroRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 951, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCentroRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

public void evento() {
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && selectionModel.getSelectedItemsCount() != 0) {
                    String nomeItem = String.valueOf(tabelaItens.getValueAt(tabelaItens.getSelectedRow(), 0));
                    jlNomeItem.setText(nomeItem);
                    jsQuantidade.setValue(0);
                }
            }
        });
    }
    private void jbSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSolicitarActionPerformed
        if (tabelaItensSolicitados.getRowCount() > 0) {
            salvarRequisicao();
        } else {
            JOptionPane.showMessageDialog(this, "Adicione itens antes de salvar", "Adicionar", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jbSolicitarActionPerformed

    private void painelCentroRecebimentoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_painelCentroRecebimentoStateChanged
        // Condição que atualiza os dados sempre que há alteração das abas do sistema.
        if (painelCentroRecebimento.getSelectedIndex() == 2) {
            preencheCamposAlteracao();
            populaEstado();
        }
    }//GEN-LAST:event_painelCentroRecebimentoStateChanged

    private void cbAlterarEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAlterarEstadoItemStateChanged
        //Lista as Cidades do Ustado selecionado sempre que hã alteração do Estado no comboBox
        cbAlterarCidade.removeAllItems();
        populaCidade();
    }//GEN-LAST:event_cbAlterarEstadoItemStateChanged

    private void jbAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarDadosActionPerformed

        boolean validacao = validarDadosPessoais();
        if (validacao == true) {
            int v = JOptionPane.showConfirmDialog(this, "Deseja realmente alterar seus dados pessoais?", "", JOptionPane.YES_NO_OPTION);
            if (v == 0) {
                atualizarCentroRecebimento();
            }
        }
    }//GEN-LAST:event_jbAtualizarDadosActionPerformed

    private void jbAtualizarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarEnderecoActionPerformed
        boolean validacao = validarEndereco();
        if (validacao == true) {
            int v = JOptionPane.showConfirmDialog(this, "Deseja realmente alterar seu endereço?", "", JOptionPane.YES_NO_OPTION);
            if (v == 0) {
                atualizarEnderecoCentro();
            }
        }
    }//GEN-LAST:event_jbAtualizarEnderecoActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
       logOff();

    }//GEN-LAST:event_jbSairActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        adicionaItemSolicitado();

    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed

        if (tabelaItensSolicitados.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione um item para remover", "Remover", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Item item = (Item) tabelaItensSolicitados.getValueAt(tabelaItensSolicitados.getSelectedRow(), 0);
            int v = JOptionPane.showConfirmDialog(this, "Deseja remover da solicitação  '" + item + "'", "Remover", JOptionPane.YES_NO_OPTION);
            if (v == 0) {
                modeloTabelaItensSolicitados.removeRow(tabelaItensSolicitados.getSelectedRow());
            }
        }
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        if (painelCentroRecebimento.getSelectedIndex() == 1) {
            populaItens();
        }

    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        if (tabelaItensSolicitados.getSelectedRowCount() != 0) {
            int linhaSelecionada = tabelaItensSolicitados.getSelectedRow();
            Item itemEditar = (Item) tabelaItensSolicitados.getValueAt(linhaSelecionada, 0);
            int quantidade = (int) tabelaItensSolicitados.getValueAt(linhaSelecionada, 1);
            EditarItem editarItem = new EditarItem(this, true);
            editarItem.setComponetes(itemEditar, quantidade);
            editarItem.setVisible(true);
            if (editarItem.getReturnStatus() == 1) {
                int quantidadeEditada = editarItem.quantidadeAlterada();
                tabelaItensSolicitados.setValueAt(quantidadeEditada, linhaSelecionada, 1);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item para alterar a quantidade", "Alterar Quantidade", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_jbEditarActionPerformed
    public void preencheCamposAlteracao() {
        //Preenche os campos de dados pessoais 
        jtfAlterarNome.setText(centroLogado.getNome());
        jtfAlterarCpfCnpj.setText(centroLogado.getCpf_cnpj());
        jtfAlterarEmail.setText(centroLogado.getEmail());
        jtfAlterarTelefone.setText(centroLogado.getTelefone());
        jtfAlterarNomeCentroRecebimento.setText(centroLogado.getNomeCentroRecebimento());

        //Preenche os campos de endereço
        jtfAlterarCep.setText(enderecoUsuarioLogado.getCep());
        jtfAlterarRua.setText(enderecoUsuarioLogado.getRua());
        jtfAlterarBairro.setText(enderecoUsuarioLogado.getBairro());
        jtfAlterarNumero.setText(String.valueOf(enderecoUsuarioLogado.getNumero()));
        jtfAlterarComplemento.setText(enderecoUsuarioLogado.getComplemento());
    }

    /*
    Metodo utilizado para popular o comboBox de estados na aba 
    de alteração de dados
    E definir o Estado e Cidade do usuaro
     */
    public void populaEstado() {
        cbAlterarEstado.removeAllItems();
        EstadoServico estadosServico = new EstadoServico();//Obijeto para realizar buscas no banco de dados
        List<Estado> estados = estadosServico.listaEstados();// Criação da lista com as siglas dos estados

        //interando lista e adicinando ao comboBox
        for (Estado estado : estados) {
            cbAlterarEstado.addItem(estado.getSiglaEstado());

        }
        //Definição do estaddo usuario no comboBox de Estados 
        cbAlterarEstado.setSelectedItem(enderecoUsuarioLogado.getEstadoEndereco());
        //Definição da cidade do usuario no comboBox de Cidade

        populaCidade();
        cbAlterarCidade.setSelectedItem(enderecoUsuarioLogado.getCidadeEndereco());
    }

    /*
    Metodo para criar lista de todas as cidades de um determinado estado
     */
    public void populaCidade() {
        cbAlterarCidade.removeAllItems();
        String uf = String.valueOf(cbAlterarEstado.getSelectedItem()); //Estado para listar cidades
        CidadeServico cidadeServico = new CidadeServico(); // Objeto para realizar buscas no banco
        List<Cidade> cidades = cidadeServico.listaCidade(uf); // Criação da lista com as cidades do estado escolhido 

        //Interando lista de cidades de adicionando ao comboBox de Cidades
        for (Cidade cidade : cidades) {
            cbAlterarCidade.addItem(cidade.getNomeCidade());
        }
    }

    public void atualizarCentroRecebimento() {
        CentroRecebimento centroAtualizado = new CentroRecebimento(
                jtfAlterarNome.getText(),
                jtfAlterarCpfCnpj.getText(),
                jtfAlterarTelefone.getText(),
                jtfAlterarEmail.getText(),
                jtfAlterarNomeCentroRecebimento.getText(),
                null,
                usuario.getIdUsuario());
        CentroRecebimentoServico centroServico = new CentroRecebimentoServico();
        CentroRecebimento centroValida = centroServico.atualizarDadosCentro(centroAtualizado);
        if (centroValida == null) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar dados pessoais", "Erro", JOptionPane.ERROR_MESSAGE);

        } else {
            usuario.setCentroLogado(centroAtualizado);
            centroLogado = centroAtualizado;
            JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso", "Atualizado", JOptionPane.INFORMATION_MESSAGE);
            painelCentroRecebimento.setSelectedIndex(0);
        }

    }

    public void atualizarEnderecoCentro() {
        String estado = String.valueOf(cbAlterarEstado.getSelectedItem());
        String cidade = String.valueOf(cbAlterarCidade.getSelectedItem());
        int numero = Integer.parseInt(jtfAlterarNumero.getText());
        Endereco enderecoAtualizado = new Endereco(
                estado,
                cidade,
                jtfAlterarCep.getText(),
                jtfAlterarRua.getText(),
                jtfAlterarBairro.getText(),
                numero,
                jtfAlterarComplemento.getText());

        EnderecoServico enderecoServico = new EnderecoServico();
        Endereco enderecoValida = enderecoServico.atualizarEnderecoCentro(enderecoAtualizado, usuario.getIdUsuario());
        if (enderecoValida == null) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar endereço", "Erro", JOptionPane.ERROR_MESSAGE);

        } else {
            usuario.setEnderecoUsuarioLogado(enderecoValida);
            enderecoUsuarioLogado = enderecoAtualizado;
            JOptionPane.showMessageDialog(this, "Endereço atualizado com sucesso", "Atualizado", JOptionPane.INFORMATION_MESSAGE);
            painelCentroRecebimento.setSelectedIndex(0);

        }

    }

    public boolean validarDadosPessoais() {
        if (jtfAlterarNome.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Erro", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if (jtfAlterarCpfCnpj.getText().length() == 11) {
            VerificaCpf verificarcpf = new VerificaCpf();
            verificarcpf.validaCpf(jtfAlterarCpfCnpj.getText());
            if (verificarcpf.isResultado() == false) {
                JOptionPane.showMessageDialog(this, "CPF invalido", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else if (jtfAlterarCpfCnpj.getText().length() != 11 && jtfAlterarCpfCnpj.getText().length() != 14) {

            return false;
        }
        if (jtfAlterarTelefone.getText().length() != 16) {
            JOptionPane.showMessageDialog(this, "Digite corretamente o telefone ", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!jtfAlterarEmail.getText().contains("@")) {
            JOptionPane.showMessageDialog(this, "Digite um E-mail valido", "Erro", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if (jtfAlterarNomeCentroRecebimento.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Digite um nome para o Centro de Recebimento", "Erro", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        return true;
    }

    public boolean validarEndereco() {
        if (jtfAlterarCep.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Digite um CEP valido", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String rua, bairro, numero;
        rua = jtfAlterarRua.getText();
        bairro = jtfAlterarBairro.getText();
        numero = jtfAlterarNumero.getText();
        if (rua.isBlank() || bairro.isBlank() || numero.isBlank()) {
            JOptionPane.showMessageDialog(this, "Digite o endereço completo", "Erro", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public void populaCategoria() {
        CategoriaItem selecioneCategoria = new CategoriaItem("Selecione a Categoria", 0);
        cbCategoria.addItem(selecioneCategoria);
        List<CategoriaItem> categorias = new ArrayList<>();
        CategoriaItemServico categoriaServico = new CategoriaItemServico();
        categorias = categoriaServico.buscaCategoria();
        for (CategoriaItem i : categorias) {
            cbCategoria.addItem(i);
        }

    }

    public void populaItens() {

        modeloTabelaItens.setRowCount(0);
        CategoriaItem categoria = (CategoriaItem) cbCategoria.getSelectedItem();

        ItemServico itemServico = new ItemServico();
        List<Item> itens = new ArrayList<>();
        itens = itemServico.buscaritens(categoria.getIdCategoria());

        for (Item i : itens) {
            Object item[] = {i, i.getIdItem()};
            modeloTabelaItens.addRow(item);

        }

    }

    public void adicionaItemSolicitado() {
        int quantidade = Integer.parseInt(String.valueOf(jsQuantidade.getValue()));
        int qtndLinhasSelecionadas = tabelaItens.getSelectedRowCount();
        boolean existe = false;
        if (qtndLinhasSelecionadas == 1) {
            if (quantidade != 0) {

                Object item = tabelaItens.getValueAt(tabelaItens.getSelectedRow(), 0);

                for (int i = 0; i < tabelaItensSolicitados.getRowCount(); i++) {
                    if (modeloTabelaItensSolicitados.getValueAt(i, 0).equals(item)) {
                        tabelaItensSolicitados.setValueAt(quantidade, i, 1);
                        existe = true;
                        break;
                    }
                }
                if (existe == false) {
                    Object[] novaLinha = {item, jsQuantidade.getValue()};
                    modeloTabelaItensSolicitados.addRow(novaLinha);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Informe a quantidade desejada !", "Quantidade", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item na lista", "Item", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public void salvarRequisicao() {
        Requisicao requisicaoValida = new Requisicao();
        RequisicaoServico requisicaoServico = new RequisicaoServico();
        for (int row = 0; row < tabelaItensSolicitados.getRowCount(); row++) {
            Item item = (Item) tabelaItensSolicitados.getValueAt(row, 0);
            int quantidade = (int) tabelaItensSolicitados.getValueAt(row, 1);
            Requisicao requisicao = new Requisicao(usuario.getIdUsuario(), item.getIdItem(), quantidade,StatusRequisicao.ABERTA);
            requisicaoValida = requisicaoServico.salvarRequisicao(requisicao);

        }
        if (requisicaoValida != null) {
            JOptionPane.showMessageDialog(this, "Solicitação salva com sucesso", "Salvo", JOptionPane.INFORMATION_MESSAGE);
            limpaRequisicao();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar Solicitação", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limpaRequisicao() {
        cbCategoria.setSelectedIndex(0);
        jsQuantidade.setValue(0);
        modeloTabelaItens.setRowCount(0);
        modeloTabelaItensSolicitados.setRowCount(0);
        painelCentroRecebimento.setSelectedIndex(0);
    }

    public void logOff() {
         int v = JOptionPane.showConfirmDialog(this, "Realmente deseja Sair?", "Sair", JOptionPane.YES_NO_OPTION);
        if (v == 0) {
            UsuarioLogado usuarioLogOff = new UsuarioLogado();
            usuarioLogOff.logOff();
            BoasVindas boasVindas = new BoasVindas();
            limpaRequisicao();
            boasVindas.setVisible(true);
            this.dispose();
        }
    }

public void setLabelBemVindo(){
    String nome = centroLogado.getNome();
    String nomeDividido[] = nome.split(" ");
    jlBemVindo.setText("Bem-Vindo " + nomeDividido[0]);
}
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
            java.util.logging.Logger.getLogger(PrincipalCentroRecebimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalCentroRecebimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalCentroRecebimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalCentroRecebimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalCentroRecebimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbAlterarCidade;
    private javax.swing.JComboBox<String> cbAlterarEstado;
    private javax.swing.JComboBox<CategoriaItem> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbAtualizarDados;
    private javax.swing.JButton jbAtualizarEndereco;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSolicitar;
    private javax.swing.JLabel jlBemVindo;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNomeItem;
    private javax.swing.JSpinner jsQuantidade;
    private javax.swing.JTextField jtfAlterarBairro;
    private javax.swing.JTextField jtfAlterarCep;
    private javax.swing.JTextField jtfAlterarComplemento;
    private javax.swing.JTextField jtfAlterarCpfCnpj;
    private javax.swing.JTextField jtfAlterarEmail;
    private javax.swing.JTextField jtfAlterarNome;
    private javax.swing.JTextField jtfAlterarNomeCentroRecebimento;
    private javax.swing.JTextField jtfAlterarNumero;
    private javax.swing.JTextField jtfAlterarRua;
    private javax.swing.JTextField jtfAlterarTelefone;
    private javax.swing.JPanel painelAdicionaItens;
    private javax.swing.JTabbedPane painelCentroRecebimento;
    private javax.swing.JPanel painelListaBanco;
    private javax.swing.JTable tabelaItens;
    private javax.swing.JTable tabelaItensSolicitados;
    // End of variables declaration//GEN-END:variables
}
