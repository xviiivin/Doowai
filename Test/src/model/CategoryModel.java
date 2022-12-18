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
public class CategoryModel {

    private static Connection conn;

    private int id;
    private String name;

    public CategoryModel() {
    }

    public CategoryModel(int id, String name) {
        this.id = id;
        this.name = name;
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

    public static CategoryModel findWithId(int id) {
        conn = Sqlite.getConnection();
        CategoryModel users = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM category WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users = new CategoryModel();
                users.setId(rs.getInt("id"));
                users.setName(rs.getString("name"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public static List<CategoryModel> all() {
        conn = Sqlite.getConnection();
        List<CategoryModel> users = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM category");
            while (rs.next()) {
                CategoryModel user = new CategoryModel();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public Boolean create(String name) {
        conn = Sqlite.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO category (name) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);

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

    public static boolean delete(int category_id) {
        conn = Sqlite.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM category WHERE id = ?");
            ps.setInt(1, category_id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
