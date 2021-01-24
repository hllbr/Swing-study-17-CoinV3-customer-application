
import java.util.Arrays;


public class paratakip extends javax.swing.JFrame {
    String kullanıcıadı = "admin";
    String parola = "admin";
    
    public paratakip() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullanıcı_girdi = new javax.swing.JTextField();
        passwordParola = new javax.swing.JPasswordField();
        gırıs = new javax.swing.JButton();
        mesaj_yazısı = new javax.swing.JLabel();
        goster = new javax.swing.JCheckBox();
        ıpucu = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COINS OF MUSA TATLI");
        setBounds(new java.awt.Rectangle(0, 0, 400, 400));

        jLabel1.setText("Kullanucu Adı");

        jLabel2.setText("Parola");

        gırıs.setText("Sisteme Griş");
        gırıs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gırısActionPerformed(evt);
            }
        });

        mesaj_yazısı.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mesaj_yazısı.setForeground(new java.awt.Color(255, 0, 0));

        goster.setText("Parolamı Göster");
        goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gosterActionPerformed(evt);
            }
        });

        ıpucu.setText("Şifre için İpucu Göster");
        ıpucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ıpucuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mesaj_yazısı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gırıs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kullanıcı_girdi, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goster)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordParola, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ıpucu))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kullanıcı_girdi, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordParola, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(goster)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ıpucu)
                        .addGap(18, 18, 18)))
                .addComponent(gırıs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesaj_yazısı, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gırısActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gırısActionPerformed
        // TODO add your handling code here:
        String kontrolıd;
        String kontrolparola;
        kontrolıd = kullanıcı_girdi.getText();
        kontrolparola= new String(passwordParola.getPassword());
        
        if(kullanıcıadı.equals(kontrolıd) && parola.equals(kontrolparola)){
            Second sc = new Second();
            sc.setVisible(true);
            setVisible(false);
        }else if(kullanıcıadı.equals(kontrolıd) && !(parola.equals(kontrolparola))){
            mesaj_yazısı.setText("Parolanız hatalıdır...!");
        }else if(!(kullanıcıadı.equals(kontrolıd)) && parola.equals(kontrolparola)){
            mesaj_yazısı.setText("kullanıcı adı hatalıdır.");
        }else{
            mesaj_yazısı.setText("Kullanıcı adı ve parola hatalıdır.");
        }
    }//GEN-LAST:event_gırısActionPerformed

    private void gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterActionPerformed
        // TODO add your handling code here:
        if(goster.isSelected()){
            passwordParola.setEchoChar((char)0);
        }else{
            passwordParola.setEchoChar('*');
        }
    }//GEN-LAST:event_gosterActionPerformed

    private void ıpucuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ıpucuActionPerformed
        // TODO add your handling code here:
        if(ıpucu.isSelected()){
            mesaj_yazısı.setText("ölürsem falan şifrem **** sen al bari Mustafa:)");
        }else{
            mesaj_yazısı.setText("");
        }
    }//GEN-LAST:event_ıpucuActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(paratakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paratakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paratakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paratakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paratakip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox goster;
    private javax.swing.JButton gırıs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kullanıcı_girdi;
    private javax.swing.JLabel mesaj_yazısı;
    private javax.swing.JPasswordField passwordParola;
    private javax.swing.JCheckBox ıpucu;
    // End of variables declaration//GEN-END:variables
}
