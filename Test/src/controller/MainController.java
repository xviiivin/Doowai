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
import componentAdmin.Table;
import frame.*;
import layout.*;
import java.awt.*;
import components.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Integer.parseInt;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import model.CartoonModel;
import model.CategoryModel;
import model.ChapterModel;
import model.UsersModel;
import util.Useful;
import view.*;
import java.util.List;
import javax.swing.JOptionPane;
import model.ChapterImgModel;
import model.FavouriteModel;

public class MainController implements ActionListener, MouseListener, KeyListener {

    private Mainframe mainFrame;
    private MainLayout mainLayout;
    private sidePane navPanel;
//    private CategoryScrollPane contentPanel;
    private topPaneza topPanel;

    private topPaneRead topRead;
    private topPaneRead1 topRead1;

    private ReadCartoon readCar;
    private ReadOne readOne;
    private ReadMain readMain;
    private ReadFavourite readFavourite;

    private UsersModel Account;

    private String mainbodypanel = "adOne";
//    private AdminLayout adminLayout;
//    private AdminController adminCon;

    public MainController(UsersModel user) {
        this.Account = user;
        mainFrame = new Mainframe();
        mainLayout = new MainLayout();
        navPanel = new sidePane();
        topPanel = new topPaneza();
        topRead1 = new topPaneRead1();
        topRead = new topPaneRead();
        //ReadCar = new ReadCartoon();
        //readOne = new ReadOne();
        readMain = new ReadMain();
        readFavourite = new ReadFavourite();
//        contentPanel = new CategoryScrollPane();

        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(mainLayout);

        mainLayout.getNavPanel().setLayout(new BorderLayout());
        mainLayout.getNavPanel().add(navPanel);

        mainLayout.getTopPanel().setLayout(new BorderLayout());
        //mainLayout.getTopPanel().add(topPanel);

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

        navPanel.getPanelRound2().addMouseListener(this);
        navPanel.getPanelRound3().addMouseListener(this);

        changeMainpage();
    }

