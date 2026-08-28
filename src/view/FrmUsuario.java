
package view;

import dao.UsuarioDAO;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Usuario;
import util.SessaoUsuario;

public class FrmUsuario extends javax.swing.JInternalFrame {

    private final UsuarioDAO usuarioDAO =
        new UsuarioDAO();

private long idUsuarioSelecionado = 0;
    
    public FrmUsuario() {
        initComponents();
          configurarTela();

    listarUsuarios();

    limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabUsuario = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        chkAtivo = new javax.swing.JCheckBox();
        cmbNivel = new javax.swing.JComboBox<>();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLocalizar = new javax.swing.JButton();
        cmbFiltro = new javax.swing.JComboBox<>();
        btnListarTodos = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnCarregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro De Usuários");

        txtCodigo.setEditable(false);
        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        txtLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));
        txtSenha.addActionListener(this::txtSenhaActionPerformed);

        chkAtivo.setText("Ativo");

        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USER", "MASTER" }));

        btnNovo.setText("Novo");
        btnNovo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNovo.addActionListener(this::btnNovoActionPerformed);

        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterar.addActionListener(this::btnAlterarActionPerformed);

        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Usuários");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 207, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAtivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        tabUsuario.addTab("Cadastro", jPanel1);

        btnLocalizar.setText("🔎Localizar");
        btnLocalizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLocalizar.addActionListener(this::btnLocalizarActionPerformed);

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOME", "LOGIN", "NIVEL", "ID" }));
        cmbFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar por:"));

        btnListarTodos.setText("📄Listar Todos");
        btnListarTodos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListarTodos.addActionListener(this::btnListarTodosActionPerformed);

        txtPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));
        txtPesquisa.addActionListener(this::txtPesquisaActionPerformed);

        btnCarregar.setText("⭕Carregar");
        btnCarregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCarregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarregarMouseClicked(evt);
            }
        });
        btnCarregar.addActionListener(this::btnCarregarActionPerformed);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consulta de Usuários");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnListarTodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabUsuario.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        limparCampos();

    tabUsuario.setSelectedIndex(0);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed


    if (idUsuarioSelecionado != 0) {

        JOptionPane.showMessageDialog(
                this,
                "Existe um usuário carregado para edição.\n"
                + "Utilize Alterar ou clique em Novo."
        );

        return;
    }

    if (!validarCampos(true)) {
        return;
    }

    try {

        Usuario usuario =
                criarUsuarioComCampos();

        long codigo =
                usuarioDAO.cadastrar(usuario);

        JOptionPane.showMessageDialog(
                this,
                "Usuário cadastrado com sucesso.\n"
                + "Código: "
                + codigo
        );

        limparCampos();
        listarUsuarios();

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Não foi possível cadastrar o usuário.\n"
                + erro.getMessage()
        );
    }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed


    if (idUsuarioSelecionado == 0) {

        JOptionPane.showMessageDialog(
                this,
                "Localize e carregue um usuário antes de alterar."
        );

        return;
    }

    if (!validarCampos(false)) {
        return;
    }

    Usuario usuarioLogado =
            SessaoUsuario.getUsuarioLogado();

    if (
            usuarioLogado != null
            && usuarioLogado.getIdUsuario()
            == idUsuarioSelecionado
            && !chkAtivo.isSelected()
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Você não pode desativar o usuário que está conectado."
        );

        return;
    }

    if (
            usuarioLogado != null
            && usuarioLogado.getIdUsuario()
            == idUsuarioSelecionado
            && !"MASTER".equals(
                    cmbNivel
                    .getSelectedItem()
                    .toString()
            )
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Você não pode retirar sua própria permissão MASTER durante a sessão."
        );

        return;
    }

    int resposta =
            JOptionPane.showConfirmDialog(
                    this,
                    "Deseja salvar as alterações deste usuário?",
                    "Alterar Usuário",
                    JOptionPane.YES_NO_OPTION
            );

    if (resposta != JOptionPane.YES_OPTION) {
        return;
    }

    try {

        Usuario usuario =
                criarUsuarioComCampos();

        boolean alterado =
                usuarioDAO.alterar(usuario);

        if (alterado) {

            JOptionPane.showMessageDialog(
                    this,
                    "Usuário alterado com sucesso."
            );

            limparCampos();
            listarUsuarios();
        }

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Não foi possível alterar o usuário.\n"
                + erro.getMessage()
        );
    }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed


    if (!SessaoUsuario.isMaster()) {

        JOptionPane.showMessageDialog(
                this,
                "Somente MASTER pode excluir usuários."
        );

        return;
    }

    if (idUsuarioSelecionado == 0) {

        JOptionPane.showMessageDialog(
                this,
                "Selecione um usuário."
        );

        return;
    }

    Usuario usuarioLogado =
            SessaoUsuario.getUsuarioLogado();

    if (
            usuarioLogado != null
            && usuarioLogado.getIdUsuario()
            == idUsuarioSelecionado
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Você não pode excluir o usuário que está conectado."
        );

        return;
    }

    int resposta =
            JOptionPane.showConfirmDialog(
                    this,
                    "Deseja realmente excluir este usuário?",
                    "Excluir Usuário",
                    JOptionPane.YES_NO_OPTION
            );

    if (resposta != JOptionPane.YES_OPTION) {
        return;
    }

    try {

        boolean excluido =
                usuarioDAO.excluir(
                        idUsuarioSelecionado
                );

        if (excluido) {

            JOptionPane.showMessageDialog(
                    this,
                    "Usuário excluído com sucesso."
            );

            limparCampos();
            listarUsuarios();
        }

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Não foi possível excluir o usuário.\n"
                + "Ele pode possuir compras ou vendas vinculadas.\n"
                + "Nesse caso, utilize a opção Ativo para desativá lo."
        );
    }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed


    String filtro =
            cmbFiltro
            .getSelectedItem()
            .toString();

    String pesquisa =
            txtPesquisa
            .getText()
            .trim();

    if (pesquisa.isEmpty()) {
        listarUsuarios();
        return;
    }

    if ("ID".equals(filtro)) {

        try {
            Long.parseLong(pesquisa);

        } catch (NumberFormatException erro) {

            JOptionPane.showMessageDialog(
                    this,
                    "Para pesquisar por ID informe apenas números."
            );

            return;
        }
    }

    try {

        List<Usuario> usuarios =
                usuarioDAO.pesquisar(
                        filtro,
                        pesquisa
                );

        preencherTabela(usuarios);

        if (usuarios.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Nenhum usuário encontrado."
            );
        }

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Erro na pesquisa.\n"
                + erro.getMessage()
        );
    }

    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void btnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodosActionPerformed

       txtPesquisa.setText("");
    listarUsuarios();
    }//GEN-LAST:event_btnListarTodosActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
 carregarUsuarioSelecionado();
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        if (
            evt.getClickCount() == 2
        ) {

            carregarUsuarioSelecionado();
        }
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnCarregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarregarMouseClicked
         if (evt.getClickCount() == 2) {
        carregarUsuarioSelecionado();
    }
    }//GEN-LAST:event_btnCarregarMouseClicked

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed


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
    private javax.swing.JComboBox<String> cmbNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
