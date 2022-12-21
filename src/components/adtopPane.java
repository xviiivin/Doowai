/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import componentAdmin.AdTopBut;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonUI;
import model.UsersModel;

/**
 *
 * @author niniewww
 */
public class adtopPane extends javax.swing.JPanel {
    private UsersModel infoUser;
    public JButton getAdTopBut1() {
        return jButton2;
    }

    public void setAdTopBut1(AdTopBut adTopBut1) {
        this.jButton2 = jButton2;
    }

    /**
     * Creates new form topPane
     */
    public adtopPane(UsersModel infoUser) {
        this.infoUser = infoUser;
        initComponents();
        jSeparator1.setBackground(new Color(238,238,238));
        jSeparator2.setBackground(new Color(238,238,238));
//        allComicButton.setBackground(new Color(242,242,242));
        JButton [] btns = {accountButton};
        for (JButton btn : btns){
            btn.setUI(new BasicButtonUI());
            btn.setBackground(new Color(255,255,255));
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    if (e.getSource().equals(btn)){
                         btn.setBackground(Color.LIGHT_GRAY);
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setForeground(Color.black);
                    btn.setBackground(new Color(255,255,255));
                }
            });
        }   
    }
    
    private void addPlaceholderStyle(JTextField searchBar){
        Font font = searchBar.getFont();
        font = font.deriveFont(Font.ITALIC);
        searchBar.setFont(font);
        searchBar.setForeground(Color.gray);
    }
    
    private void removePlaceholderStyle(JTextField searchBar){
        Font font = searchBar.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        searchBar.setFont(font);
        searchBar.setForeground(Color.GRAY);
    }        
//    
//    
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rTopPane = new javax.swing.JPanel();
        accountButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(951, 147));

        rTopPane.setBackground(new java.awt.Color(255, 255, 255));
        rTopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rTopPane.setMaximumSize(new java.awt.Dimension(951, 147));
        rTopPane.setMinimumSize(new java.awt.Dimension(951, 147));
        rTopPane.setPreferredSize(new java.awt.Dimension(951, 147));
        rTopPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1144760 2.png"))); // NOI18N
        accountButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });
        rTopPane.add(accountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 50, 40));

        jSeparator1.setBackground(new java.awt.Color(238, 238, 233));
        jSeparator1.setForeground(new java.awt.Color(238, 238, 233));
        jSeparator1.setPreferredSize(new java.awt.Dimension(951, 10));
        rTopPane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(238, 238, 233));
        jSeparator2.setForeground(new java.awt.Color(238, 238, 233));
        jSeparator2.setPreferredSize(new java.awt.Dimension(951, 10));
        rTopPane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Ayuthaya", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Expand_left_double.png"))); // NOI18N
        jButton2.setText("   Back");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMaximumSize(new java.awt.Dimension(120, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(120, 40));
        jButton2.setPreferredSize(new java.awt.Dimension(120, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        rTopPane.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rTopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rTopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        // TODO add your handling code here:
        new modalUser(infoUser);
    }//GEN-LAST:event_accountButtonActionPerformed

    private void allComicButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allComicButtonMouseEntered
//        allComicButton.setBackground(Color.BLACK);
//        allComic.setForeground(Color.WHITE);
    }//GEN-LAST:event_allComicButtonMouseEntered

    private void allComicButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allComicButtonMouseExited
//        allComicButton.setBackground(new Color(242,242,242));
//        allComic.setForeground(Color.BLACK);
    }//GEN-LAST:event_allComicButtonMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel rTopPane;
    // End of variables declaration//GEN-END:variables
}