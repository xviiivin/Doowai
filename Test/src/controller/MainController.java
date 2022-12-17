/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author wiwat
 */
import componentAdmin.Card;
import componentAdmin.CategoryScrollPane;
import frame.*;
import layout.*;
import java.awt.*;
import components.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import model.CartoonModel;
import model.CategoryModel;
import model.UsersModel;
import view.*;

public class MainController implements ActionListener, MouseListener {

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

    private String mainbodypanel = "adOne";
//    private AdminLayout adminLayout;
//    private AdminController adminCon;

    public MainController(UsersModel user) {
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
        //mainLayout.getBodyPanel().add(readMain);
        mainFrame.setVisible(true);
        System.out.println(this.Account.getEmail());
        navPanel.getPanelRound4().addMouseListener(this);
//        mainLayout.getBodyPanel().removeAll();
//        mainLayout.getBodyPanel().add(contentPanel);
//        mainFrame.revalidate();
//        mainFrame.repaint();
        this.mainbodypanel = "readMain";
        changeMainpage();
    }

    public void changeMainpage() {
        if (this.mainbodypanel.equals("readMain")) {
            mainLayout.getBodyPanel().removeAll();
            mainLayout.getBodyPanel().add(readMain);
            mainLayout.getBodyPanel().validate();
            readMain.getCartoonScrollPaneUser1().loopCardWithData(new CartoonModel().all1());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource().equals(navPanel.getPanelRound4())) {
            mainFrame.setVisible(false);
            new AuthController();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
