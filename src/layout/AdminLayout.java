/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package layout;

import javax.swing.JPanel;

/**
 *
 * @author sasimai
 */
public class AdminLayout extends javax.swing.JPanel {

    /**
     * Creates new form AdminLayout
     */
    public AdminLayout() {
        initComponents();
    }

    public JPanel getAdminBodyPanel() {
        return adminBodyPanel;
    }

    public JPanel getAdminNavPanel() {
        return adminNavPanel;
    }

    public JPanel getAdminTopPanel() {
        return adminTopPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminNavPanel = new javax.swing.JPanel();
        adminTopPanel = new javax.swing.JPanel();
        adminBodyPanel = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1194, 834));
        setPreferredSize(new java.awt.Dimension(1194, 834));
        setSize(new java.awt.Dimension(945, 834));

        adminNavPanel.setBackground(new java.awt.Color(0, 204, 0));
        adminNavPanel.setPreferredSize(new java.awt.Dimension(243, 834));
        adminNavPanel.setSize(new java.awt.Dimension(243, 834));

        javax.swing.GroupLayout adminNavPanelLayout = new javax.swing.GroupLayout(adminNavPanel);
        adminNavPanel.setLayout(adminNavPanelLayout);
        adminNavPanelLayout.setHorizontalGroup(
            adminNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );
        adminNavPanelLayout.setVerticalGroup(
            adminNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );

        adminTopPanel.setBackground(new java.awt.Color(0, 51, 51));
        adminTopPanel.setPreferredSize(new java.awt.Dimension(951, 147));
        adminTopPanel.setSize(new java.awt.Dimension(951, 147));

        javax.swing.GroupLayout adminTopPanelLayout = new javax.swing.GroupLayout(adminTopPanel);
        adminTopPanel.setLayout(adminTopPanelLayout);
        adminTopPanelLayout.setHorizontalGroup(
            adminTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        adminTopPanelLayout.setVerticalGroup(
            adminTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        adminBodyPanel.setBackground(new java.awt.Color(255, 51, 102));
        adminBodyPanel.setPreferredSize(new java.awt.Dimension(951, 686));
        adminBodyPanel.setSize(new java.awt.Dimension(951, 686));

        javax.swing.GroupLayout adminBodyPanelLayout = new javax.swing.GroupLayout(adminBodyPanel);
        adminBodyPanel.setLayout(adminBodyPanelLayout);
        adminBodyPanelLayout.setHorizontalGroup(
            adminBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        adminBodyPanelLayout.setVerticalGroup(
            adminBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(adminNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adminTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adminBodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(adminTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(adminBodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminBodyPanel;
    private javax.swing.JPanel adminNavPanel;
    private javax.swing.JPanel adminTopPanel;
    // End of variables declaration//GEN-END:variables
}
