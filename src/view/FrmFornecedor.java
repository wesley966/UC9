
package view;

import dao.FornecedorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Fornecedor;
import util.SessaoUsuario;

public class FrmFornecedor extends javax.swing.JInternalFrame {

    private final FornecedorDAO fornecedorDAO =
        new FornecedorDAO();

private long idFornecedorSelecionado = 0;
    
    public FrmFornecedor() {
        initComponents();
         configurarTela();

    listarFornecedores();

    limparCampos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabFornecedores = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnLocalizar = new javax.swing.JButton();
        cmbFiltro = new javax.swing.JComboBox<>();
        btnListarTodos = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnCarregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtComplemento = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        chkAtivo = new javax.swing.JCheckBox();
        cmbUF = new javax.swing.JComboBox<>();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        txtNomeFantasia = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        txtCidade = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        txtBairro = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Fornecedores");

        btnLocalizar.setText("🔎Localizar");
        btnLocalizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLocalizar.addActionListener(this::btnLocalizarActionPerformed);

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RAZAO SOCIAL", "NOME FANTASIA", "ID", "CNPJ", "EMAIL", " " }));
        cmbFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar por:"));

        btnListarTodos.setText("📄Listar Todos");
        btnListarTodos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListarTodos.addActionListener(this::btnListarTodosActionPerformed);

        txtPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));
        txtPesquisa.addActionListener(this::txtPesquisaActionPerformed);

        btnCarregar.setText("⭕Carregar");
        btnCarregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCarregar.addActionListener(this::btnCarregarActionPerformed);

        tabelaFornecedores.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png")))); // NOI18N
        tabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedores);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de Fornecedores");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btnCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabFornecedores.addTab("Consulta", jPanel2);

        txtComplemento.setBorder(javax.swing.BorderFactory.createTitledBorder("Complemento"));

        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Número"));

        txtCEP.setBorder(javax.swing.BorderFactory.createTitledBorder("CEP"));
        txtCEP.addActionListener(this::txtCEPActionPerformed);

        chkAtivo.setText("Ativo");

        cmbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cmbUF.setBorder(javax.swing.BorderFactory.createTitledBorder("UF"));

        btnNovo.setText("🆕Novo");
        btnNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNovo.addActionListener(this::btnNovoActionPerformed);

        btnSalvar.setText("💽Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        btnAlterar.setText("⚙️Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterar.addActionListener(this::btnAlterarActionPerformed);

        txtCodigo.setEditable(false);
        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        txtCodigo.addActionListener(this::txtCodigoActionPerformed);

        txtRazaoSocial.setBorder(javax.swing.BorderFactory.createTitledBorder("Razão Social"));

        txtNomeFantasia.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome Fantasía"));

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("E-Mail"));

        txtCnpj.setBorder(javax.swing.BorderFactory.createTitledBorder("CNPJ"));

        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));

        btnExcluir.setText("❌Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        txtCidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Cidade"));

        btnCancelar.setText("🚩Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        txtBairro.setBorder(javax.swing.BorderFactory.createTitledBorder("Bairro"));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastro de Fornecedores");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkAtivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCidade)
                                .addGap(12, 12, 12)
                                .addComponent(cmbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeFantasia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAtivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        tabFornecedores.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabFornecedores)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabFornecedores)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       
    limparCampos();

    tabFornecedores.setSelectedIndex(
            0
    );
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
 

    if (
            idFornecedorSelecionado != 0
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Existe um fornecedor carregado para edição."
                + "Utilize Alterar ou clique em Novo."
        );

        return;
    }

    if (!validarCampos()) {

        return;
    }

    try {

        Fornecedor fornecedor =
                criarFornecedorComCampos();

        long codigo =
                fornecedorDAO.cadastrar(
                        fornecedor
                );

        JOptionPane.showMessageDialog(
                this,
                "Fornecedor cadastrado com sucesso."
                + "Código: "
                + codigo
        );

        limparCampos();

        listarFornecedores();

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Não foi possível cadastrar o fornecedor."
                + erro.getMessage()
        );
    }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed


    if (
            idFornecedorSelecionado == 0
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Localize e carregue um fornecedor antes de alterar."
        );

        return;
    }

    if (!validarCampos()) {

        return;
    }

    int resposta =
            JOptionPane.showConfirmDialog(
                    this,
                    "Deseja salvar as alterações deste fornecedor?",
                    "Alterar Fornecedor",
                    JOptionPane.YES_NO_OPTION
            );

    if (
            resposta
            != JOptionPane.YES_OPTION
    ) {

        return;
    }

    try {

        Fornecedor fornecedor =
                criarFornecedorComCampos();

        boolean alterado =
                fornecedorDAO.alterar(
                        fornecedor
                );

        if (alterado) {

            JOptionPane.showMessageDialog(
                    this,
                    "Fornecedor alterado com sucesso."
            );

            limparCampos();

            listarFornecedores();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Nenhum registro foi alterado."
            );
        }

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Não foi possível alterar o fornecedor."
                + erro.getMessage()
        );
    }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

  

    if (
            !SessaoUsuario.isMaster()
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Você não possui permissão para excluir fornecedores."
        );

        return;
    }

    if (
            idFornecedorSelecionado == 0
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Localize e carregue um fornecedor antes de excluir."
        );

        return;
    }

    int resposta =
            JOptionPane.showConfirmDialog(
                    this,
                    "Deseja realmente excluir este fornecedor?",
                    "Excluir Fornecedor",
                    JOptionPane.YES_NO_OPTION
            );

    if (
            resposta
            != JOptionPane.YES_OPTION
    ) {

        return;
    }

    try {

        boolean excluido =
                fornecedorDAO.excluir(
                        idFornecedorSelecionado
                );

        if (excluido) {

            JOptionPane.showMessageDialog(
                    this,
                    "Fornecedor excluído com sucesso."
            );

            limparCampos();

            listarFornecedores();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Fornecedor não encontrado."
            );
        }

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Não foi possível excluir o fornecedor."
                + "Ele pode possuir compras vinculadas."
                + erro.getMessage()
        );
    }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed

    String pesquisa =
            txtPesquisa
            .getText()
            .trim();

    String filtro =
            cmbFiltro
            .getSelectedItem()
            .toString();

    if (pesquisa.isEmpty()) {

        listarFornecedores();

        return;
    }

    if (
            filtro.equals("ID")
    ) {

        try {

            Long.parseLong(
                    pesquisa
            );

        } catch (
                NumberFormatException erro
        ) {

            JOptionPane.showMessageDialog(
                    this,
                    "Para pesquisar por ID informe apenas números."
            );

            txtPesquisa.requestFocus();

            return;
        }
    }

    try {

        List<Fornecedor> fornecedores =
                fornecedorDAO.pesquisar(
                        filtro,
                        pesquisa
                );

        preencherTabela(
                fornecedores
        );

        if (
                fornecedores.isEmpty()
        ) {

            JOptionPane.showMessageDialog(
                    this,
                    "Nenhum fornecedor encontrado."
            );
        }

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Erro na pesquisa."
                + erro.getMessage()
        );
    }

    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void btnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodosActionPerformed
       
    txtPesquisa.setText("");

    listarFornecedores();

    }//GEN-LAST:event_btnListarTodosActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed

        int linha =
        tabelaFornecedores.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(
                this,
                "Selecione um cliente na tabela."
            );

            return;
        }

        int linhaModelo =
        tabelaFornecedores.convertRowIndexToModel(
            linha
        );

        long idCliente =
        Long.parseLong(
            tabelaFornecedores
            .getModel()
            .getValueAt(
                linhaModelo,
                0
            )
            .toString()
        );

        try {

            Fornecedor cliente =
            FornecedorDAO.buscarPorId(
                idCliente
            );

            if (cliente == null) {

                JOptionPane.showMessageDialog(
                    this,
                    "Cliente não encontrado."
                );

                return;
            }

            preencherCampos(
                cliente
            );

            tabFornecedores.setSelectedIndex(
                0
            );

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(
                this,
                "Erro ao carregar cliente.\n"
                + erro.getMessage()
            );
        }

        carregarClienteSelecionado();
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void tabelaFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedoresMouseClicked
        if (
            evt.getClickCount() == 2
    ) {

        carregarFornecedorSelecionado();
    }
    }//GEN-LAST:event_tabelaFornecedoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> cmbUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabFornecedores;
    private javax.swing.JTable tabelaFornecedores;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

