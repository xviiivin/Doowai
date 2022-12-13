/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author wiwat
 */
public class ReadCartoon extends javax.swing.JPanel {

    /**
     * Creates new form ReadCartoon
     */
    public ReadCartoon() {
        initComponents();
        JButton []btns = {jButton2,jButton3,accountButton,dropButtom};
        for (JButton btn:btns){
            btn.setUI(new BasicButtonUI());
            btn.setBackground(Color.WHITE);
            btn.addMouseListener(new MouseListener()
            {
                @Override
                public void mouseClicked(MouseEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    if(e.getSource().equals(dropButtom)||e.getSource().equals(accountButton)){
                        dropButtom.setBackground(Color.LIGHT_GRAY);
                        accountButton.setBackground(Color.LIGHT_GRAY);
                    }
                    else{
                        btn.setBackground(Color.WHITE);
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    dropButtom.setBackground(Color.WHITE);
                    accountButton.setBackground(Color.WHITE);
                      }
                
            });
        }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountButton = new javax.swing.JButton();
        dropButtom = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1144760 2.png"))); // NOI18N
        accountButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });
        add(accountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 50, 40));

        dropButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 3.png"))); // NOI18N
        dropButtom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dropButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropButtomActionPerformed(evt);
            }
        });
        add(dropButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Ayuthaya", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Expand_left_double.png"))); // NOI18N
        jButton2.setText("   Back");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 120, 40));

        jSeparator2.setBackground(new java.awt.Color(238, 238, 233));
        jSeparator2.setForeground(new java.awt.Color(238, 238, 233));
        jSeparator2.setPreferredSize(new java.awt.Dimension(951, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Ayuthaya", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Next");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Expand_right_double.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Ayuthaya", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 120, 40));

        jLabel3.setFont(new java.awt.Font("Ayuthaya", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("วินซ่าตลิ่งชัน");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 100, -1));

        jLabel4.setFont(new java.awt.Font("Ayuthaya", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ตอนที่#1");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountButtonActionPerformed

    private void dropButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropButtomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropButtomActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JButton dropButtom;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
