/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

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
public class topPaneza extends javax.swing.JPanel {
    private UsersModel infoUser;

    public JTextField getSearchBar() {
        return searchBar;
    }

    public void setSearchBar(JTextField searchBar) {
        this.searchBar = searchBar;
    }

    /**
     * Creates new form topPane
     */
    public topPaneza(UsersModel infoUser) {
        this.infoUser = infoUser;
        initComponents();
        addPlaceholderStyle(searchBar);
        removePlaceholderStyle(searchBar);
        jSeparator1.setBackground(new Color(238,238,238));
        jSeparator2.setBackground(new Color(238,238,238));
//        roundedButton1.setBackground(new Color(242,242,242));
        JButton [] btns = {accountButton,searchButton};
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
        searchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        searchBar = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(951, 148));

        rTopPane.setBackground(new java.awt.Color(255, 255, 255));
        rTopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
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

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 2.png"))); // NOI18N
        searchButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rTopPane.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 112, 20, 20));

        jSeparator1.setBackground(new java.awt.Color(238, 238, 233));
        jSeparator1.setForeground(new java.awt.Color(238, 238, 233));
        jSeparator1.setPreferredSize(new java.awt.Dimension(951, 10));
        rTopPane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(238, 238, 233));
        jSeparator2.setForeground(new java.awt.Color(238, 238, 233));
        jSeparator2.setPreferredSize(new java.awt.Dimension(951, 10));
        rTopPane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        searchBar.setForeground(new java.awt.Color(204, 204, 204));
        searchBar.setText("Search for something");
        searchBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchBarFocusLost(evt);
            }
        });
        searchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBarMouseExited(evt);
            }
        });
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });
        rTopPane.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 115, 400, -1));

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
            .addGap(0, 148, Short.MAX_VALUE)
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

    private void searchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBarFocusGained
        if (searchBar.getText().equals("Search for something")) {
            searchBar.setText(null);
            searchBar.requestFocus();
            removePlaceholderStyle(searchBar);
        }
    }//GEN-LAST:event_searchBarFocusGained

    private void searchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBarFocusLost
        if (searchBar.getText().length()==0) {
            addPlaceholderStyle(searchBar);
            searchBar.setText("Search for something");
        }
    }//GEN-LAST:event_searchBarFocusLost

    private void searchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBarMouseClicked
 
    }//GEN-LAST:event_searchBarMouseClicked

    private void searchBarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBarMouseExited

    }//GEN-LAST:event_searchBarMouseExited

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed

    }//GEN-LAST:event_searchBarActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased

    }//GEN-LAST:event_searchBarKeyReleased

    private void allComicButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allComicButtonMouseEntered

    }//GEN-LAST:event_allComicButtonMouseEntered

    private void allComicButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allComicButtonMouseExited

    }//GEN-LAST:event_allComicButtonMouseExited

    private void roundedButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedButton1MouseExited
        //roundedButton1.setBackground(new Color(242,242,242));
        //allComic.setForeground(Color.BLACK);
    }//GEN-LAST:event_roundedButton1MouseExited

    private void roundedButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedButton1MouseEntered
        //roundedButton1.setBackground(Color.BLACK);
        //allComic.setForeground(Color.WHITE);
    }//GEN-LAST:event_roundedButton1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel rTopPane;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
