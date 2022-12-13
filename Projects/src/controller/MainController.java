/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author wiwat
 */
import frame.*;
import layout.*;
import java.awt.*;
import components.*;

public class MainController {
    private Mainframe mainFrame;
    private MainLayout mainLayout;
    private sidePane navPanel;
    private cartoonScrollPane contentPanel;
    private topPane topPanel;
    public MainController(){
        mainFrame = new Mainframe();
        mainLayout = new MainLayout();
        navPanel = new sidePane();
        contentPanel = new cartoonScrollPane();
        topPanel = new topPane();
        
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(mainLayout);
        
        mainLayout.getNavPanel().setLayout(new BorderLayout());
        mainLayout.getNavPanel().add(navPanel);
        
        mainLayout.getTopPanel().setLayout(new BorderLayout());
        mainLayout.getTopPanel().add(topPanel);
        
        mainLayout.getBodyPanel().setLayout(new BorderLayout());
        mainLayout.getBodyPanel().add(contentPanel);
        mainFrame.setVisible(true);
        
        mainLayout.getBodyPanel().removeAll();
        mainLayout.getBodyPanel().add(contentPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }
}
