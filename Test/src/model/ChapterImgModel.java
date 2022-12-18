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
public class ChapterImgModel {

    private static Connection conn;

    private int id;
    private String file_name;
    private int idchapter;
    private int idcartoon;
    private int idcategory;

    public ChapterImgModel() {
    }

    public ChapterImgModel(int id, String file_name, int idchapter, int idcartoon, int idcategory) {
        this.id = id;
        this.file_name = file_name;
        this.idchapter = idchapter;
        this.idcartoon = idcartoon;
        this.idcategory = idcategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public int getIdchapter() {
        return idchapter;
    }

    public void setIdchapter(int idchapter) {
        this.idchapter = idchapter;
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

    public static ChapterImgModel findWithId(int id) {
        conn = Sqlite.getConnection();
        ChapterImgModel users = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM chapter_img WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users = new ChapterImgModel();
                users.setId(rs.getInt("id"));
                users.setFile_name(rs.getString("file_img"));
                users.setIdchapter(rs.getInt("idchapter"));
                users.setIdcartoon(rs.getInt("idcartoon"));
                users.setIdcategory(rs.getInt("idcategory"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public static List<ChapterImgModel> all(int idcartoon) {
        conn = Sqlite.getConnection();
        List<ChapterImgModel> users = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM chapter_img WHERE idchapter = ?");
            ps.setInt(1, idcartoon);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChapterImgModel user = new ChapterImgModel();
                user.setId(rs.getInt("id"));
                user.setFile_name(rs.getString("file_img"));
                user.setIdchapter(rs.getInt("idchapter"));
                user.setIdcartoon(rs.getInt("idcartoon"));
                user.setIdcategory(rs.getInt("idcategory"));
                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public Boolean create(String name, int idchapter, int idcartoon, int idcategory) {
        conn = Sqlite.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO chapter_img (file_img, idchapter, idcartoon, idcategory) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            ps.setInt(2, idchapter);
            ps.setInt(3, idcartoon);
            ps.setInt(4, idcategory);
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
            PreparedStatement ps = conn.prepareStatement("UPDATE chapter_img SET file_img = ? WHERE id = ?", Statement.RETURN_GENERATED_KEYS);
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
            PreparedStatement ps = conn.prepareStatement("DELETE FROM chapter_img WHERE id = ?");
            ps.setInt(1, category_id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
