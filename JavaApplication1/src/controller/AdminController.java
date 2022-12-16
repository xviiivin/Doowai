/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author sasimai
 */
import view.*;
import frame.*;
import layout.*;
import java.awt.*;
import components.*;
import model.UsersModel;
import componentAdmin.*;
import java.awt.event.*;
import model.*;
import java.util.List;
import javax.swing.JOptionPane;

public class AdminController implements ActionListener, MouseListener {

    private AdminFrame adminFrame;
    private AdminLayout adminLayout;
    private AdminBody adminBody;
    private AdOne adOne;
    private AdTwo adTwo;
    private AdThree adThree;
    private AdFour adFour;
    private UsersModel Account;

    private CategoryScrollPane catscroll;

    private adsidePane adSide;
    private adtopPane adTop;

    private String adminbodypanel = "adOne";

    private CategoryModel category;
    private CartoonModel cartoon;

    public AdminController(UsersModel user) {
        category = new CategoryModel();
        cartoon = new CartoonModel();

        this.Account = user;
        adminFrame = new AdminFrame();
        adminLayout = new AdminLayout();
        adminBody = new AdminBody();
        adOne = new AdOne();
        //adTwo = new AdTwo();
        //adThree = new AdThree();
        adFour = new AdFour();
        adSide = new adsidePane();
        adTop = new adtopPane();

        adminLayout.getAdminNavPanel().setLayout(new BorderLayout());
        adminLayout.getAdminNavPanel().add(adSide);

        adminLayout.getAdminTopPanel().setLayout(new BorderLayout());
        adminLayout.getAdminTopPanel().add(adTop);

        adminLayout.getAdminBodyPanel().setLayout(new BorderLayout());
        adminLayout.getAdminBodyPanel().add(adminBody);

        adminBody.setLayout(new BorderLayout());
        //adminBody.add(adOne);
        //adminBody.add(adTwo);
        //adminBody.add(adThree);
        //adminBody.add(adFour);

        adminFrame.setLayout(new BorderLayout());
        adminFrame.add(adminLayout);
        adminFrame.setVisible(true);
        this.ChangeAdminBody();
        adSide.getjButton10().addActionListener(this);
    }

    public void ChangeAdminBody() {
        if (this.adminbodypanel.equals("adOne")) {
            adminBody.add(adOne);
            List<CategoryModel> catdata = category.all();
            adOne.getCategoryScrollPane1().loopCardWithData(catdata);
            adOne.getAdminBut11().addMouseListener(this);
            adOne.getAdminBut12().addMouseListener(this);

            Card[] card = adOne.getCategoryScrollPane1().getCard();
            for (int i = 0; i < card.length; i++) {
                card[i].addMouseListener(this);
            }
        } else if (this.adminbodypanel.equals("adTwo")) {
            adminBody.removeAll();
            adminBody.add(adTwo);
            adminBody.validate();

            List<CartoonModel> cardata = cartoon.all(adTwo.getIdcat());
            adTwo.getCatroonScrollPane1().loopCardWithData(cardata);
            adTwo.getAdminBut11().addMouseListener(this);
            adTwo.getAdminBut12().addMouseListener(this);

            Card[] card = adTwo.getCatroonScrollPane1().getCard();
            for (int i = 0; i < card.length; i++) {
                card[i].addMouseListener(this);
            }
        } else if (this.adminbodypanel.equals("adThree")) {
            adminBody.removeAll();
            adminBody.add(adThree);
            adminBody.validate();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("  Logout")) {
            adminFrame.setVisible(false);
            new AuthController();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.adminbodypanel.equals("adOne")) {
            if (e.getSource().equals(adOne.getAdminBut11())) {
                //add category
                String inputValue = JOptionPane.showInputDialog(null, "Please input a value", JOptionPane.QUESTION_MESSAGE);
                if (inputValue != null) {
                    new CategoryModel().create(inputValue);
                    List<CategoryModel> catdata = category.all();
                    adOne.getCategoryScrollPane1().loopCardWithData(catdata);

                    adOne.getCategoryScrollPane1().loopCardWithData(catdata);
                    Card[] card = adOne.getCategoryScrollPane1().getCard();
                    for (int i = 0; i < card.length; i++) {
                        card[i].addMouseListener(this);
                    }
                }

            } else if (e.getSource().equals(adOne.getAdminBut12())) {
                boolean check = false;
                Card[] card = adOne.getCategoryScrollPane1().getCard();
                for (int i = 0; i < card.length; i++) {
                    if (card[i].getjCheckBox1().isSelected()) {
                        new CategoryModel().delete(card[i].getId());
                        adOne.getCategoryScrollPane1().getCatPane().remove(card[i]);
                        check = true;
                    }
                }
                if (check) {
                    JOptionPane.showMessageDialog(null, "Delete Success !!!", "Success", JOptionPane.PLAIN_MESSAGE);
                    List<CategoryModel> catdata = category.all();
                    adOne.getCategoryScrollPane1().loopCardWithData(catdata);
                    card = adOne.getCategoryScrollPane1().getCard();
                    for (int i = 0; i < card.length; i++) {
                        card[i].addMouseListener(this);
                    }
                    System.out.println(catdata.size());
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a card to delete !!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                Card[] card = adOne.getCategoryScrollPane1().getCard();
                for (int i = 0; i < card.length; i++) {
                    if (e.getSource().equals(card[i])) {
                        adTwo = new AdTwo(card[i].getId());
                        this.adminbodypanel = "adTwo";
                        this.ChangeAdminBody();
                        break;
                    }
                    card[i].addMouseListener(this);
                }
            }
        } else if (this.adminbodypanel.equals("adTwo")) {
            if (e.getSource().equals(adTwo.getAdminBut11())) {
                //add category
                new CartoonModel().create("", "", "./src/images/Do.png", adTwo.getIdcat());
                //cartoon.create("", "", "./src/images/Do.png",);
                List<CartoonModel> cardata = cartoon.all(adTwo.getIdcat());
                adTwo.getCatroonScrollPane1().loopCardWithData(cardata);
            } else if (e.getSource().equals(adTwo.getAdminBut12())) {
                boolean check = false;
                Card[] card = adTwo.getCatroonScrollPane1().getCard();
                for (int i = 0; i < card.length; i++) {
                    if (card[i].getjCheckBox1().isSelected()) {
                        new CartoonModel().delete(card[i].getId());
                        adTwo.getCatroonScrollPane1().getCatPane().remove(card[i]);
                        check = true;
                    }
                }
                if (check) {
                    JOptionPane.showMessageDialog(null, "Delete Success !!!", "Success", JOptionPane.PLAIN_MESSAGE);
                    List<CartoonModel> catdata = cartoon.all(adTwo.getIdcat());
                    adTwo.getCatroonScrollPane1().loopCardWithData(catdata);
                    card = adTwo.getCatroonScrollPane1().getCard();
                    for (int i = 0; i < card.length; i++) {
                        card[i].addMouseListener(this);
                    }
                    System.out.println(catdata.size());
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a card to delete !!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                Card[] card = adTwo.getCatroonScrollPane1().getCard();
                for (int i = 0; i < card.length; i++) {
                    if (e.getSource().equals(card[i])) {
                        adThree = new AdThree(adTwo.getIdcat(), card[i].getId());
                        this.adminbodypanel = "adThree";
                        this.ChangeAdminBody();
                        break;
                    }
                    card[i].addMouseListener(this);
                }
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

}
