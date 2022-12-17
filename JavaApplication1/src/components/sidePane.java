package components;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;

public class sidePane extends javax.swing.JPanel {
   
    public sidePane() {
        initComponents();
        JButton [] btns = {romanticButton,dramaButton,fictionButton,comedyButton,actionButton};
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
                    if (e.getSource().equals(romanticButton)){
                        romanticButton.setForeground(Color.PINK);
                    }
                    else if (e.getSource().equals(actionButton)){
                        actionButton.setForeground(Color.ORANGE);
                    }
                    else if (e.getSource().equals(dramaButton)){
                        dramaButton.setForeground(Color.MAGENTA);
                    }
                    else if (e.getSource().equals(fictionButton)){
                        fictionButton.setForeground(Color.CYAN);
                    }
                    else if (e.getSource().equals(comedyButton)){
                        comedyButton.setForeground(Color.GREEN);
                    }
                    else {
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

        JPanel [] pn = {panelRound1,panelRound2,panelRound3,panelRound4};
        for (JPanel pnl : pn){
            pnl.setBackground(new Color(255,255,255));
            pnl.addMouseListener(new MouseListener() {
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
                    if (e.getSource().equals(pnl)){
                            pnl.setBackground(Color.LIGHT_GRAY);
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    pnl.setBackground(Color.WHITE);
                }
            });
        }
    }

    public PanelRound getPanelRound4() {
        return panelRound4;
    }

    public void setPanelRound4(PanelRound panelRound4) {
        this.panelRound4 = panelRound4;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        searchList = new javax.swing.JList<>();
        sidePane = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        topSidePane = new javax.swing.JPanel();
        panelRound1 = new components.PanelRound();
        dooWai = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sp2 = new javax.swing.JPanel();
        panelRound2 = new components.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sp3 = new javax.swing.JPanel();
        panelRound3 = new components.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        romanticButton = new javax.swing.JButton();
        actionButton = new javax.swing.JButton();
        dramaButton = new javax.swing.JButton();
        fictionButton = new javax.swing.JButton();
        comedyButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panelRound4 = new components.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        topSidePane.setBackground(new java.awt.Color(255, 255, 255));
        topSidePane.setPreferredSize(new java.awt.Dimension(243, 146));
        topSidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dooWai.setBackground(new java.awt.Color(0, 0, 0));
        dooWai.setFont(new java.awt.Font("Ayuthaya", 1, 16)); // NOI18N
        dooWai.setForeground(new java.awt.Color(0, 0, 0));
        dooWai.setText("DooWai");
        dooWai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRound1.add(dooWai, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 48));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Do 1 (1).png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(30, 30));
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 48));

        topSidePane.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 50));

        sidePane.add(topSidePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        sp2.setBackground(new java.awt.Color(255, 255, 255));
        sp2.setPreferredSize(new java.awt.Dimension(243, 60));
        sp2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favourite.png"))); // NOI18N
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ayuthaya", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Favorite");
        panelRound2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 10, 80, 20));

        sp2.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 40));

        sidePane.add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 166, -1, 50));

        sp3.setBackground(new java.awt.Color(255, 255, 255));
        sp3.setPreferredSize(new java.awt.Dimension(243, 60));
        sp3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelRound3.setRoundBottomLeft(20);
        panelRound3.setRoundBottomRight(20);
        panelRound3.setRoundTopLeft(20);
        panelRound3.setRoundTopRight(20);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4013399 1.png"))); // NOI18N
        panelRound3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ayuthaya", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Category");
        panelRound3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 20));

        sp3.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 40));

        sidePane.add(sp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 221, -1, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(243, 172));

        romanticButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 2.png"))); // NOI18N
        romanticButton.setText(" Romantic");
        romanticButton.setAlignmentY(0.8F);
        romanticButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        romanticButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        romanticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanticButtonActionPerformed(evt);
            }
        });

        actionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 6.png"))); // NOI18N
        actionButton.setText(" Action");
        actionButton.setToolTipText("");
        actionButton.setAlignmentY(0.8F);
        actionButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        actionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonActionPerformed(evt);
            }
        });

        dramaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 5.png"))); // NOI18N
        dramaButton.setText(" Drama");
        dramaButton.setAlignmentY(0.8F);
        dramaButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dramaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dramaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dramaButtonActionPerformed(evt);
            }
        });

        fictionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 4.png"))); // NOI18N
        fictionButton.setText(" Fiction");
        fictionButton.setAlignmentY(0.8F);
        fictionButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fictionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fictionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fictionButtonActionPerformed(evt);
            }
        });

        comedyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 3.png"))); // NOI18N
        comedyButton.setText(" Comedy");
        comedyButton.setAlignmentY(0.8F);
        comedyButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        comedyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comedyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comedyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(romanticButton)
                    .addComponent(fictionButton)
                    .addComponent(dramaButton)
                    .addComponent(actionButton)
                    .addComponent(comedyButton))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(romanticButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dramaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fictionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comedyButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        sidePane.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 288, -1, 170));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(243, 365));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelRound4.setRoundBottomLeft(20);
        panelRound4.setRoundBottomRight(20);
        panelRound4.setRoundTopLeft(20);
        panelRound4.setRoundTopRight(20);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1828427 1.png"))); // NOI18N
        panelRound4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ayuthaya", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Logout");
        panelRound4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 20));

        jPanel3.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 40));

        sidePane.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 463, -1, 370));

        add(sidePane, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void romanticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanticButtonActionPerformed

    }//GEN-LAST:event_romanticButtonActionPerformed

    private void actionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actionButtonActionPerformed

    private void dramaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dramaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dramaButtonActionPerformed

    private void fictionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fictionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fictionButtonActionPerformed

    private void comedyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comedyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comedyButtonActionPerformed

    private void searchListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchListMouseClicked
//        JOptionPane.showMessageDialog(rTopPane, searchList.getSelectedValue(), "get stars", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_searchListMouseClicked

    private void searchListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchListMouseExited
//        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_searchListMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionButton;
    private javax.swing.JButton comedyButton;
    private javax.swing.JLabel dooWai;
    private javax.swing.JButton dramaButton;
    private javax.swing.JButton fictionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private components.PanelRound panelRound1;
    private components.PanelRound panelRound2;
    private components.PanelRound panelRound3;
    private components.PanelRound panelRound4;
    private javax.swing.JButton romanticButton;
    private javax.swing.JList<String> searchList;
    private javax.swing.JPanel sidePane;
    private javax.swing.JPanel sp2;
    private javax.swing.JPanel sp3;
    private javax.swing.JPanel topSidePane;
    // End of variables declaration//GEN-END:variables
}
