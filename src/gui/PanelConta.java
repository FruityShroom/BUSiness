package gui;

import javax.swing.ImageIcon;
import model.Usuario;

public class PanelConta extends javax.swing.JPanel 
{

    private FramePrincipal framePai;
    private Usuario usuario;
    
    public PanelConta(FramePrincipal framePai, Usuario usuario) 
    {
        initComponents();
        
        this.framePai = framePai;
        this.usuario = usuario;
        
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        usuarioIcon = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JLabel();
        emailTxt = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();
        alterarBtn = new javax.swing.JButton();
        JLabel3 = new javax.swing.JLabel();
        JLabel4 = new javax.swing.JLabel();
        alterarSenhaBtn = new javax.swing.JButton();
        verificadoTxt = new javax.swing.JLabel();
        verificadorTxt = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(255, 255, 255));

        nomeTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nomeTxt.setForeground(new java.awt.Color(102, 102, 102));
        nomeTxt.setText("jLabel2");

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

        alterarBtn.setText("Alterar");
        alterarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarBtnActionPerformed(evt);
            }
        });

        JLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabel3.setForeground(new java.awt.Color(102, 102, 102));
        JLabel3.setText("Senha");

        JLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabel4.setForeground(new java.awt.Color(102, 102, 102));
        JLabel4.setText("*********");

        alterarSenhaBtn.setText("Alterar");
        alterarSenhaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaBtnActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailTxt)
                                    .addComponent(nomeTxt))
                                .addGap(30, 30, 30)
                                .addComponent(alterarBtn))
                            .addComponent(verificadorTxt)
                            .addComponent(verificadoTxt)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabel3)
                                    .addComponent(JLabel4))
                                .addGap(26, 26, 26)
                                .addComponent(alterarSenhaBtn)))))
                .addContainerGap(143, Short.MAX_VALUE))
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
                        .addComponent(nomeTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(alterarBtn)))
                .addGap(18, 18, 18)
                .addComponent(verificadoTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verificadorTxt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(alterarSenhaBtn)))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void alterarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarBtnActionPerformed
        
        this.framePai.trocaPanel(new PanelContaAltera(this.framePai, this.usuario));
    }//GEN-LAST:event_alterarBtnActionPerformed

    private void alterarSenhaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaBtnActionPerformed

         this.framePai.trocaPanel(new PanelContaAlteraSenha(this.framePai, this.usuario));
    }//GEN-LAST:event_alterarSenhaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JButton alterarBtn;
    private javax.swing.JButton alterarSenhaBtn;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeTxt;
    private javax.swing.JLabel usuarioIcon;
    private javax.swing.JLabel verificadoTxt;
    private javax.swing.JLabel verificadorTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables

   
}
