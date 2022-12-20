package components;

import componentAdmin.PanelRound;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class adsidePane extends javax.swing.JPanel {

    public adsidePane() {
        initComponents();
    }

    public PanelRound getPanelRound2() {
        return panelRound2;
    }

    public void setPanelRound2(PanelRound panelRound2) {
        this.panelRound2 = panelRound2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        searchList = new javax.swing.JList<>();
        sidePane = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        sp2 = new javax.swing.JPanel();
        panelRound3 = new components.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelRound2 = new componentAdmin.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        topSidePane1 = new javax.swing.JPanel();
        panelRound1 = new components.PanelRound();
        dooWai1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        searchList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        searchList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchListMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchListMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(searchList);

        setPreferredSize(new java.awt.Dimension(243, 834));
        setRequestFocusEnabled(false);
        setLayout(new java.awt.BorderLayout());

        sidePane.setBackground(new java.awt.Color(255, 255, 255));
        sidePane.setPreferredSize(new java.awt.Dimension(243, 834));
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(238, 238, 233));
        jPanel4.setPreferredSize(new java.awt.Dimension(1, 500));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        sidePane.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, 760));

        sp2.setBackground(new java.awt.Color(255, 255, 255));
        sp2.setPreferredSize(new java.awt.Dimension(243, 60));
        sp2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(20);
        panelRound3.setRoundBottomRight(20);
        panelRound3.setRoundTopLeft(20);
        panelRound3.setRoundTopRight(20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings2.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Ayuthaya", 0, 13)); // NOI18N
        jLabel2.setText("Admin Control");

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sp2.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 40));

        sidePane.add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 166, -1, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(243, 365));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1828427 1.png"))); // NOI18N
        panelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Ayuthaya", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Logout");
        panelRound2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 20));

        jPanel3.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 40));

        sidePane.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 463, -1, 370));

        topSidePane1.setBackground(new java.awt.Color(255, 255, 255));
        topSidePane1.setPreferredSize(new java.awt.Dimension(243, 146));
        topSidePane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                topSidePane1FocusGained(evt);
            }
        });
        topSidePane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dooWai1.setBackground(new java.awt.Color(0, 0, 0));
        dooWai1.setFont(new java.awt.Font("Ayuthaya", 1, 16)); // NOI18N
        dooWai1.setText("DooWai");
        dooWai1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRound1.add(dooWai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 48));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Do 1 (1).png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(30, 30));
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 48));

        topSidePane1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 50));

        sidePane.add(topSidePane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        add(sidePane, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void searchListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchListMouseClicked
//        JOptionPane.showMessageDialog(rTopPane, searchList.getSelectedValue(), "get stars", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_searchListMouseClicked

    private void searchListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchListMouseExited
//        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_searchListMouseExited

    private void topSidePane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_topSidePane1FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_topSidePane1FocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dooWai1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private components.PanelRound panelRound1;
    private componentAdmin.PanelRound panelRound2;
    private components.PanelRound panelRound3;
    private javax.swing.JList<String> searchList;
    private javax.swing.JPanel sidePane;
    private javax.swing.JPanel sp2;
    private javax.swing.JPanel topSidePane1;
    // End of variables declaration//GEN-END:variables
}
