/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;
import java.awt.*;
import javax.swing.*;
import model.UsersModel;

public class modalUser extends JDialog {
  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();
  JPanel p3 = new JPanel();
  JPanel p4 = new JPanel();
  JPanel p5 = new JPanel();
  JLabel label1 = new JLabel("Your name");
  JLabel label2 = new JLabel("Your E-mail");
  JLabel label3 = new JLabel("Type");
  JTextField nameField = new JTextField();
  JTextField mailField = new JTextField();
  JTextField typeField = new JTextField();
  private UsersModel Account;

  public modalUser(UsersModel Account) {
    nameField.setText(Account.getName());
    mailField.setText(Account.getEmail());
    typeField.setText(Account.getType());
    this.setTitle("Info");
    this.setLayout(new BorderLayout());
    this.add(p1);
    this.add(p2, BorderLayout.NORTH);
    this.add(p3, BorderLayout.EAST);
    this.add(p4, BorderLayout.WEST);
    this.add(p5, BorderLayout.SOUTH);
    p1.setLayout(new GridLayout(3,2));
    nameField.setEditable(false);
    mailField.setEditable(false);
    typeField.setEditable(false);
    p1.add(label1);
    p1.add(nameField);
    p1.add(label2);
    p1.add(mailField);
    p1.add(label3);
    p1.add(typeField);
    this.setSize(450, 230);
    this.setVisible(true);
  }

    public JPanel getP1() {
        return p1;
    }

    public void setP1(JPanel p1) {
        this.p1 = p1;
    }

    public JPanel getP2() {
        return p2;
    }

    public void setP2(JPanel p2) {
        this.p2 = p2;
    }

    public JPanel getP3() {
        return p3;
    }

    public void setP3(JPanel p3) {
        this.p3 = p3;
    }

    public JPanel getP4() {
        return p4;
    }

    public void setP4(JPanel p4) {
        this.p4 = p4;
    }

    public JPanel getP5() {
        return p5;
    }

    public void setP5(JPanel p5) {
        this.p5 = p5;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public JLabel getLabel3() {
        return label3;
    }

    public void setLabel3(JLabel label3) {
        this.label3 = label3;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public void setNameField(JTextField nameField) {
        this.nameField = nameField;
    }

    public JTextField getMailField() {
        return mailField;
    }

    public void setMailField(JTextField mailField) {
        this.mailField = mailField;
    }

    public JTextField getTypeField() {
        return typeField;
    }

    public void setTypeField(JTextField typeField) {
        this.typeField = typeField;
    }
}

