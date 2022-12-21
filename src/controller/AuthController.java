/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.*;
import javax.swing.JOptionPane;
import view.*;
import model.*;

/**
 *
 * @author Few
 */
public class AuthController implements ActionListener, MouseListener {

    private Login login;
    private Register register;
    private UsersModel users;

    public AuthController() {
        login = new Login();
        register = new Register();
        users = new UsersModel();
        login.setVisible(true);
        login.getjButton1().addActionListener(this);
        login.getjLabel3().addMouseListener(this);
        register.getjButton1().addActionListener(this);
        register.getjButton2().addActionListener(this);

        login.getjTextField2().setText("");
        login.getjPasswordField1().setText("");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(login.getjLabel3())) {
            register.setVisible(true);
            login.setVisible(false);
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
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Login")) {
            String email = login.getjTextField2().getText();
            String password = login.getjPasswordField1().getText();
            UsersModel user = UsersModel.findWithEmailAndPassword(email, password);
            if (user == null) {
                JOptionPane.showMessageDialog(null, "User or password Incorrect !!!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println(user);
                JOptionPane.showMessageDialog(null, "Login Success !!!", "Error", JOptionPane.PLAIN_MESSAGE);
                login.setVisible(false);
                if (user.getType().equals("User")) {
                    new MainController(user);
                } else {
                    new AdminController(user);
                }
            }
        } else if (e.getActionCommand().equals("Sign in")) {
            register.setVisible(false);
            login.setVisible(true);
        } else if (e.getActionCommand().equals("Continue")) {
            String name = register.getjTextField1().getText();
            String email = register.getjTextField3().getText();
            String password1 = register.getjPasswordField1().getText();
            String password2 = register.getjPasswordField3().getText();
            String type = register.getjComboBox1().getSelectedItem().toString();
            UsersModel user = UsersModel.findWithEmail(email);
            System.out.println(user);
            if (!password1.equals(password2)) {
                JOptionPane.showMessageDialog(null, "Password not match !!!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (user != null) {
                JOptionPane.showMessageDialog(null, "User already exists !!!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (type.equals("User") || type.equals("Admin")) {
                users.create(email, name, password2, type);
                JOptionPane.showMessageDialog(null, "Register Success !!!", "Success", JOptionPane.PLAIN_MESSAGE);
                register.setVisible(false);
                login.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Only choose User or Admin !!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
