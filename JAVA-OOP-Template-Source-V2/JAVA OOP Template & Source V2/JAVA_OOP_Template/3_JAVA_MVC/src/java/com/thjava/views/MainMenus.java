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
public class MainMenus extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainMenus() {
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
        btnAddBook = new javax.swing.JButton();
        btnShowBooks = new javax.swing.JButton();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WWW.TH-JAVA.com");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddBook.setBackground(new java.awt.Color(177, 231, 223));
        btnAddBook.setFont(new java.awt.Font("TH K2D July8", 0, 24)); // NOI18N
        btnAddBook.setForeground(new java.awt.Color(0, 101, 68));
        btnAddBook.setText("เพิ่มหนังสือ");
        btnAddBook.setBorder(null);
        btnAddBook.setBorderPainted(false);
        btnAddBook.setFocusPainted(false);
        jPanel1.add(btnAddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 260, 50));

        btnShowBooks.setBackground(new java.awt.Color(254, 197, 222));
        btnShowBooks.setFont(new java.awt.Font("TH K2D July8", 0, 24)); // NOI18N
        btnShowBooks.setForeground(new java.awt.Color(193, 0, 50));
        btnShowBooks.setText("รายการหนังสือ");
        btnShowBooks.setBorder(null);
        btnShowBooks.setBorderPainted(false);
        btnShowBooks.setFocusPainted(false);
        jPanel1.add(btnShowBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 260, 50));

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thjava/imgs/bg.png"))); // NOI18N
        jPanel1.add(lblBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

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
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnShowBooks;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBg;
    // End of variables declaration//GEN-END:variables
}
