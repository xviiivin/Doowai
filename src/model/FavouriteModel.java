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
public class FavouriteModel {

    private static Connection conn;

    private int id;
    private int iduser;
    private int idcartoon;

    public FavouriteModel() {
    }

    public FavouriteModel(int id, int iduser, int idcartoon) {
        this.id = id;
        this.iduser = iduser;
        this.idcartoon = idcartoon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdcartoon() {
        return idcartoon;
    }

    public void setIdcartoon(int idcartoon) {
        this.idcartoon = idcartoon;
    }

    public static FavouriteModel findWithId(int id) {
        conn = Sqlite.getConnection();
        FavouriteModel users = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM favourite WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users = new FavouriteModel();
                users.setId(rs.getInt("id"));
                users.setIduser(rs.getInt("iduser"));
                users.setIdcartoon(rs.getInt("idcartoon"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public static FavouriteModel findWithIdUserAndIdCartoon(int iduser, int idcartoon) {
        conn = Sqlite.getConnection();
        FavouriteModel users = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM favourite WHERE iduser = ? AND idcartoon = ?");
            ps.setInt(1, iduser);
            ps.setInt(2, idcartoon);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users = new FavouriteModel();
                users.setId(rs.getInt("id"));
                users.setIduser(rs.getInt("iduser"));
                users.setIdcartoon(rs.getInt("idcartoon"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public static List<FavouriteModel> all() {
        conn = Sqlite.getConnection();
        List<FavouriteModel> users = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM favourite");
            while (rs.next()) {
                FavouriteModel user = new FavouriteModel();
                user.setId(rs.getInt("id"));
                user.setIduser(rs.getInt("iduser"));
                user.setIdcartoon(rs.getInt("idcartoon"));
                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public static List<CartoonModel> search(int iduser, String keyword) {
        conn = Sqlite.getConnection();
        List<CartoonModel> users = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement("SELECT cartoon.id, cartoon.name, cartoon.detail, cartoon.idcategory, cartoon.img FROM favourite INNER JOIN cartoon ON cartoon.id = favourite.idcartoon WHERE iduser = ? AND cartoon.name LIKE ?");
            ps.setInt(1, iduser);
            ps.setString(2, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CartoonModel user = new CartoonModel();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setDetail(rs.getString("detail"));
                user.setImg(rs.getString("img"));
                user.setIdcategory(rs.getInt("idcategory"));
                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public Boolean create(int iduser, int idcartoon) {
        conn = Sqlite.getConnection();
        try {
            java.util.Date date = new java.util.Date();
            long test = date.getTime();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO favourite (iduser, idcartoon, date) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, iduser);
            ps.setInt(2, idcartoon);
            ps.setLong(3, test);
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

    public static boolean delete(int iduser, int idcartoon) {
        conn = Sqlite.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM favourite WHERE iduser = ? AND idcartoon = ?");
            ps.setInt(1, iduser);
            ps.setInt(2, idcartoon);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
