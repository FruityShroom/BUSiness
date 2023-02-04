package gui;

import controller.UsuarioController;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Usuario;

public class PanelContaAlteraSenha extends javax.swing.JPanel 
{

    private FramePrincipal framePai;
    private Usuario usuario;
    private UsuarioController userController;
    
    public PanelContaAlteraSenha(FramePrincipal framePai, Usuario usuario) 
    {
        initComponents();
        
        this.framePai = framePai;
        this.usuario = usuario;
        this.userController = new UsuarioController();
        
        mostraInfo();
    }

    private void mostraInfo()
    {
        usuarioIcon.setIcon(new ImageIcon(getClass().
            getResource("/images/userIcon.jpg")));        
        nomeTxt.setText(this.usuario.getNome());
        emailTxt.setText(this.usuario.getEmail());
        
        if(this.usuario.isVerificado())
        {
            verificadoTxt.setText("Verificador:");
            verificadorTxt.setText(""+this.usuario.getVerificador());
        }else {
            verificadoTxt.setText("");
            verificadorTxt.setText("");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeTxt = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        emailTxt = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();
        usuarioIcon = new javax.swing.JLabel();
        senhaTxt = new javax.swing.JTextField();
        novaSenhaTxt = new javax.swing.JTextField();
        JLabel4 = new javax.swing.JLabel();
        verificadoTxt = new javax.swing.JLabel();
        verificadorTxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        nomeTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nomeTxt.setForeground(new java.awt.Color(102, 102, 102));
        nomeTxt.setText("jLabel2");

        JLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabel3.setForeground(new java.awt.Color(102, 102, 102));
        JLabel3.setText("Senha");

        okBtn.setText("Ok");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        emailTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(102, 102, 102));
        emailTxt.setText("jLabel1");

        voltarBtn.setFont(new java.awt.Font("Wide Latin", 0, 10)); // NOI18N
        voltarBtn.setText("<--");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        JLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabel4.setForeground(new java.awt.Color(102, 102, 102));
        JLabel4.setText("Nova senha");

        verificadoTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        verificadoTxt.setForeground(new java.awt.Color(102, 102, 102));
        verificadoTxt.setText("jLabel2");

        verificadorTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        verificadorTxt.setForeground(new java.awt.Color(102, 102, 102));
        verificadorTxt.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(usuarioIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeTxt)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(senhaTxt)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(JLabel4)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(novaSenhaTxt))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(emailTxt)
                                            .addGap(117, 117, 117)))
                                    .addComponent(okBtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(verificadorTxt)
                                        .addComponent(verificadoTxt))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(voltarBtn)
                .addGap(18, 18, 18)
                .addComponent(usuarioIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTxt)
                .addGap(18, 18, 18)
                .addComponent(verificadoTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verificadorTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(JLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel4)
                    .addComponent(okBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novaSenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

        if(senhaTxt.getText().equals(this.usuario.getSenha()))
        {
            this.usuario.setSenha(novaSenhaTxt.getText());
            
            this.userController.modUsuario(this.usuario);
            
            this.framePai.trocaPanel(new PanelConta(this.framePai, this.usuario));
        }else {
            JOptionPane.showMessageDialog(this, "Senha incorreta");
        }
        
    }//GEN-LAST:event_okBtnActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        
        if(this.usuario.isVerificado())
        {
            this.framePai.trocaPanel(new PanelPrincipalAdm(this.framePai, usuario));
        }else {
            this.framePai.trocaPanel(new PanelPrincipal(this.framePai, this.usuario));
        }
    }//GEN-LAST:event_voltarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JLabel nomeTxt;
    private javax.swing.JTextField novaSenhaTxt;
    private javax.swing.JButton okBtn;
    private javax.swing.JTextField senhaTxt;
    private javax.swing.JLabel usuarioIcon;
    private javax.swing.JLabel verificadoTxt;
    private javax.swing.JLabel verificadorTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
