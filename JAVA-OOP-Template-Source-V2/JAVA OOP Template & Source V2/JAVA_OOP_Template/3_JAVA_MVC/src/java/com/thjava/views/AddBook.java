/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thjava.views;

/**
 *
 * @author Admin
 */
public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form ManageBooks
     */
    public AddBook() {
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

        jPanel1 = new javax.swing.JPanel();
        txtPrice = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("เพิ่มหนังสือ");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrice.setFont(new java.awt.Font("TH K2D July8", 0, 18)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(0, 101, 68));
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrice.setBorder(null);
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 320, 40));

        txtTitle.setFont(new java.awt.Font("TH K2D July8", 0, 18)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(0, 101, 68));
        txtTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitle.setBorder(null);
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 320, 40));

        jLabel1.setFont(new java.awt.Font("TH K2D July8", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 2, 98));
        jLabel1.setText("ราคา");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 320, 30));

        jLabel2.setFont(new java.awt.Font("TH K2D July8", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 2, 98));
        jLabel2.setText("ชื่อหนังสือ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 320, 30));

        btnSave.setBackground(new java.awt.Color(177, 231, 223));
        btnSave.setFont(new java.awt.Font("TH K2D July8", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 101, 68));
        btnSave.setText("บันทึก");
        btnSave.setFocusPainted(false);
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 120, 40));

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thjava/imgs/bg.png"))); // NOI18N
        jPanel1.add(lblBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBg;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
