
package view;

import dao.ProdutoDAO;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Produto;
import util.SessaoUsuario;

public class FrmProduto extends javax.swing.JInternalFrame {
 
    private final ProdutoDAO produtoDAO =
        new ProdutoDAO();

private long idProdutoSelecionado = 0;

private final DecimalFormat formatoValor =
        new DecimalFormat("#,##0.00");

private final DecimalFormat formatoQuantidade =
        new DecimalFormat("#,##0.000");
   
    public FrmProduto() {
        initComponents();
         configurarTela();

    listarProdutos();

    limparCampos();
     tabProduto.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabProduto = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        cmbUnidade = new javax.swing.JComboBox<>();
        txtPrecoCusto = new javax.swing.JTextField();
        txtPrecoVenda = new javax.swing.JTextField();
        txtEstoqueAtual = new javax.swing.JTextField();
        txtEstoqueMinimo = new javax.swing.JTextField();
        chkAtivo = new javax.swing.JCheckBox();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnLocalizar = new javax.swing.JButton();
        cmbFiltro = new javax.swing.JComboBox<>();
        btnListarTodos = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnCarregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        btnEstoqueBaixo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Produtos");

        txtCodigo.setEditable(false);
        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));

        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));

        cmbUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UN", "KG", "G", "L", "ML", "M", "CM", "CX", "PC", "PCT" }));

        txtPrecoCusto.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço de Custo"));

        txtPrecoVenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço de Venda"));

        txtEstoqueAtual.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque Atual"));

        txtEstoqueMinimo.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque Mínimo"));

        chkAtivo.setText("Ativo");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(this::btnNovoActionPerformed);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(this::btnAlterarActionPerformed);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(70, 70, 70)
                        .addComponent(btnSalvar)
                        .addGap(59, 59, 59)
                        .addComponent(btnAlterar)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPrecoCusto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addGap(45, 45, 45)
                .addComponent(btnCancelar)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUnidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkAtivo)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo))
                .addGap(26, 26, 26))
        );

        tabProduto.addTab("Cadastro", jPanel1);

        btnLocalizar.setText("🔎Localizar");
        btnLocalizar.addActionListener(this::btnLocalizarActionPerformed);

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DESCRICAO", "ID", "UNIDADE" }));
        cmbFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar por:"));

        btnListarTodos.setText("📄Listar Todos");
        btnListarTodos.addActionListener(this::btnListarTodosActionPerformed);

        txtPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));
        txtPesquisa.addActionListener(this::txtPesquisaActionPerformed);

        btnCarregar.setText("⭕Carregar");
        btnCarregar.addActionListener(this::btnCarregarActionPerformed);

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaProdutos);

        btnEstoqueBaixo.setText("Estoque baixo");
        btnEstoqueBaixo.addActionListener(this::btnEstoqueBaixoActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnLocalizar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(btnListarTodos)
                                .addGap(62, 62, 62)
                                .addComponent(btnCarregar)
                                .addGap(45, 45, 45)
                                .addComponent(btnEstoqueBaixo)))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListarTodos)
                            .addComponent(btnCarregar))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEstoqueBaixo)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabProduto.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabProduto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabProduto)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
      
    limparCampos();

    tabProduto.setSelectedIndex(
            0
    );
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed


    if (
            idProdutoSelecionado != 0
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Existe um produto carregado para edição.\n"
                + "Utilize Alterar ou clique em Novo."
        );

        return;
    }

    if (!validarCampos()) {

        return;
    }

    try {

        Produto produto =
                criarProdutoComCampos();

        long codigo =
                produtoDAO.cadastrar(
                        produto
                );

        JOptionPane.showMessageDialog(
                this,
                "Produto cadastrado com sucesso.\n"
                + "Código: "
                + codigo
        );

        limparCampos();

        listarProdutos();

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Não foi possível cadastrar o produto.\n"
                + erro.getMessage()
        );
    }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

 

    if (
            idProdutoSelecionado == 0
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Localize e carregue um produto antes de alterar."
        );

        return;
    }

    if (!validarCampos()) {

        return;
    }

    int resposta =
            JOptionPane.showConfirmDialog(
                    this,
                    "Deseja salvar as alterações deste produto?",
                    "Alterar Produto",
                    JOptionPane.YES_NO_OPTION
            );

    if (
            resposta
            != JOptionPane.YES_OPTION
    ) {

        return;
    }

    try {

        Produto produto =
                criarProdutoComCampos();

        boolean alterado =
                produtoDAO.alterar(
                        produto
                );

        if (alterado) {

            JOptionPane.showMessageDialog(
                    this,
                    "Produto alterado com sucesso."
            );

            limparCampos();

            listarProdutos();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Nenhum registro foi alterado."
            );
        }

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Não foi possível alterar o produto.\n"
                + erro.getMessage()
        );
    }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed


    if (
            !SessaoUsuario.isMaster()
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Você não possui permissão para excluir produtos."
        );

        return;
    }

    if (
            idProdutoSelecionado == 0
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Localize e carregue um produto antes de excluir."
        );

        return;
    }

    int resposta =
            JOptionPane.showConfirmDialog(
                    this,
                    "Deseja realmente excluir este produto?",
                    "Excluir Produto",
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
                produtoDAO.excluir(
                        idProdutoSelecionado
                );

        if (excluido) {

            JOptionPane.showMessageDialog(
                    this,
                    "Produto excluído com sucesso."
            );

            limparCampos();

            listarProdutos();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Produto não encontrado."
            );
        }

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Não foi possível excluir o produto.\n"
                + "Ele pode possuir compras ou vendas vinculadas.\n"
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

        listarProdutos();

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

        List<Produto> produtos =
                produtoDAO.pesquisar(
                        filtro,
                        pesquisa
                );

        preencherTabela(
                produtos
        );

        if (
                produtos.isEmpty()
        ) {

            JOptionPane.showMessageDialog(
                    this,
                    "Nenhum produto encontrado."
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

    listarProdutos();

    carregarProdutoSelecionado();
    }//GEN-LAST:event_btnListarTodosActionPerformed

    
    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed

        int linha =
        TabelaProdutos.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(
                this,
                "Selecione um cliente na tabela."
            );

            return;
        }

        int linhaModelo =
        TabelaProdutos.convertRowIndexToModel(
            linha
        );

        long idProduto =
        Long.parseLong(
            TabelaProdutos
            .getModel()
            .getValueAt(
                linhaModelo,
                0
            )
            .toString()
        );

        try {

            Produto produto = ProdutoDAO.buscarPorId(idProduto);

            if (produto == null) {

                JOptionPane.showMessageDialog(
                    this,
                    "produto não encontrado."
                );

                return;
            }

            preencherCampos(
                produto
            );

            tabProduto.setSelectedIndex(0);

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(
                this,
                "Erro ao carregar cliente.\n"
                + erro.getMessage()
            );
        }

        carregarProdutoSelecionado();
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void TabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutosMouseClicked
       if (
            evt.getClickCount() == 2
    ) {

        carregarProdutoSelecionado();
    }
    }//GEN-LAST:event_TabelaProdutosMouseClicked

    private void btnEstoqueBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueBaixoActionPerformed


    try {

        List<Produto> produtos =
                produtoDAO.listarEstoqueBaixo();

        preencherTabela(
                produtos
        );

        if (
                produtos.isEmpty()
        ) {

            JOptionPane.showMessageDialog(
                    this,
                    "Nenhum produto está com estoque baixo."
            );
        }

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Erro ao consultar estoque baixo.\n"
                + erro.getMessage()
        );
    }

    }//GEN-LAST:event_btnEstoqueBaixoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnEstoqueBaixo;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> cmbUnidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabProduto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueAtual;
    private javax.swing.JTextField txtEstoqueMinimo;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPrecoCusto;
    private javax.swing.JTextField txtPrecoVenda;
    // End of variables declaration//GEN-END:variables
