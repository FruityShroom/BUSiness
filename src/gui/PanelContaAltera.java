package gui;

import controller.UsuarioController;
import javax.swing.ImageIcon;
import model.Usuario;

public class PanelContaAltera extends javax.swing.JPanel 
{

    private FramePrincipal framePai;
    private Usuario usuario;
    private UsuarioController userController;
    
    public PanelContaAltera(FramePrincipal framePai, Usuario usuario) 
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

        nomeTxt = new javax.swing.JTextField();
        voltarBtn = new javax.swing.JButton();
        usuarioIcon = new javax.swing.JLabel();
        JLabel6 = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        JLabel5 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        verificadoTxt = new javax.swing.JLabel();
        verificadorTxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        nomeTxt.setText("Nome");

        voltarBtn.setFont(new java.awt.Font("Wide Latin", 0, 10)); // NOI18N
        voltarBtn.setText("<--");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        JLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabel6.setForeground(new java.awt.Color(102, 102, 102));
        JLabel6.setText("Senha");

        okBtn.setText("Ok");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        JLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabel5.setForeground(new java.awt.Color(102, 102, 102));
        JLabel5.setText("*********");

        emailTxt.setText("Email");

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
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(usuarioIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel6)
                            .addComponent(JLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(okBtn))
                            .addComponent(verificadorTxt)
                            .addComponent(verificadoTxt))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(voltarBtn)
                .addGap(18, 18, 18)
                .addComponent(usuarioIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(okBtn)))
                .addGap(18, 18, 18)
                .addComponent(verificadoTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verificadorTxt)
                .addGap(18, 18, 18)
                .addComponent(JLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel5)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed

        if(this.usuario.isVerificado())
        {
            this.framePai.trocaPanel(new PanelPrincipalAdm(this.framePai, usuario));
        }else {
            this.framePai.trocaPanel(new PanelPrincipal(this.framePai, this.usuario));
        }
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        
        this.usuario.setNome(nomeTxt.getText());
        this.usuario.setEmail(emailTxt.getText());
        
        this.userController.modUsuario(this.usuario);
        
        this.framePai.trocaPanel(new PanelConta(this.framePai, this.usuario));
    }//GEN-LAST:event_okBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel5;
    private javax.swing.JLabel JLabel6;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel usuarioIcon;
    private javax.swing.JLabel verificadoTxt;
    private javax.swing.JLabel verificadorTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
