package componentAdmin;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.ScrollPane;
import java.util.List;
import javax.swing.JPanel;
import model.CategoryModel;

public class CategoryScrollPane extends javax.swing.JPanel {

    private Card[] card;

    public CategoryScrollPane() {
        initComponents();
    }

    public void loopCardWithData(List<CategoryModel> catdata) {
        scrollPane1.removeAll();
        scrollPane1.repaint();
        CatPane.removeAll();
        Card[] cat = new Card[catdata.size()];
        for (int i = 0; i < catdata.size(); i++) {
            cat[i] = new Card();
        }
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        int x = 0;
        int y = 0;
        for (int i = 0; i < catdata.size(); i++) {
            gbc.gridx = x;
            gbc.gridy = y;
            CatPane.add(cat[i], gbc);
            cat[i].getjLabel1().setText(catdata.get(i).getName());
            cat[i].setId(catdata.get(i).getId());
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

    public Card[] getCard() {
        return card;
    }

    public ScrollPane getScrollPane1() {
        return scrollPane1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        CatPane = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1194, 565));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        scrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollPane1.setPreferredSize(new java.awt.Dimension(951, 565));
        scrollPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                scrollPane1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                scrollPane1MouseMoved(evt);
            }
        });

        CatPane.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {4};
        CatPane.setLayout(jPanel1Layout);
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
            .addGap(0, 638, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void scrollPane1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollPane1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_scrollPane1MouseMoved

    private void scrollPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollPane1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_scrollPane1MouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CatPane;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
