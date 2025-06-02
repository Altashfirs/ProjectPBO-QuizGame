/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author altashfir
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost/db_gamequiz";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection(){
        try {
            System.out.println("Koneksi Berhasil");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getLocalizedMessage());
            return null;
        }
    }
}
