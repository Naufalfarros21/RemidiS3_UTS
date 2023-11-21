/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perbaikan_uts;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class koneksi {
    public static Connection sambungkeDB () {
        try {
            MysqlDataSource resource = new MysqlDataSource();
            resource.setUser("root");
            resource.setPassword("");
            resource.setDatabaseName("mahasiswa");
            resource.setPortNumber(3306);
            resource.setServerName("localhost");
            resource.setServerTimezone("Asia/Jakarta");
            Connection con = resource.getConnection();
            return con;
        } catch (SQLException e) {
            System.err.println( e.getMessage());
        }
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
