
package view;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import model.Usuario;
import util.SessaoUsuario;


public class FrmPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmPrincipal.class.getName());

  
    public FrmPrincipal() {
        initComponents();
          setLocationRelativeTo(null);
         setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
         
          carregarUsuario();

      aplicarPermissoes();
    
      setDefaultCloseOperation(
        javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE
);
    }

 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopComFundo2 = new view.DesktopComFundo();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenuItem();
        mnuLogout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuClientes = new javax.swing.JMenuItem();
        mnuFornecedores = new javax.swing.JMenuItem();
        mnuProdutos = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuCompras = new javax.swing.JMenuItem();
        mnuVendas = new javax.swing.JMenuItem();
        mnuContasPagar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuContasReceber = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        desktopComFundo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2));

        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário");

        lblNivel.setForeground(new java.awt.Color(255, 255, 255));
        lblNivel.setText("Nível");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(338, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblNivel))
                .addContainerGap())
        );

        jMenu1.setText("Sistema");

        mnuSair.setText("Sair");
        mnuSair.addActionListener(this::mnuSairActionPerformed);
        jMenu1.add(mnuSair);

        mnuLogout.setText("Logout");
        mnuLogout.addActionListener(this::mnuLogoutActionPerformed);
        jMenu1.add(mnuLogout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastro");

        mnuClientes.setText("Clientes");
        mnuClientes.addActionListener(this::mnuClientesActionPerformed);
        jMenu2.add(mnuClientes);

        mnuFornecedores.setText("Fornecedores");
        mnuFornecedores.addActionListener(this::mnuFornecedoresActionPerformed);
        jMenu2.add(mnuFornecedores);

        mnuProdutos.setText("Produtos");
        mnuProdutos.addActionListener(this::mnuProdutosActionPerformed);
        jMenu2.add(mnuProdutos);

        mnuUsuarios.setText("Usuários");
        mnuUsuarios.addActionListener(this::mnuUsuariosActionPerformed);
        jMenu2.add(mnuUsuarios);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Movimentos");

        mnuCompras.setText("Compras");
        mnuCompras.addActionListener(this::mnuComprasActionPerformed);
        jMenu3.add(mnuCompras);

        mnuVendas.setText("Vendas");
        mnuVendas.addActionListener(this::mnuVendasActionPerformed);
        jMenu3.add(mnuVendas);

        jMenuBar1.add(jMenu3);

        mnuContasPagar.setText("Financeiro");

        jMenuItem1.setText("Contas a Pagar");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        mnuContasPagar.add(jMenuItem1);

        mnuContasReceber.setText("Contas a Receber");
        mnuContasReceber.addActionListener(this::mnuContasReceberActionPerformed);
        mnuContasPagar.add(mnuContasReceber);

        jMenuBar1.add(mnuContasPagar);

        jMenu5.setText("Ajuda");

        mnuSobre.setText("Sobre");
        mnuSobre.addActionListener(this::mnuSobreActionPerformed);
        jMenu5.add(mnuSobre);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopComFundo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopComFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProdutosActionPerformed
      
    abrirTela(
            new FrmProduto()
    );
    }//GEN-LAST:event_mnuProdutosActionPerformed

    private void mnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVendasActionPerformed
   
    }//GEN-LAST:event_mnuVendasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClientesActionPerformed
       
    abrirTela(
            new FrmCliente()
    );
    }//GEN-LAST:event_mnuClientesActionPerformed

    private void mnuFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFornecedoresActionPerformed
         abrirTela(
            new FrmFornecedor()
    );
    }//GEN-LAST:event_mnuFornecedoresActionPerformed

    private void mnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuariosActionPerformed
       if (!SessaoUsuario.isMaster()) {

        JOptionPane.showMessageDialog(
                this,
                "Acesso permitido somente para usuário MASTER."
        );

        return;
    }

    abrirTela(
            new FrmUsuario()
    );
    }//GEN-LAST:event_mnuUsuariosActionPerformed

    private void mnuComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuComprasActionPerformed
      
    }//GEN-LAST:event_mnuComprasActionPerformed

    private void mnuContasReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuContasReceberActionPerformed
       
    }//GEN-LAST:event_mnuContasReceberActionPerformed

    private void mnuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoutActionPerformed
         int resposta =
            JOptionPane.showConfirmDialog(
                    this,
                    "Deseja encerrar a sessão atual?",
                    "Logout",
                    JOptionPane.YES_NO_OPTION
            );

    if (
            resposta
            == JOptionPane.YES_OPTION
    ) {

        SessaoUsuario.encerrar();

        FrmLogin login =
                new FrmLogin();

        login.setVisible(true);

        dispose();
    }
    }//GEN-LAST:event_mnuLogoutActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
          int resposta =
            JOptionPane.showConfirmDialog(
                    this,
                    "Deseja realmente encerrar o FerragemGK?",
                    "Sair",
                    JOptionPane.YES_NO_OPTION
            );

    if (
            resposta
            == JOptionPane.YES_OPTION
    ) {

        System.exit(0);
    }
    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSobreActionPerformed
           JOptionPane.showMessageDialog(
            this,
            "FerragemGK\n"
            + "Sistema desenvolvido em Java Swing\n"
            + "Banco de dados PostgreSQL"
                   +"Por Wesllei"
    );

    }//GEN-LAST:event_mnuSobreActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
     
    }//GEN-LAST:event_formWindowClosed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new FrmPrincipal().setVisible(true));
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.DesktopComFundo desktopComFundo2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem mnuClientes;
    private javax.swing.JMenuItem mnuCompras;
    private javax.swing.JMenu mnuContasPagar;
    private javax.swing.JMenuItem mnuContasReceber;
    private javax.swing.JMenuItem mnuFornecedores;
    private javax.swing.JMenuItem mnuLogout;
    private javax.swing.JMenuItem mnuProdutos;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JMenuItem mnuSobre;
    private javax.swing.JMenuItem mnuUsuarios;
    private javax.swing.JMenuItem mnuVendas;
    // End of variables declaration//GEN-END:variables
