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
public class CartoonModel {

    private static Connection conn;

    private int id;
    private String name;
    private String detail;
    private String img;
    private int idcategory;

    public CartoonModel() {
    }

    public CartoonModel(int id, String name, String detail, String img, int idcategory) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.img = img;
        this.idcategory = idcategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(int idcategory) {
        this.idcategory = idcategory;
    }

    public static CartoonModel findWithId(int id) {
        conn = Sqlite.getConnection();
        CartoonModel users = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM cartoon WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users = new CartoonModel();
                users.setId(rs.getInt("id"));
                users.setName(rs.getString("name"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public static List<CartoonModel> all(int idcategory) {
        conn = Sqlite.getConnection();
        List<CartoonModel> users = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM cartoon WHERE idcategory = ?");
            ps.setInt(1, idcategory);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CartoonModel user = new CartoonModel();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setDetail(rs.getString("img"));
                user.setIdcategory(rs.getInt("idcategory"));
                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public Boolean create(String name, String detail, String img, int idcategory) {
        conn = Sqlite.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO cartoon (name, detail, img, idcategory) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            ps.setString(2, detail);
            ps.setString(3, img);
            ps.setInt(4, idcategory);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static boolean delete(int category_id) {
        conn = Sqlite.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM cartoon WHERE id = ?");
            ps.setInt(1, category_id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
