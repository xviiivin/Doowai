/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package layout;

import javax.swing.JPanel;

/**
 *
 * @author wiwat
 */
public class MainLayout extends javax.swing.JPanel {

    /**
     * Creates new form MainLayout1
     */
    public MainLayout() {
        initComponents();
    }

    public JPanel getBodyPanel() {
        return bodyPanel;
    }

    public JPanel getNavPanel() {
        return navPanel;
    }

    public JPanel getTopPanel() {
        return topPanel;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        bodyPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1194, 834));
        setLayout(new java.awt.BorderLayout());

        navPanel.setBackground(new java.awt.Color(255, 102, 0));
        navPanel.setPreferredSize(new java.awt.Dimension(243, 834));

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(navPanel, java.awt.BorderLayout.WEST);

        jPanel1.setLayout(new java.awt.BorderLayout());

        topPanel.setBackground(new java.awt.Color(1, 1, 1));
        topPanel.setPreferredSize(new java.awt.Dimension(951, 148));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jPanel1.add(topPanel, java.awt.BorderLayout.NORTH);

        bodyPanel.setBackground(new java.awt.Color(255, 153, 102));
        bodyPanel.setPreferredSize(new java.awt.Dimension(945, 638));

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );

        jPanel1.add(bodyPanel, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel navPanel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
