package gui;

import controller.UsuarioController;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Usuario;

public class PanelCadastro extends javax.swing.JPanel 
{

    private FramePrincipal framePai;
    private UsuarioController usuarioController;
    
    public PanelCadastro(FramePrincipal framePai) 
    {
        initComponents();

        this.framePai = framePai;
        this.usuarioController = new UsuarioController();
    }

    private boolean verificaSenha()
    {
        if(!senhaTxt.getText().equals(confirmaSenhaTxt.getText()) && senhaTxt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "As senhas informadas nao coincidem");
            confirmaSenhaTxt.setBackground(Color.ORANGE);
            return false;
        }else {
            confirmaSenhaTxt.setBackground(Color.WHITE);
            prontoBtn.requestFocus();
            return true;
        }
    }
    
    private boolean verificaEmail()
    {
        if(!emailTxt.equals("") && this.usuarioController.proucuraUsuarioEmail(emailTxt.getText()) == null)
        {
            return true;
        }else {
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
        jLabel4 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        prontoBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        confirmaSenhaTxt = new javax.swing.JPasswordField();
        voltarBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setText("Cadastro");

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nome");

        nomeTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        nomeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeTxtKeyReleased(evt);
            }
        });

        prontoBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prontoBtn.setText("Pronto");
        prontoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prontoBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Confirmação de senha");

        confirmaSenhaTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        confirmaSenhaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmaSenhaTxtKeyReleased(evt);
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
                        .addGap(17, 17, 17)
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(prontoBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(confirmaSenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(emailTxt)
                                .addComponent(jLabel3)
                                .addComponent(senhaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(nomeTxt)))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(voltarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmaSenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(prontoBtn)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        this.framePai.trocaPanel(new PanelInicial(this.framePai));
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void nomeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTxtKeyReleased
        
        if(evt.getKeyChar() == '\n')
        {
            emailTxt.requestFocus();
        }
    }//GEN-LAST:event_nomeTxtKeyReleased

    private void emailTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtKeyReleased
        
        if(evt.getKeyChar() == '\n')
        {
            senhaTxt.requestFocus();
        }
    }//GEN-LAST:event_emailTxtKeyReleased

    private void senhaTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaTxtKeyReleased
        
        if(evt.getKeyChar() == '\n')
        {
            confirmaSenhaTxt.requestFocus();
        }
    }//GEN-LAST:event_senhaTxtKeyReleased

    private void confirmaSenhaTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmaSenhaTxtKeyReleased

        if(evt.getKeyChar() == '\n')
        {
            verificaSenha();
        }
    }//GEN-LAST:event_confirmaSenhaTxtKeyReleased

    private void prontoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prontoBtnActionPerformed

        if(nomeTxt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "O nome nao foi preenchido");
        }else if(verificaSenha() && verificaEmail())
        {
            this.usuarioController.cadastraUsuario(new Usuario(nomeTxt.getText(), senhaTxt.getText(), emailTxt.getText()));
            this.framePai.trocaPanel(new PanelInicial(framePai));
        }
    }//GEN-LAST:event_prontoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmaSenhaTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JButton prontoBtn;
    private javax.swing.JPasswordField senhaTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
