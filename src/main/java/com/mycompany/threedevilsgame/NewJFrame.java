/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.threedevilsgame;
import javax.swing.ImageIcon;

/**
 *
 * @author mmema
 */
public class NewJFrame extends javax.swing.JFrame {
    


    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
         initComponents();
         ImageIcon icon = new ImageIcon("3lwa_chess.jpg");            //adding Icon
         this.setIconImage(icon.getImage());
         ImageIcon icon2 = new ImageIcon("bat3.jpg");            //adding Icon
         this.setTitle("Devils Gmae");
          
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel1 = new com.mycompany.threedevilsgame.MyPanel();
        StartGmae = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        myPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StartGmae.setBackground(new java.awt.Color(204, 255, 204));
        StartGmae.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        StartGmae.setForeground(new java.awt.Color(0, 0, 0));
        StartGmae.setText("Play");
        StartGmae.setOpaque(true);
        StartGmae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartGmaeActionPerformed(evt);
            }
        });
        myPanel1.add(StartGmae, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 168, 97));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mmema\\OneDrive\\Documents\\NetBeansProjects\\ThreeDevilsGame\\bat3.jpg")); // NOI18N
        myPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 800, 730));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartGmaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGmaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartGmaeActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
               
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartGmae;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private com.mycompany.threedevilsgame.MyPanel myPanel1;
    // End of variables declaration//GEN-END:variables

}

