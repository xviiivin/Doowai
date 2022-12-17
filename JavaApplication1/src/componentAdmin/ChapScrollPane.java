/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package componentAdmin;

import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import model.CartoonModel;
import model.ChapterImgModel;
import util.Useful;

/**
 *
 * @author sasimai
 */
public class ChapScrollPane extends javax.swing.JPanel {

    private Card4[] card;

    /**
     * Creates new form ChapScrollPane
     */
    public ChapScrollPane() {
        initComponents();
    }

    public void loopCardWithData(List<ChapterImgModel> chapimgdata) {

        scrollPane1.removeAll();
        scrollPane1.repaint();
        CatPane.removeAll();
        Card4[] cat = new Card4[chapimgdata.size()];
        for (int i = 0; i < chapimgdata.size(); i++) {
            cat[i] = new Card4();
        }
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        int x = 0;
        int y = 0;

        for (int i = 0; i < chapimgdata.size(); i++) {
            gbc.gridx = x;
            gbc.gridy = y;
            CatPane.add(cat[i], gbc);
            ImageIcon test = new Useful().FileImgtoImageIcon(chapimgdata.get(i).getFile_name(), 215, 180);
            if (test != null) {
                cat[i].getjLabel1().setIcon(test);
            }
            cat[i].getjLabel2().setText("#" + (i + 1));

            cat[i].setId(chapimgdata.get(i).getId());
            x++;
            if (x == 4) {
                x = 0;
                y++;
            }
        }
        scrollPane1.add(CatPane);
        this.card = cat;
    }

    public JPanel getCatPane() {
        return CatPane;
    }

    public void setCatPane(JPanel CatPane) {
        this.CatPane = CatPane;
    }

    public Card4[] getCard() {
        return card;
    }

    public void setCard(Card4[] card) {
        this.card = card;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        CatPane = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(934, 565));

        scrollPane1.setPreferredSize(new java.awt.Dimension(951, 834));
        scrollPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                scrollPane1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                scrollPane1MouseMoved(evt);
            }
        });

        CatPane.setBackground(new java.awt.Color(255, 255, 255));
        CatPane.setLayout(new java.awt.GridBagLayout());
        scrollPane1.add(CatPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void scrollPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollPane1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_scrollPane1MouseDragged

    private void scrollPane1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollPane1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_scrollPane1MouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CatPane;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
