/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Sqlite;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Few
 */
public class UsersModel {

    private static Connection conn;

    private int id;
    private String email;
    private String name;
    private String password;
    private String type;

    public UsersModel() {
    }

    public UsersModel(int id, String email, String name, String password, String type) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static UsersModel findWithId(int id) {
        conn = Sqlite.getConnection();
        UsersModel users = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users = new UsersModel();
                users.setId(rs.getInt("id"));
                users.setName(rs.getString("name"));
                users.setEmail(rs.getString("email"));
                users.setType(rs.getString("type"));
                users.setPassword(rs.getString("password"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }
    
    public static UsersModel findWithEmail(String email) {
        conn = Sqlite.getConnection();
        UsersModel users = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users = new UsersModel();
                users.setId(rs.getInt("id"));
                users.setName(rs.getString("name"));
                users.setEmail(rs.getString("email"));
                users.setType(rs.getString("type"));
                users.setPassword(rs.getString("password"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }
    
    public static UsersModel findWithEmailAndPassword(String email, String password) {
        conn = Sqlite.getConnection();
        UsersModel users = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE email = ? and password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users = new UsersModel();
                users.setId(rs.getInt("id"));
                users.setName(rs.getString("name"));
                users.setEmail(rs.getString("email"));
                users.setType(rs.getString("type"));
                users.setPassword(rs.getString("password"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public static List<UsersModel> all() {
        conn = Sqlite.getConnection();
        List<UsersModel> users = new ArrayList<>();
        try {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                UsersModel user = new UsersModel();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setType(rs.getString("type"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public Boolean create(String email, String name, String password, String type) {
        conn = Sqlite.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users (email,name,password,type) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, email);
            ps.setString(2, name);
            ps.setString(3, password);
            ps.setString(4, type);

            ps.execute();
            ResultSet generatedKeys = ps.getGeneratedKeys();
            while (generatedKeys.next()) {
                setId((int) generatedKeys.getLong(1));
            }
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static boolean delete(int user_id) {
        conn = Sqlite.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM users WHERE id = ?");
            ps.setInt(1, user_id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
