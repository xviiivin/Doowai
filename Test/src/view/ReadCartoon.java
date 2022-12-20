/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import componentAdmin.Card;
import componentAdmin.Card2;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import model.ChapterImgModel;
import util.Useful;

/**
 *
 * @author sasimai
 */
public class ReadCartoon extends javax.swing.JPanel {

    private int id;
    private JLabel f;

    /**
     * Creates new form ReadCartoon
     */
    public ReadCartoon(List<ChapterImgModel> data) {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(18);
        try {
            if (data.size() == 0) {
                jPanel2.setLayout(new GridLayout(1, 0));
            } else {
                jPanel2.setLayout(new GridLayout(data.size(), 0));
            }

            for (int i = 0; i < data.size(); i++) {
                f = new JLabel("", SwingConstants.CENTER);
                BufferedImage bimg = ImageIO.read(new File(data.get(i).getFile_name()));
                int width = bimg.getWidth();
                int height = bimg.getHeight();
                if (width > 930) {
                    width = 930;
                }
                ImageIcon test = new Useful().FileImgtoImageIcon(data.get(i).getFile_name(), width, height);
                if (test != null) {
                    f.setIcon(test);
                    //getjScrollPane1().removeAll();
                    //getjScrollPane1().add(jLabel1);
                    jPanel2.add(f);
                }
            }

        } catch (IOException ex) {

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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(945, 686));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1186, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
