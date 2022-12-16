/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author wiwat
 */
import componentAdmin.CategoryScrollPane;
import frame.*;
import layout.*;
import java.awt.*;
import components.*;
import model.UsersModel;
import view.*;

public class MainController {
    private Mainframe mainFrame;
    private MainLayout mainLayout;
    private sidePane navPanel;
//    private CategoryScrollPane contentPanel;
    private topPane topPanel;
    private topPaneRead topRead;
    private ReadCartoon ReadCar;
    private ReadOne readOne;
    private ReadMain readMain;
    private UsersModel Account;
//    private AdminLayout adminLayout;
//    private AdminController adminCon;
    public MainController(UsersModel user){
        this.Account = user;
        mainFrame = new Mainframe();
        mainLayout = new MainLayout();
        navPanel = new sidePane();
        topPanel = new topPane();
        topRead = new topPaneRead();
        ReadCar = new ReadCartoon();
        readOne = new ReadOne();
        readMain = new ReadMain();
//        contentPanel = new CategoryScrollPane();
        
        
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(mainLayout);
        
        mainLayout.getNavPanel().setLayout(new BorderLayout());
        mainLayout.getNavPanel().add(navPanel);
        
        mainLayout.getTopPanel().setLayout(new BorderLayout());
        mainLayout.getTopPanel().add(topPanel);
        
        mainLayout.getBodyPanel().setLayout(new BorderLayout());
        mainLayout.getBodyPanel().add(ReadCar);
        mainFrame.setVisible(true);
        System.out.println(this.Account.getEmail());
        
//        mainLayout.getBodyPanel().removeAll();
//        mainLayout.getBodyPanel().add(contentPanel);
//        mainFrame.revalidate();
//        mainFrame.repaint();
    }
}