    public MainController() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void changeMainpage() {
        if (this.mainbodypanel.equals("readMain")) {
            mainLayout.getBodyPanel().removeAll();
            mainLayout.getBodyPanel().add(readMain);
            mainLayout.getBodyPanel().validate();
            readMain.getCartoonScrollPaneUser1().loopCardWithData(new CartoonModel().search(""), this.Account.getId());
            CardMain[] card = readMain.getCartoonScrollPaneUser1().getCard();
            for (int i = 0; i < card.length; i++) {
                card[i].getjLabel3().addMouseListener(this);
                card[i].addMouseListener(this);
            }
            mainLayout.getTopPanel().removeAll();
            mainLayout.getTopPanel().add(topPanel);
            mainLayout.getTopPanel().validate();
            topPanel.getSearchBar().addKeyListener(this);

        } else if (this.mainbodypanel.equals("readOne")) {
            mainLayout.getBodyPanel().removeAll();
            mainLayout.getBodyPanel().add(readOne);
            mainLayout.getBodyPanel().validate();

            CartoonModel cardata = new CartoonModel().findWithId(readOne.getId());

            readOne.getAdminBut21().getjLabel1().setText(cardata.getName());
            ImageIcon test = new Useful().FileImgtoImageIcon(cardata.getImg(), 230, 275);
            if (test != null) {
                readOne.getCard21().getjLabel1().setIcon(test);
            }

            readOne.getCard31().getjTextArea1().setText(cardata.getDetail());
            List<ChapterModel> chapdata = new ChapterModel().all(readOne.getId());
            readOne.getTableScrollpane1().loopTableWithData(chapdata, cardata.getName());
            readOne.getTableScrollpane1().getTable1().addMouseListener(this);
        } else if (this.mainbodypanel.equals("readCar")) {
            mainLayout.getBodyPanel().removeAll();
            mainLayout.getBodyPanel().add(readCar);
            mainLayout.getBodyPanel().validate();

            mainLayout.getTopPanel().removeAll();
            mainLayout.getTopPanel().add(topRead1);
            mainLayout.getTopPanel().validate();

            //topRead
        } else if (this.mainbodypanel.equals("readFavourite")) {
            mainLayout.getBodyPanel().removeAll();
            mainLayout.getBodyPanel().add(readFavourite);
            mainLayout.getBodyPanel().validate();
            readFavourite.getCartoonScrollPaneUser1().loopCardWithData(new FavouriteModel().search(this.Account.getId(), ""), this.Account.getId());
            CardMain[] card = readFavourite.getCartoonScrollPaneUser1().getCard();
            for (int i = 0; i < card.length; i++) {
                card[i].getjLabel3().addMouseListener(this);
                card[i].addMouseListener(this);
            }

            mainLayout.getTopPanel().removeAll();
            mainLayout.getTopPanel().add(topPanel);
            mainLayout.getTopPanel().validate();

            topPanel.getSearchBar().addKeyListener(this);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource().equals(navPanel.getPanelRound2())) {
            this.mainbodypanel = "readFavourite";
            this.changeMainpage();
        } else if (e.getSource().equals(navPanel.getPanelRound3())) {
            this.mainbodypanel = "readMain";
            this.changeMainpage();

        } else if (e.getSource().equals(navPanel.getPanelRound4())) {
            mainFrame.setVisible(false);
            new AuthController();
        } else if (this.mainbodypanel.equals("readMain")) {

            if (e.getSource().getClass().getSimpleName().equals("JLabel")) {
                CardMain[] card = readMain.getCartoonScrollPaneUser1().getCard();
                for (int i = 0; i < card.length; i++) {
                    if (e.getSource().equals(card[i].getjLabel3())) {

                        FavouriteModel checkfavou = new FavouriteModel().findWithIdUserAndIdCartoon(this.Account.getId(), card[i].getId());
                        if (checkfavou == null) {
                            new FavouriteModel().create(Account.getId(), card[i].getId());
                            card[i].getjLabel3().setIcon(new Useful().FileImgtoImageIcon("image/heart2.png", 25, 25));
                        } else {
                            new FavouriteModel().delete(Account.getId(), card[i].getId());
                            card[i].getjLabel3().setIcon(new Useful().FileImgtoImageIcon("image/heart1.png", 25, 25));
                        }

                        break;
                    }
                    card[i].addMouseListener(this);
                }
            } else {
                CardMain[] card = readMain.getCartoonScrollPaneUser1().getCard();
                for (int i = 0; i < card.length; i++) {
                    if (e.getSource().equals(card[i])) {
                        readOne = new ReadOne(card[i].getId());
                        this.mainbodypanel = "readOne";
                        this.changeMainpage();
                        break;
                    }
                    card[i].addMouseListener(this);
                }
            }

        } else if (this.mainbodypanel.equals("readFavourite")) {

            if (e.getSource().getClass().getSimpleName().equals("JLabel")) {
                System.out.println(e);
                CardMain[] card = readFavourite.getCartoonScrollPaneUser1().getCard();
                for (int i = 0; i < card.length; i++) {
                    if (e.getSource().equals(card[i].getjLabel3())) {
                        new FavouriteModel().delete(Account.getId(), card[i].getId());
                        readFavourite.getCartoonScrollPaneUser1().loopCardWithData(new FavouriteModel().search(this.Account.getId(), ""), this.Account.getId());
                        CardMain[] cardf = readFavourite.getCartoonScrollPaneUser1().getCard();
                        for (int ij = 0; ij < cardf.length; ij++) {
                            cardf[ij].getjLabel3().addMouseListener(this);
                            cardf[ij].addMouseListener(this);
                        }
                        mainLayout.getTopPanel().add(topPanel);
                        topPanel.getSearchBar().addKeyListener(this);
                        break;
                    }
                    card[i].addMouseListener(this);
                }
            } else {
                CardMain[] card = readFavourite.getCartoonScrollPaneUser1().getCard();
                for (int i = 0; i < card.length; i++) {
                    if (e.getSource().equals(card[i])) {
                        readOne = new ReadOne(card[i].getId());
                        this.mainbodypanel = "readOne";
                        this.changeMainpage();
                        break;
                    }
                    card[i].addMouseListener(this);
                }
            }

        } else if (this.mainbodypanel.equals("readOne")) {
            if (e.getSource().equals(readOne.getTableScrollpane1().getTable1())) {
                Table1 t = readOne.getTableScrollpane1().getTable1();
                String test = t.getValueAt(t.getSelectedRow(), t.getSelectedColumn()).toString();
                System.out.println(parseInt(test));
                List<ChapterImgModel> few = new ChapterImgModel().all(parseInt(test));
                readCar = new ReadCartoon(few);
                this.mainbodypanel = "readCar";
                this.changeMainpage();
            }
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (this.mainbodypanel.equals("readMain")) {
            if (e.getSource().equals(topPanel.getSearchBar())) {
                readMain.getCartoonScrollPaneUser1().loopCardWithData(new CartoonModel().search(topPanel.getSearchBar().getText()), this.Account.getId());
                CardMain[] card = readMain.getCartoonScrollPaneUser1().getCard();
                for (int i = 0; i < card.length; i++) {
                    card[i].addMouseListener(this);
                }
            }
        } else if (this.mainbodypanel.equals("readOne")) {
            if (e.getSource().equals(topPanel.getSearchBar())) {
                System.out.println(topPanel.getSearchBar().getText());
                CartoonModel cardata = new CartoonModel().findWithId(readOne.getId());
                List<ChapterModel> chapdata = new ChapterModel().search(readOne.getId(), topPanel.getSearchBar().getText());
                readOne.getTableScrollpane1().loopTableWithData(chapdata, cardata.getName());
            }
        } else if (this.mainbodypanel.equals("readFavourite")) {
            if (e.getSource().equals(topPanel.getSearchBar())) {
                readFavourite.getCartoonScrollPaneUser1().loopCardWithData(new FavouriteModel().search(this.Account.getId(), topPanel.getSearchBar().getText()), this.Account.getId());
                CardMain[] card = readFavourite.getCartoonScrollPaneUser1().getCard();
                for (int i = 0; i < card.length; i++) {
                    card[i].addMouseListener(this);
                }
            }
        }
    }

}
