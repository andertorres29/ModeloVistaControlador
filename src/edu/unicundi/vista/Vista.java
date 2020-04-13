package edu.unicundi.vista;

/**
 * Esta clase Vista se encarga de la parte grafica e interatuable con el usuario
 * Recogera informacion sobre el movimiento del usuario que competira con la maquina.
 *
 * @author Anderson Torres Q.
 * @author ayesidtorres@unicundi.edu.co
 * @version 1.0
 */

//Inicio clase vista
public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JUGAR = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        subti1 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnFondo1 = new javax.swing.JButton();
        btnFondo2 = new javax.swing.JButton();
        btnFondo3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelResH = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelResM = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelGanador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JUGAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo1.setText("JUEGO PIEDRA PAPEL O TIJERA");
        JUGAR.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 310, 40));

        titulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titulo2.setText("HUMANO");
        JUGAR.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 70, 30));

        titulo3.setText("MAQUINA");
        JUGAR.add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 60, 30));

        titulo4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo4.setText("RESULTADOS");
        JUGAR.add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 140, 30));

        subti1.setText("Seleccione su movmiento: ");
        JUGAR.add(subti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 160, -1));

        btnJugar.setText("JUGAR");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        JUGAR.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 160, 60));

        btnFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unicundi/imagenes/3D_Stone_25698.png"))); // NOI18N
        btnFondo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFondo1.setBorderPainted(false);
        btnFondo1.setContentAreaFilled(false);
        btnFondo1.setOpaque(false);
        btnFondo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFondo1ActionPerformed(evt);
            }
        });
        JUGAR.add(btnFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 110));

        btnFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unicundi/imagenes/1499345628-paper_85355.png"))); // NOI18N
        btnFondo2.setActionCommand("");
        btnFondo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFondo2.setBorderPainted(false);
        btnFondo2.setContentAreaFilled(false);
        btnFondo2.setOpaque(true);
        btnFondo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFondo2ActionPerformed(evt);
            }
        });
        JUGAR.add(btnFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 120, 120));

        btnFondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unicundi/imagenes/scissorflat_106014.png"))); // NOI18N
        btnFondo3.setBorderPainted(false);
        btnFondo3.setContentAreaFilled(false);
        btnFondo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFondo3ActionPerformed(evt);
            }
        });
        JUGAR.add(btnFondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 120, 120));

        jLabel1.setText("El movimiento de la maquina es: ");
        JUGAR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));
        JUGAR.add(labelResH, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 236, 140, 20));

        jLabel2.setText("Su movimiento es: ");
        JUGAR.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));
        JUGAR.add(labelResM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 150, 20));

        jLabel3.setText("El ganador es:");
        JUGAR.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, 20));
        JUGAR.add(labelGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 280, 20));

        getContentPane().add(JUGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento para enviar la opcion escogida por el usuario a un campo de texto
    private void btnFondo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFondo2ActionPerformed
        labelResH.setText("Papel");
    }//GEN-LAST:event_btnFondo2ActionPerformed
    
    //Evento para enviar la opcion escogida por el usuario a un campo de texto
    private void btnFondo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFondo3ActionPerformed
        labelResH.setText("Tijera");
    }//GEN-LAST:event_btnFondo3ActionPerformed

    //Evento para enviar la opcion escogida por el usuario a un campo de texto
    private void btnFondo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFondo1ActionPerformed
        labelResH.setText("Piedra");
    }//GEN-LAST:event_btnFondo1ActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
    }//GEN-LAST:event_btnJugarActionPerformed

    /**
     * @param args the command line arguments
     */
    
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JUGAR;
    private javax.swing.JButton btnFondo1;
    private javax.swing.JButton btnFondo2;
    private javax.swing.JButton btnFondo3;
    public javax.swing.JButton btnJugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel labelGanador;
    public javax.swing.JLabel labelResH;
    public javax.swing.JLabel labelResM;
    private javax.swing.JLabel subti1;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    // End of variables declaration//GEN-END:variables
}
