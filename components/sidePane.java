package components;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicButtonUI;
import model.CategoryModel;

public class sidePane extends javax.swing.JPanel {

    private int id;
    
    private List<CategoryModel> fewza;

    private JButton[] jbf;

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public List<CategoryModel> getFewza() {
        return fewza;
    }

    public void setFewza(List<CategoryModel> fewza) {
        this.fewza = fewza;
    }

    public PanelRound getPanelRound2() {
        return panelRound2;
    }

    public void setPanelRound2(PanelRound panelRound2) {
        this.panelRound2 = panelRound2;
    }

    public PanelRound getPanelRound3() {
        return panelRound3;
    }

    public void setPanelRound3(PanelRound panelRound3) {
        this.panelRound3 = panelRound3;
    }

    public JButton[] getJbf() {
        return jbf;
    }

    public void setJbf(JButton[] jbf) {
        this.jbf = jbf;
    }

    public void LoopListCategory(List<CategoryModel> few) {
        fewza = few;
        JButton fewbut;
        jbf = new JButton[few.size()];
        if (few.size() == 0) {
            jPanel1.setLayout(new GridLayout(1, 0));
        } else {
            jPanel1.setLayout(new GridLayout(few.size(), 0));
        }

        for (int i = 0; i < few.size(); i++) {
            fewbut = new JButton(few.get(i).getName());
            fewbut.setUI(new BasicButtonUI());
            fewbut.setBackground(Color.white);
            fewbut.setBorder(new EmptyBorder(0, 0, 0, 0));
            jPanel1.add(fewbut);
            jbf[i] = fewbut;
        }
        if (jbf.length > 0) {
            for (JButton btn : jbf) {
                btn.setUI(new BasicButtonUI());
                btn.setBackground(new Color(255, 255, 255));
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
                        btn.setBackground(Color.LIGHT_GRAY);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        btn.setForeground(Color.black);
                        btn.setBackground(new Color(255, 255, 255));
                    }
                });
            }
        }

    }

    public sidePane() {
        initComponents();

        JPanel[] pn = {panelRound1, panelRound2, panelRound3, panelRound4};
        for (JPanel pnl : pn) {
            pnl.setBackground(new Color(255, 255, 255));
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
                    if (e.getSource().equals(pnl)) {
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
        jLabel5.setText("Category");
        panelRound3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 20));

        sp3.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 40));

        sidePane.add(sp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 221, -1, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(243, 172));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.rowHeights = new int[] {1};
        jPanel1.setLayout(jPanel1Layout);
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
        jLabel7.setText("Logout");
        panelRound4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 20));

        jPanel3.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 40));

        sidePane.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 463, -1, 370));

        add(sidePane, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void searchListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchListMouseClicked
//        JOptionPane.showMessageDialog(rTopPane, searchList.getSelectedValue(), "get stars", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_searchListMouseClicked

    private void searchListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchListMouseExited
//        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_searchListMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dooWai;
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
    private javax.swing.JList<String> searchList;
    private javax.swing.JPanel sidePane;
    private javax.swing.JPanel sp2;
    private javax.swing.JPanel sp3;
    private javax.swing.JPanel topSidePane;
    // End of variables declaration//GEN-END:variables
}
