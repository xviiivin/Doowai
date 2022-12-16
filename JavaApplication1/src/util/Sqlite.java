package util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.lang.System.Logger;
import java.util.logging.Level;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Few
 */
public class Sqlite {

    private static Connection connection = null;

    public static void setConnection(String path) {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:" + path);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        Sqlite.connection = conn;
    }

    public static Connection getConnection() {
        if (Sqlite.connection == null) {
            Sqlite.setConnection("doowai.db");
        }
        return connection;
    }
}
