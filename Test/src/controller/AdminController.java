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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Date;
import model.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import util.Useful;

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
    private ChapterModel chapter;
    private ChapterImgModel chapter_img;

    private ArrayList<Object> previous = new ArrayList<Object>();

    public AdminController(UsersModel user) {

        category = new CategoryModel();

        cartoon = new CartoonModel();
        chapter = new ChapterModel();
        chapter_img = new ChapterImgModel();

        this.Account = user;
        adminFrame = new AdminFrame();
        adminLayout = new AdminLayout();
        adminBody = new AdminBody();
        adOne = new AdOne();
        //adTwo = new AdTwo();
        //adThree = new AdThree();
        //adFour = new AdFour();
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

        ArrayList<Object> arraylist1 = new ArrayList<Object>();
        arraylist1.add("adOne");
        arraylist1.add(adOne);
        previous.add(arraylist1);
        this.ChangeAdminBody();
//        adSide.getjButton10().addActionListener(this);

        adTop.getAdTopBut1().addMouseListener(this);
    }

    public void ChangeAdminBody() {
        if (this.adminbodypanel.equals("adOne")) {

            adminBody.removeAll();
            adminBody.add(adOne);
            adminBody.validate();
            adminBody.repaint();
            List<CategoryModel> catdata = category.all();
            adOne.getCategoryScrollPane1().loopCardWithData(catdata);

            adOne.getAdminBut11().removeMouseListener(this);
            adOne.getAdminBut12().removeMouseListener(this);
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
            adminBody.repaint();

            List<CartoonModel> cardata = cartoon.all(adTwo.getIdcat());
            adTwo.getCatroonScrollPane1().loopCardWithData(cardata);

            adTwo.getAdminBut11().removeMouseListener(this);
            adTwo.getAdminBut12().removeMouseListener(this);

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
            adminBody.repaint();

            CartoonModel cardata = new CartoonModel().findWithId(adThree.getIdcar());

            adThree.getjTextField1().setText(cardata.getName());

            adThree.getCard31().getjTextArea1().setText(cardata.getDetail());

            ImageIcon test = new Useful().FileImgtoImageIcon(cardata.getImg(), 230, 275);
            if (test != null) {
                adThree.getCard22().getjLabel1().setIcon(test);
            }

            adThree.getAdThreeBtn2().removeMouseListener(this);
            adThree.getCard22().removeMouseListener(this);
            adThree.getAdminBut11().removeMouseListener(this);
            adThree.getTableScrollPane1().removeMouseListener(this);

            adThree.getAdThreeBtn2().addMouseListener(this);
            adThree.getCard22().addMouseListener(this);

            adThree.getTableScrollPane1().getTable1().addMouseListener(this);

            adThree.getAdminBut11().addMouseListener(this);

            CartoonModel tesft = new CartoonModel().findWithId(adThree.getIdcar());
            List<ChapterModel> chapdata = chapter.all(adThree.getIdcar());
            adThree.getTableScrollPane1().loopTableWithData(chapdata, tesft.getName());

        } else if (this.adminbodypanel.equals("adFour")) {
            ChapterModel test = new ChapterModel().findWithId(adFour.getIdchap());

            List<ChapterImgModel> cardata = chapter_img.all(adFour.getIdchap());
            adFour.getChapScrollPane1().loopCardWithData(cardata);

            Card4[] card = adFour.getChapScrollPane1().getCard();
            for (int i = 0; i < card.length; i++) {
                card[i].getAdminBut31().addMouseListener(this);
                card[i].getAdminBut32().addMouseListener(this);
            }

            adFour.getAdminBut12().removeMouseListener(this);

            adFour.getAdminBut21().getjLabel1().setText(test.getName());
            adFour.getAdminBut12().addMouseListener(this);
            adminBody.removeAll();
            adminBody.add(adFour);
            adminBody.validate();
            adminBody.repaint();

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
        if (e.getSource().equals(adTop.getAdTopBut1())) {

            if (previous.size() - 2 < 0) {
                JOptionPane.showMessageDialog(null, "Not have page to previous !!!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                ArrayList test = (ArrayList) previous.get(previous.size() - 2);
                if (test.get(1).equals(adOne)) {
                    adOne = (AdOne) test.get(1);
                    this.adminbodypanel = test.get(0).toString();
                } else if (test.get(1).equals(adTwo)) {
                    adTwo = (AdTwo) test.get(1);
                    this.adminbodypanel = test.get(0).toString();
                } else if (test.get(1).equals(adThree)) {
                    adThree = (AdThree) test.get(1);
                    this.adminbodypanel = test.get(0).toString();
                } else if (test.get(1).equals(adFour)) {
                    adFour = (AdFour) test.get(1);
                    this.adminbodypanel = test.get(0).toString();
                }
                this.ChangeAdminBody();
                previous.remove(previous.size() - 1);
            }

        } else if (this.adminbodypanel.equals("adOne")) {
            if (e.getSource().equals(adOne.getAdminBut11())) {
                //add category
                String inputValue = JOptionPane.showInputDialog(null, "Please input a value", "Category", JOptionPane.QUESTION_MESSAGE);
                if (inputValue != null) {
                    new CategoryModel().create(inputValue);
                    List<CategoryModel> catdata = category.all();
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

                        ArrayList<Object> arraylist1 = new ArrayList<Object>();
                        arraylist1.add("adTwo");
                        arraylist1.add(adTwo);
                        previous.add(arraylist1);
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

                Card[] card = adTwo.getCatroonScrollPane1().getCard();
                for (int i = 0; i < card.length; i++) {
                    card[i].addMouseListener(this);
                }

                JOptionPane.showMessageDialog(null, "Add Cartoon Success !!!", "Success", JOptionPane.PLAIN_MESSAGE);

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
            } else if (e.getSource().getClass().getSimpleName().equals("Card")) {
                Card[] card = adTwo.getCatroonScrollPane1().getCard();
                for (int i = 0; i < card.length; i++) {
                    if (e.getSource().equals(card[i])) {
                        adThree = new AdThree(adTwo.getIdcat(), card[i].getId());
                        this.adminbodypanel = "adThree";
                        ArrayList<Object> arraylist1 = new ArrayList<Object>();
                        arraylist1.add("adThree");
                        arraylist1.add(adThree);
                        previous.add(arraylist1);
                        this.ChangeAdminBody();
                        break;
                    }
                    card[i].addMouseListener(this);
                }
            }
        } else if (this.adminbodypanel.equals("adThree")) {
            if (e.getSource().equals(adThree.getAdThreeBtn2())) {
                try {
                    CartoonModel cardata = new CartoonModel().findWithId(adThree.getIdcar());

                    if (adThree.getImgcartoon() != null) {
                        Date date = new Date();
                        long test = date.getTime();
                        String file_name = "image/cartoon/" + String.valueOf(test) + ".jpg";
                        ImageIO.write(adThree.getImgcartoon(), "jpg", new File(file_name));
                        new CartoonModel().update(adThree.getIdcar(), adThree.getjTextField1().getText(), adThree.getCard31().getjTextArea1().getText(), file_name, adThree.getIdcat());
                    } else {
                        new CartoonModel().update(adThree.getIdcar(), adThree.getjTextField1().getText(), adThree.getCard31().getjTextArea1().getText(), cardata.getImg(), adThree.getIdcat());
                    }

                    cardata = new CartoonModel().findWithId(adThree.getIdcar());
                    List<ChapterModel> chapdata = chapter.all(adThree.getIdcar());
                    adThree.getTableScrollPane1().loopTableWithData(chapdata, cardata.getName());

                    JOptionPane.showMessageDialog(null, "Update Success !!!", "Success", JOptionPane.PLAIN_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Cannot SaveFile !!!", "Error", JOptionPane.PLAIN_MESSAGE);
                }

            } else if (e.getSource().equals(adThree.getCard22())) {
                System.out.println("few");
                JFileChooser fc = new JFileChooser();
                FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
                fc.addChoosableFileFilter(imageFilter);
                fc.setAcceptAllFileFilterUsed(false);
                fc.showOpenDialog(adThree.getCard22()); // 

                File f = fc.getSelectedFile();
                if (f != null) {
                    try {
                        BufferedImage image = ImageIO.read(f);
                        ImageIcon imageIcon = new ImageIcon(image);
                        Image newimg = image.getScaledInstance(230, 275, java.awt.Image.SCALE_SMOOTH);
                        imageIcon = new ImageIcon(newimg);
                        adThree.getCard22().getjLabel1().setIcon(imageIcon);
                        adThree.setImgcartoon(image);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

            } else if (e.getSource().equals(adThree.getTableScrollPane1().getTable1()) && adThree.getTableScrollPane1().getTable1().getSelectedColumn() == 3) {
                Table t = adThree.getTableScrollPane1().getTable1();
                String test = t.getValueAt(t.getSelectedRow(), t.getSelectedColumn()).toString();
                adFour = new AdFour(parseInt(test), adThree.getIdcar(), adThree.getIdcat());
                this.adminbodypanel = "adFour";

                ArrayList<Object> arraylist1 = new ArrayList<Object>();
                arraylist1.add("adFour");
                arraylist1.add(adFour);
                previous.add(arraylist1);
                this.ChangeAdminBody();
                //System.out.println("row: " + t.getSelectedRow() + " column: " + t.getSelectedColumn() + " value: " + t.getValueAt(t.getSelectedRow(), t.getSelectedColumn()));
            } else if (e.getSource().equals(adThree.getTableScrollPane1().getTable1()) && adThree.getTableScrollPane1().getTable1().getSelectedColumn() == 4) {
                try {
                    Table t = adThree.getTableScrollPane1().getTable1();
                    String test = t.getValueAt(t.getSelectedRow(), t.getSelectedColumn()).toString();
                    new ChapterModel().delete(parseInt(test));
                    CartoonModel testf = new CartoonModel().findWithId(adThree.getIdcar());
                    List<ChapterModel> chapdata = chapter.all(adThree.getIdcar());
                    adThree.getTableScrollPane1().loopTableWithData(chapdata, testf.getName());
                    JOptionPane.showMessageDialog(null, "Delete Success !!!", "Success", JOptionPane.PLAIN_MESSAGE);

                } catch (ArrayIndexOutOfBoundsException ex) {

                }

            } else if (e.getSource().equals(adThree.getAdminBut11())) {
                String inputValue = JOptionPane.showInputDialog(null, "Please input a value", "Chapter", JOptionPane.QUESTION_MESSAGE);
                if (inputValue != null) {
                    System.out.println(inputValue + " " + adThree.getIdcar() + " " + adThree.getIdcat());
                    new ChapterModel().create(inputValue, adThree.getIdcar(), adThree.getIdcat());
                    CartoonModel test = new CartoonModel().findWithId(adThree.getIdcar());
                    List<ChapterModel> chapdata = chapter.all(adThree.getIdcar());
                    adThree.getTableScrollPane1().loopTableWithData(chapdata, test.getName());
                    JOptionPane.showMessageDialog(null, "Create Success !!!", "Success", JOptionPane.PLAIN_MESSAGE);
                }
            }
        } else if (this.adminbodypanel.equals("adFour")) {
            if (e.getSource().getClass().getSimpleName().equals("Table")) {
                return;
            } else if (e.getSource().equals(adFour.getAdminBut12())) {

                JFileChooser fc = new JFileChooser();
                FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
                fc.addChoosableFileFilter(imageFilter);
                fc.setAcceptAllFileFilterUsed(false);
                fc.showOpenDialog(adFour.getAdminBut12()); // 

                File f = fc.getSelectedFile();
                if (f != null) {
                    try {
                        BufferedImage image = ImageIO.read(f);
                        Date date = new Date();
                        long test = date.getTime();
                        String file_name = "image/chapter/" + String.valueOf(test) + ".jpg";
                        ImageIO.write(image, "jpg", new File(file_name));
                        new ChapterImgModel().create(file_name, adFour.getIdchap(), adFour.getIdcat(), adFour.getIdcar());

                        List<ChapterImgModel> cardata = chapter_img.all(adFour.getIdchap());
                        adFour.getChapScrollPane1().loopCardWithData(cardata);
                        Card4[] card = adFour.getChapScrollPane1().getCard();
                        for (int i = 0; i < card.length; i++) {
                            card[i].getAdminBut31().addMouseListener(this);
                            card[i].getAdminBut32().addMouseListener(this);
                        }

                        JOptionPane.showMessageDialog(null, "Add Image Success !!!", "Success", JOptionPane.PLAIN_MESSAGE);

                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "File Not Found !!!", "Error", JOptionPane.PLAIN_MESSAGE);
                        ex.printStackTrace();
                    }
                }
            } else {
                Card4[] card = adFour.getChapScrollPane1().getCard();
                for (int i = 0; i < card.length; i++) {
                    if (e.getSource().equals(card[i].getAdminBut31())) {

                        JFileChooser fc = new JFileChooser();
                        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
                        fc.addChoosableFileFilter(imageFilter);
                        fc.setAcceptAllFileFilterUsed(false);
                        fc.showOpenDialog(adFour.getAdminBut12()); // 

                        File f = fc.getSelectedFile();
                        if (f != null) {
                            try {
                                BufferedImage image = ImageIO.read(f);
                                ChapterImgModel chapimgfew = new ChapterImgModel().findWithId(card[i].getId());
                                ImageIO.write(image, "jpg", new File(chapimgfew.getFile_name()));
                                new ChapterImgModel().update(card[i].getId(), chapimgfew.getFile_name());
                                JOptionPane.showMessageDialog(null, "Update Image Success !!!", "Success", JOptionPane.PLAIN_MESSAGE);
                                break;
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, "File Not Found !!!", "Error", JOptionPane.PLAIN_MESSAGE);
                                break;
                            }
                        }

                        break;
                    } else if (e.getSource().equals(card[i].getAdminBut32())) {
                        //delete
                        new ChapterImgModel().delete(card[i].getId());
                        JOptionPane.showMessageDialog(null, "Delete Image Success !!!", "Success", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                }
                List<ChapterImgModel> cardata = chapter_img.all(adFour.getIdchap());
                adFour.getChapScrollPane1().loopCardWithData(cardata);
                card = adFour.getChapScrollPane1().getCard();
                System.out.println(card.length + "few");
                for (int i = 0; i < card.length; i++) {
                    card[i].getAdminBut31().addMouseListener(this);
                    card[i].getAdminBut32().addMouseListener(this);
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