private void configurarTela() {

    txtCodigo.setEditable(false);

    btnExcluir.setEnabled(
            SessaoUsuario.isMaster()
    );

    tabelaFornecedores.setSelectionMode(
            javax.swing.ListSelectionModel
                    .SINGLE_SELECTION
    );

    tabelaFornecedores.setAutoCreateRowSorter(
            true
    );

    tabelaFornecedores.setModel(
            criarModeloTabela()
    );
}
private DefaultTableModel criarModeloTabela() {

    return new DefaultTableModel(
            new Object[]{
                "Código",
                "Razão Social",
                "Nome Fantasia",
                "CNPJ",
                "Telefone",
                "Email",
                "Cidade",
                "UF",
                "Ativo"
            },
            0
    ) {

        @Override
        public boolean isCellEditable(
                int row,
                int column
        ) {

            return false;
        }
    };
}
private void preencherTabela(
        List<Fornecedor> fornecedores
) {

    DefaultTableModel modelo =
            (DefaultTableModel)
            tabelaFornecedores.getModel();

    modelo.setRowCount(0);

    for (
            Fornecedor fornecedor :
            fornecedores
    ) {

        modelo.addRow(
                new Object[]{
                    fornecedor.getIdFornecedor(),
                    fornecedor.getRazaoSocial(),
                    fornecedor.getNomeFantasia(),
                    fornecedor.getCnpj(),
                    fornecedor.getTelefone(),
                    fornecedor.getEmail(),
                    fornecedor.getCidade(),
                    fornecedor.getUf(),
                    fornecedor.isAtivo()
                            ? "Sim"
                            : "Não"
                }
        );
    }
}
private void listarFornecedores() {

    try {

        preencherTabela(
                fornecedorDAO.listarTodos()
        );

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Erro ao carregar fornecedores."
                + erro.getMessage()
        );
    }
}
private void limparCampos() {

    idFornecedorSelecionado = 0;

    txtCodigo.setText("");
    txtRazaoSocial.setText("");
    txtNomeFantasia.setText("");
    txtCnpj.setText("");
    txtTelefone.setText("");
    txtEmail.setText("");
    txtEndereco.setText("");
    txtNumero.setText("");
    txtComplemento.setText("");
    txtBairro.setText("");
    txtCidade.setText("");
    txtCEP.setText("");

    cmbUF.setSelectedIndex(0);

    chkAtivo.setSelected(true);

    txtRazaoSocial.requestFocus();
}
private boolean validarCampos() {

    if (
            txtRazaoSocial
            .getText()
            .trim()
            .isEmpty()
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Informe a razão social."
        );

        txtRazaoSocial.requestFocus();

        return false;
    }

    if (
            txtCnpj
            .getText()
            .trim()
            .isEmpty()
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Informe o CNPJ."
        );

        txtCnpj.requestFocus();

        return false;
    }

    if (
            cmbUF.getSelectedIndex() == 0
            && !txtCidade
                    .getText()
                    .trim()
                    .isEmpty()
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Selecione a UF."
        );

        cmbUF.requestFocus();

        return false;
    }

    return true;
}
private Fornecedor criarFornecedorComCampos() {

    Fornecedor fornecedor =
            new Fornecedor();

    fornecedor.setIdFornecedor(
            idFornecedorSelecionado
    );

    fornecedor.setRazaoSocial(
            txtRazaoSocial.getText().trim()
    );

    fornecedor.setNomeFantasia(
            txtNomeFantasia.getText().trim()
    );

    fornecedor.setCnpj(
            txtCnpj.getText().trim()
    );

    fornecedor.setTelefone(
            txtTelefone.getText().trim()
    );

    fornecedor.setEmail(
            txtEmail.getText().trim()
    );

    fornecedor.setEndereco(
            txtEndereco.getText().trim()
    );

    fornecedor.setNumero(
            txtNumero.getText().trim()
    );

    fornecedor.setComplemento(
            txtComplemento.getText().trim()
    );

    fornecedor.setBairro(
            txtBairro.getText().trim()
    );

    fornecedor.setCidade(
            txtCidade.getText().trim()
    );

    if (
            cmbUF.getSelectedIndex() > 0
    ) {

        fornecedor.setUf(
                cmbUF
                .getSelectedItem()
                .toString()
        );

    } else {

        fornecedor.setUf("");
    }

    fornecedor.setCep(
            txtCEP.getText().trim()
    );

    fornecedor.setAtivo(
            chkAtivo.isSelected()
    );

    return fornecedor;
}
private void carregarFornecedorSelecionado() {

    int linha =
            tabelaFornecedores
            .getSelectedRow();

    if (linha == -1) {

        JOptionPane.showMessageDialog(
                this,
                "Selecione um fornecedor na tabela."
        );

        return;
    }

    int linhaModelo =
            tabelaFornecedores
            .convertRowIndexToModel(
                    linha
            );

    long idFornecedor =
            Long.parseLong(tabelaFornecedores
                    .getModel()
                    .getValueAt(
                            linhaModelo,
                            0
                    )
                    .toString()
            );

    try {

        Fornecedor fornecedor =
                fornecedorDAO.buscarPorId(
                        idFornecedor
                );

        if (
                fornecedor == null
        ) {

            JOptionPane.showMessageDialog(
                    this,
                    "Fornecedor não encontrado."
            );

            return;
        }

        preencherCampos(
                fornecedor
        );

        tabFornecedores.setSelectedIndex(
                0
        );

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Erro ao carregar fornecedor."
                + erro.getMessage()
        );
    }
}
private void preencherCampos(
        Fornecedor fornecedor
) {

    idFornecedorSelecionado =
            fornecedor.getIdFornecedor();

    txtCodigo.setText(
            String.valueOf(
                    fornecedor.getIdFornecedor()
            )
    );

    txtRazaoSocial.setText(
            valorTexto(
                    fornecedor.getRazaoSocial()
            )
    );

    txtNomeFantasia.setText(
            valorTexto(
                    fornecedor.getNomeFantasia()
            )
    );

    txtCnpj.setText(
            valorTexto(
                    fornecedor.getCnpj()
            )
    );

    txtTelefone.setText(
            valorTexto(
                    fornecedor.getTelefone()
            )
    );

    txtEmail.setText(
            valorTexto(
                    fornecedor.getEmail()
            )
    );

    txtEndereco.setText(
            valorTexto(
                    fornecedor.getEndereco()
            )
    );

    txtNumero.setText(
            valorTexto(
                    fornecedor.getNumero()
            )
    );

    txtComplemento.setText(
            valorTexto(
                    fornecedor.getComplemento()
            )
    );

    txtBairro.setText(
            valorTexto(
                    fornecedor.getBairro()
            )
    );

    txtCidade.setText(
            valorTexto(
                    fornecedor.getCidade()
            )
    );

    txtCEP.setText(
            valorTexto(
                    fornecedor.getCep()
            )
    );

    if (
            fornecedor.getUf() != null
            && !fornecedor
                    .getUf()
                    .isBlank()
    ) {

        cmbUF.setSelectedItem(
                fornecedor.getUf()
        );

    } else {

        cmbUF.setSelectedIndex(
                0
        );
    }

    chkAtivo.setSelected(
            fornecedor.isAtivo()
    );
}
private String valorTexto(
        String valor
) {

    if (valor == null) {

        return "";
    }

    return valor;
}
private void carregarClienteSelecionado() {

    int linha =
            tabelaFornecedores.getSelectedRow();

    if (linha == -1) {

        JOptionPane.showMessageDialog(
                this,
                "Selecione um cliente na tabela."
        );

        return;
    }

    int linhaModelo =
            tabelaFornecedores.convertRowIndexToModel(
                    linha
            );

    long idCliente =
            Long.parseLong(tabelaFornecedores
                    .getModel()
                    .getValueAt(
                            linhaModelo,
                            0
                    )
                    .toString()
            );

    try {

        Fornecedor fornecedor =
                FornecedorDAO.buscarPorId(
                        idCliente
                );

        if (fornecedor == null) {

            JOptionPane.showMessageDialog(
                    this,
                    "Cliente não encontrado."
            );

            return;
        }

        preencherCampos(
                fornecedor
        );

        tabFornecedores.setSelectedIndex(
                0
        );

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Erro ao carregar cliente.\n"
                + erro.getMessage()
        );
    }
}
}
