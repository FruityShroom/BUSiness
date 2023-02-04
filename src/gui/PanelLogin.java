package gui;

import controller.UsuarioController;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Usuario;

public class PanelLogin extends javax.swing.JPanel 
{

    private FramePrincipal framePai;
    private UsuarioController usuarioController;
    
    public PanelLogin(FramePrincipal framePai) 
    {
        initComponents();
        
        this.framePai = framePai;
        this.usuarioController = new UsuarioController();
    }

    private boolean verificaLogin()
    {
        if(this.usuarioController.proucuraUsuarioSenha(emailTxt.getText(), senhaTxt.getText()) != null)
        {
            emailTxt.setBackground(Color.WHITE);
            senhaTxt.setBackground(Color.WHITE);
            return true;
        }else {
            emailTxt.setBackground(Color.ORANGE);
            senhaTxt.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Informacoes incorretas");
            return false;
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        senhaTxt = new javax.swing.JPasswordField();
        entrarBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Email");

        emailTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        emailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTxtKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Senha");

        senhaTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        senhaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                senhaTxtKeyReleased(evt);
            }
        });

        entrarBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        entrarBtn.setText("Entrar");
        entrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBtnActionPerformed(evt);
            }
        });

        voltarBtn.setFont(new java.awt.Font("Wide Latin", 0, 10)); // NOI18N
        voltarBtn.setText("<--");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(emailTxt)
                            .addComponent(jLabel3)
                            .addComponent(senhaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(entrarBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(voltarBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(entrarBtn)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        this.framePai.trocaPanel(new PanelInicial(this.framePai));
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void emailTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtKeyReleased

        if(evt.getKeyChar() == '\n')
        {
            senhaTxt.requestFocus();
        }
    }//GEN-LAST:event_emailTxtKeyReleased

    private void senhaTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaTxtKeyReleased

        if(evt.getKeyChar() == '\n')
        {
            entrarBtn.requestFocus();
        }
    }//GEN-LAST:event_senhaTxtKeyReleased

    private void entrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBtnActionPerformed

        if(verificaLogin())
        {
            Usuario usuario = this.usuarioController.proucuraUsuarioSenha(emailTxt.getText(), senhaTxt.getText());
            int verificador = this.usuarioController.proucuraVerifcAdministrador(usuario);
                    
            if(verificador != 0)
            {
                usuario.setVerificado(true);
                usuario.setVerificador(verificador);
                this.framePai.trocaPanel(new PanelPrincipalAdm(this.framePai, usuario));
            }else {
                usuario.setVerificado(false);
                this.framePai.trocaPanel(new PanelPrincipal(this.framePai, usuario));
            }
        }
    }//GEN-LAST:event_entrarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton entrarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField senhaTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
