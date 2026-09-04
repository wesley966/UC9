
package view;


import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import model.Usuario;
import util.SessaoUsuario;



public class FrmLogin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmLogin.class.getName());

    
    public FrmLogin() {
        initComponents();
        
        jLabel4.setBounds(0,0,570,400);
        this.setSize(570, 400);
        
        setLocationRelativeTo(null);
        setResizable(false);
        getRootPane().setDefaultButton(btnEntrar);
          
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usúario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 120, 40, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 180, 32, 16);

        txtLogin.addActionListener(this::txtLoginActionPerformed);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(130, 150, 282, 22);

        btnEntrar.setBackground(new java.awt.Color(0, 255, 51));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.addActionListener(this::btnEntrarActionPerformed);
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(120, 260, 105, 37);

        txtSenha.addActionListener(this::txtSenhaActionPerformed);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(130, 210, 282, 22);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel3)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 570, 60);

        btnSair.setBackground(new java.awt.Color(255, 0, 0));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.addActionListener(this::btnSairActionPerformed);
        getContentPane().add(btnSair);
        btnSair.setBounds(310, 260, 106, 37);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-390, -80, 990, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String login =
        txtLogin.getText().trim();

        String senha =
        new String(
            txtSenha.getPassword()
        );

        if (login.isEmpty()) {

            JOptionPane.showMessageDialog(
                this,
                "Informe o usuário."
            );

            txtLogin.requestFocus();

            return;
        }

        if (senha.isEmpty()) {

            JOptionPane.showMessageDialog(
                this,
                "Informe a senha."
            );

            txtSenha.requestFocus();

            return;
        }

        try {
            UsuarioDAO usuarioDAO =
            new UsuarioDAO();

            Usuario usuario =
            usuarioDAO.autenticar(
                login,
                senha
            );

            if (usuario != null) {

                SessaoUsuario.iniciar(usuario);

                FrmPrincipal principal;
                principal = new FrmPrincipal();

                principal.setVisible(true);

                //dispose();

            } else {

                JOptionPane.showMessageDialog(
                    this,
                    "Usuário ou senha inválidos."
                );

                txtSenha.setText("");

                txtSenha.requestFocus();
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(
                this,
                "Não foi possível realizar o login.\n"
                + erro.getMessage()
            );
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int resposta =
        JOptionPane.showConfirmDialog(
            this,
            "Deseja realmente sair?",
            "FerragemGK",
            JOptionPane.YES_NO_OPTION
        );

        if (resposta ==
            JOptionPane.YES_OPTION) {

            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> new FrmLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
