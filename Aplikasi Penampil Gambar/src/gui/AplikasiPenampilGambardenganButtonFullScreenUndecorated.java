/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author ariff
 */
public class AplikasiPenampilGambardenganButtonFullScreenUndecorated extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPenampilGambardenganButtonFullScreenUndecorated
     */
    public AplikasiPenampilGambardenganButtonFullScreenUndecorated() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnpanel = new javax.swing.JPanel();
        btnglass = new javax.swing.JButton();
        btnjava = new javax.swing.JButton();
        btnpostgre = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        lblglass = new javax.swing.JLabel();
        lbljava = new javax.swing.JLabel();
        lblpost = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnglass.setText("Glassfish");
        btnglass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnglassActionPerformed(evt);
            }
        });
        btnpanel.add(btnglass);

        btnjava.setText("JavaEE");
        btnjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjavaActionPerformed(evt);
            }
        });
        btnpanel.add(btnjava);

        btnpostgre.setText("PostgreSQL");
        btnpostgre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpostgreActionPerformed(evt);
            }
        });
        btnpanel.add(btnpostgre);

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        btnpanel.add(btnexit);

        imagePanel.setLayout(new java.awt.CardLayout());

        lblglass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblglass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/glass.jpg"))); // NOI18N
        lblglass.setMaximumSize(new java.awt.Dimension(316, 400));
        lblglass.setMinimumSize(new java.awt.Dimension(316, 400));
        lblglass.setPreferredSize(new java.awt.Dimension(316, 400));
        imagePanel.add(lblglass, "0");

        lbljava.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbljava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/javaee.jpeg"))); // NOI18N
        imagePanel.add(lbljava, "1");

        lblpost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/post.jpg"))); // NOI18N
        lblpost.setText("jLabel1");
        imagePanel.add(lblpost, "2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1033, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnglassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnglassActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_btnglassActionPerformed

    private void btnjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjavaActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_btnjavaActionPerformed

    private void btnpostgreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpostgreActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_btnpostgreActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
        PilihGambarButton fullFrame = new PilihanGambarButton();
        
        GraphicsDevice device =
            GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        device.setFullScreenWindow(fullFrame);
        
        fullFrame.setVisible(true);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPenampilGambardenganButtonFullScreenUndecorated().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnglass;
    private javax.swing.JButton btnjava;
    private javax.swing.JPanel btnpanel;
    private javax.swing.JButton btnpostgre;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel lblglass;
    private javax.swing.JLabel lbljava;
    private javax.swing.JLabel lblpost;
    // End of variables declaration//GEN-END:variables
}