private void configurarTela() {

    txtCodigo.setEditable(false);

    btnExcluir.setEnabled(
            SessaoUsuario.isMaster()
    );

    TabelaProdutos.setSelectionMode(
            javax.swing.ListSelectionModel
                    .SINGLE_SELECTION
    );

    TabelaProdutos.setAutoCreateRowSorter(
            true
    );

    TabelaProdutos.setModel(
            criarModeloTabela()
    );
}
private DefaultTableModel criarModeloTabela() {

    return new DefaultTableModel(
            new Object[]{
                "Código",
                "Descrição",
                "Unidade",
                "Preço de Custo",
                "Preço de Venda",
                "Estoque",
                "Estoque Mínimo",
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
        List<Produto> produtos
) {

    DefaultTableModel modelo =
            (DefaultTableModel)
            TabelaProdutos.getModel();

    modelo.setRowCount(0);

    for (
            Produto produto :
            produtos
    ) {

        modelo.addRow(
                new Object[]{
                    produto.getIdProduto(),
                    produto.getDescricao(),
                    produto.getUnidade(),
                    formatoValor.format(
                            produto.getPrecoCusto()
                    ),
                    formatoValor.format(
                            produto.getPrecoVenda()
                    ),
                    formatoQuantidade.format(
                            produto.getEstoque()
                    ),
                    formatoQuantidade.format(
                            produto.getEstoqueMinimo()
                    ),
                    produto.isAtivo()
                            ? "Sim"
                            : "Não"
                }
        );
    }
}
private void listarProdutos() {

    try {

        preencherTabela(
                produtoDAO.listarTodos()
        );

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Erro ao carregar produtos.\n"
                + erro.getMessage()
        );
    }
}

private void limparCampos() {

    idProdutoSelecionado = 0;

    txtCodigo.setText("");

    txtDescricao.setText("");

    cmbUnidade.setSelectedIndex(0);

    txtPrecoCusto.setText("0,00");

    txtPrecoVenda.setText("0,00");

    txtEstoqueAtual.setText("0,000");

    txtEstoqueMinimo.setText("0,000");

    chkAtivo.setSelected(true);

    txtDescricao.requestFocus();
}
private BigDecimal converterDecimal(
        String texto
) {

    String valor =
            texto
            .trim()
            .replace(".", "")
            .replace(",", ".");

    return new BigDecimal(
            valor
    );
}
private boolean validarCampos() {

    if (
            txtDescricao
            .getText()
            .trim()
            .isEmpty()
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Informe a descrição do produto."
        );

        txtDescricao.requestFocus();

        return false;
    }

    if (
            cmbUnidade.getSelectedItem() == null
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Selecione a unidade."
        );

        cmbUnidade.requestFocus();

        return false;
    }

    try {

        BigDecimal precoCusto =
                converterDecimal(
                        txtPrecoCusto.getText()
                );

        BigDecimal precoVenda =
                converterDecimal(
                        txtPrecoVenda.getText()
                );

        BigDecimal estoque =
                converterDecimal(
                        txtEstoqueAtual.getText()
                );

        BigDecimal estoqueMinimo =
                converterDecimal(
                        txtEstoqueMinimo.getText()
                );

        if (
                precoCusto.compareTo(
                        BigDecimal.ZERO
                ) < 0
        ) {

            JOptionPane.showMessageDialog(
                    this,
                    "O preço de custo não pode ser negativo."
            );

            return false;
        }

        if (
                precoVenda.compareTo(
                        BigDecimal.ZERO
                ) < 0
        ) {

            JOptionPane.showMessageDialog(
                    this,
                    "O preço de venda não pode ser negativo."
            );

            return false;
        }

        if (
                estoque.compareTo(
                        BigDecimal.ZERO
                ) < 0
        ) {

            JOptionPane.showMessageDialog(
                    this,
                    "O estoque não pode ser negativo."
            );

            return false;
        }

        if (
                estoqueMinimo.compareTo(
                        BigDecimal.ZERO
                ) < 0
        ) {

            JOptionPane.showMessageDialog(
                    this,
                    "O estoque mínimo não pode ser negativo."
            );

            return false;
        }

    } catch (
            NumberFormatException erro
    ) {

        JOptionPane.showMessageDialog(
                this,
                "Informe valores numéricos válidos."
        );

        return false;
    }

    return true;
}
private Produto criarProdutoComCampos() {

    Produto produto =
            new Produto();

    produto.setIdProduto(
            idProdutoSelecionado
    );

    produto.setDescricao(
            txtDescricao
            .getText()
            .trim()
    );

    produto.setUnidade(
            cmbUnidade
            .getSelectedItem()
            .toString()
    );

    produto.setPrecoCusto(
            converterDecimal(
                    txtPrecoCusto.getText()
            )
    );

    produto.setPrecoVenda(
            converterDecimal(
                    txtPrecoVenda.getText()
            )
    );

    produto.setEstoque(
            converterDecimal(
                    txtEstoqueAtual.getText()
            )
    );

    produto.setEstoqueMinimo(
            converterDecimal(
                    txtEstoqueMinimo.getText()
            )
    );

    produto.setAtivo(
            chkAtivo.isSelected()
    );

    return produto;
}
private void carregarProdutoSelecionado() {

    int linha =
            TabelaProdutos
            .getSelectedRow();

    if (linha == -1) {

        JOptionPane.showMessageDialog(
                this,
                "Selecione um produto na tabela."
        );

        return;
    }

    int linhaModelo =
            TabelaProdutos
            .convertRowIndexToModel(
                    linha
            );

    long idProduto =
            Long.parseLong(
                    TabelaProdutos
                    .getModel()
                    .getValueAt(
                            linhaModelo,
                            0
                    )
                    .toString()
            );

    try {

        Produto produto =
                produtoDAO.buscarPorId(
                        idProduto
                );

        if (
                produto == null
        ) {

            JOptionPane.showMessageDialog(
                    this,
                    "Produto não encontrado."
            );

            return;
        }

        preencherCampos(
                produto
        );

        tabProduto.setSelectedIndex(
                0
        );

    } catch (Exception erro) {

        JOptionPane.showMessageDialog(
                this,
                "Erro ao carregar produto.\n"
                + erro.getMessage()
        );
    }
}
private void preencherCampos(
        Produto produto
) {

    idProdutoSelecionado =
            produto.getIdProduto();

    txtCodigo.setText(
            String.valueOf(
                    produto.getIdProduto()
            )
    );

    txtDescricao.setText(
            produto.getDescricao()
    );

    cmbUnidade.setSelectedItem(
            produto.getUnidade()
    );

    txtPrecoCusto.setText(
            produto
            .getPrecoCusto()
            .toPlainString()
            .replace(".", ",")
    );

    txtPrecoVenda.setText(
            produto
            .getPrecoVenda()
            .toPlainString()
            .replace(".", ",")
    );

    txtEstoqueAtual.setText(
            produto
            .getEstoque()
            .toPlainString()
            .replace(".", ",")
    );

    txtEstoqueMinimo.setText(
            produto
            .getEstoqueMinimo()
            .toPlainString()
            .replace(".", ",")
    );

    chkAtivo.setSelected(
            produto.isAtivo()
    );
}
}