private void configurarTela() {

    if (!SessaoUsuario.isMaster()) {

        JOptionPane.showMessageDialog(
                this,
                "Acesso permitido somente para usuário MASTER."
        );

        dispose();
        return;
    }

    txtCodigo.setEditable(false);

    tblUsuarios.setModel(
            criarModeloTabela()
    );

    tblUsuarios.setSelectionMode(
            javax.swing.ListSelectionModel
                    .SINGLE_SELECTION
    );

    tblUsuarios.setAutoCreateRowSorter(true);
}
private DefaultTableModel criarModeloTabela() {

    return new DefaultTableModel(
            new Object[]{
                "Código",
                "Nome",
                "Login",
                "Nível",
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
        List<Usuario> usuarios
) {

    DefaultTableModel modelo =
            (DefaultTableModel)
            tblUsuarios.getModel();

    modelo.setRowCount(0);

    for (Usuario usuario : usuarios) {

        modelo.addRow(
                new Object[]{
                    usuario.getIdUsuario(),
                    usuario.getNome(),
                    usuario.getLogin(),
                    usuario.getNivel(),
                    usuario.isAtivo()
                            ? "Sim"
                            : "Não"
                }
        );
    }
}
private void listarUsuarios() {

    try {

        preencherTabela(
                usuarioDAO.listarTodos()
        );

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Erro ao carregar usuários.\n"
                + erro.getMessage()
        );
    }
}
private void limparCampos() {

    idUsuarioSelecionado = 0;

    txtCodigo.setText("");
    txtNome.setText("");
    txtLogin.setText("");
    txtSenha.setText("");

    cmbNivel.setSelectedItem("USER");

    chkAtivo.setSelected(true);

    txtNome.requestFocus();
}
private boolean validarCampos(
        boolean novoUsuario
) {

    if (
            txtNome
            .getText()
            .trim()
            .isEmpty()
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Informe o nome."
        );

        txtNome.requestFocus();
        return false;
    }

    if (
            txtLogin
            .getText()
            .trim()
            .isEmpty()
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Informe o login."
        );

        txtLogin.requestFocus();
        return false;
    }

    if (
            novoUsuario
            && txtSenha
                    .getPassword()
                    .length == 0
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Informe a senha."
        );

        txtSenha.requestFocus();
        return false;
    }

    if (
            usuarioDAO.loginExiste(
                    txtLogin
                    .getText()
                    .trim(),
                    idUsuarioSelecionado
            )
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Este login já está sendo utilizado."
        );

        txtLogin.requestFocus();
        return false;
    }

    return true;
}
private Usuario criarUsuarioComCampos() {

    Usuario usuario =
            new Usuario();

    usuario.setIdUsuario(
            idUsuarioSelecionado
    );

    usuario.setNome(
            txtNome.getText().trim()
    );

    usuario.setLogin(
            txtLogin.getText().trim()
    );

    usuario.setSenha(
            new String(
                    txtSenha.getPassword()
            )
    );

    usuario.setNivel(
            cmbNivel
            .getSelectedItem()
            .toString()
    );

    usuario.setAtivo(
            chkAtivo.isSelected()
    );

    return usuario;
}
private void carregarUsuarioSelecionado() {

    int linha =
            tblUsuarios.getSelectedRow();

    if (linha < 0) {

        JOptionPane.showMessageDialog(
                this,
                "Selecione um usuário."
        );

        return;
    }

    int linhaModelo =
            tblUsuarios.convertRowIndexToModel(
                    linha
            );

    long idUsuario =
            Long.parseLong(
                    tblUsuarios
                    .getModel()
                    .getValueAt(
                            linhaModelo,
                            0
                    )
                    .toString()
            );

    try {

        Usuario usuario =
                usuarioDAO.buscarPorId(
                        idUsuario
                );

        if (usuario == null) {

            JOptionPane.showMessageDialog(
                    this,
                    "Usuário não encontrado."
            );

            return;
        }

        preencherCampos(usuario);

        tabUsuario.setSelectedIndex(0);

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Erro ao carregar usuário.\n"
                + erro.getMessage()
        );
    }
}
private void preencherCampos(
        Usuario usuario
) {

    idUsuarioSelecionado =
            usuario.getIdUsuario();

    txtCodigo.setText(
            String.valueOf(
                    usuario.getIdUsuario()
            )
    );

    txtNome.setText(
            usuario.getNome()
    );

    txtLogin.setText(
            usuario.getLogin()
    );

    txtSenha.setText("");

    cmbNivel.setSelectedItem(
            usuario.getNivel()
    );

    chkAtivo.setSelected(
            usuario.isAtivo()
    );
}
}