private void carregarUsuario() {

    Usuario usuario =
            SessaoUsuario.getUsuarioLogado();

    if (usuario != null) {

        lblUsuario.setText(
                "Usuário: "
                + usuario.getNome()
        );

        lblNivel.setText(
                "Nível: "
                + usuario.getNivel()
        );

    } else {

        lblUsuario.setText(
                "Usuário: não identificado"
        );

        lblNivel.setText(
                "Nível: não identificado"
        );
    }
}
private void aplicarPermissoes() {

    if (SessaoUsuario.isMaster()) {

        mnuUsuarios.setEnabled(true);

        mnuContasPagar.setEnabled(true);

    } else {

        mnuUsuarios.setEnabled(false);

        mnuContasPagar.setEnabled(false);
    }
}
private void abrirTela(
        JInternalFrame tela
) {

    for (
            JInternalFrame frame :
            desktopComFundo2.getAllFrames()
    ) {

        if (
                frame.getClass()
                .equals(
                        tela.getClass()
                )
        ) {

            try {

                frame.setSelected(true);

                if (frame.isIcon()) {

                    frame.setIcon(false);
                }

            } catch (Exception erro) {

                JOptionPane.showMessageDialog(
                        this,
                        "Não foi possível selecionar a tela."
                );
            }

            frame.toFront();

            return;
        }
    }

    desktopComFundo2.add(tela);

    tela.setVisible(true);

    centralizarInternalFrame(tela);
}
private void centralizarInternalFrame(
        JInternalFrame tela
) {

    int x =
            (
                desktopComFundo2.getWidth()
                - tela.getWidth()
            ) / 2;

    int y =
            (
                desktopComFundo2.getHeight()
                - tela.getHeight()
            ) / 2;

    if (x < 0) {

        x = 0;
    }

    if (y < 0) {

        y = 0;
    }

    tela.setLocation(x, y);
}
}

