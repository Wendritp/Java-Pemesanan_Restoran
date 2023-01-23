/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi_Sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Perindo Perjuangan
 */
public class koneksi {
    private final String url="jdbc:mysql://localhost/db_pemesanan_restoran";
    private final String username_xampp = "root";
    private final String password_xampp = "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }
    
    
}
