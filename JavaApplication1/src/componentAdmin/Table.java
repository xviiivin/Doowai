/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentAdmin;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author sasimai
 */
public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setShowVerticalLines(false);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {

                if (i1 == 3) {
                    return new AdminBut3();
                } else if (i1 == 4) {
                    AdminBut3 del = new AdminBut3();
                    del.getPanelRound1().setBackground(new Color(245, 115, 115));
                    del.getjLabel1().setText("Delete");
                    return del;
                } else {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    com.setBackground(Color.WHITE);
                    if (selected) {
                        com.setForeground(new Color(15, 89, 140));
                    } else {
                        com.setForeground(new Color(102, 102, 102));
                    }
                    return com;
                }
            }
        });
    }

}
