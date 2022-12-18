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
public class ChapterModel {

    private static Connection conn;

    private int id;
    private String name;
    private int idcartoon;
    private int idcategory;
    private long date;

    public ChapterModel() {
    }

    public ChapterModel(int id, String name, int idcartoon, int idcategory) {
        this.id = id;
        this.name = name;
        this.idcartoon = idcartoon;
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

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdcartoon() {
        return idcartoon;
    }

    public void setIdcartoon(int idcartoon) {
        this.idcartoon = idcartoon;
    }

    public int getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(int idcategory) {
        this.idcategory = idcategory;
    }

    public static ChapterModel findWithId(int id) {
        conn = Sqlite.getConnection();
        ChapterModel users = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM chapter WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users = new ChapterModel();
                users.setId(rs.getInt("id"));
                users.setName(rs.getString("name"));
                users.setIdcartoon(rs.getInt("idcartoon"));
                users.setIdcategory(rs.getInt("idcategory"));
                users.setDate(rs.getLong("date"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public static List<ChapterModel> all(int idcartoon) {
        conn = Sqlite.getConnection();
        List<ChapterModel> users = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM chapter WHERE idcartoon = ?");
            ps.setInt(1, idcartoon);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChapterModel user = new ChapterModel();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setIdcartoon(rs.getInt("idcartoon"));
                user.setIdcategory(rs.getInt("idcategory"));
                user.setDate(rs.getLong("date"));
                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public static List<ChapterModel> search(int idcartoon, String keyword) {
        conn = Sqlite.getConnection();
        List<ChapterModel> users = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM chapter WHERE idcartoon = ? AND name LIKE ?");
            ps.setInt(1, idcartoon);
            ps.setString(2, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChapterModel user = new ChapterModel();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setIdcartoon(rs.getInt("idcartoon"));
                user.setIdcategory(rs.getInt("idcategory"));
                user.setDate(rs.getLong("date"));
                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public Boolean create(String name, int idcartoon, int idcategory) {
        conn = Sqlite.getConnection();
        try {
            java.util.Date date = new java.util.Date();
            long test = date.getTime();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO chapter (name, idcartoon, idcategory, date) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            ps.setInt(2, idcartoon);
            ps.setInt(3, idcategory);
            ps.setLong(4, test);

            ps.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public Boolean update(int id, String name) {
        conn = Sqlite.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE chapter SET name = ? WHERE id = ?", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
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
            PreparedStatement ps = conn.prepareStatement("DELETE FROM chapter WHERE id = ?");
            ps.setInt(1, category_id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
