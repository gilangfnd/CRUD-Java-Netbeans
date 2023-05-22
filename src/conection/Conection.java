/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gilang
 */
public class Conection {

    private static Connection sqlserverconfig;

    public static Connection configDB() throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=library";
        String username = "sa";
        String password = "12345";

        sqlserverconfig = DriverManager.getConnection(url, username, password);
        return sqlserverconfig;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Connection conn = Conection.configDB();
            // Gunakan objek Connection yang telah dibuat untuk menjalankan query atau operasi database lainnya
            System.out.println("Koneksi ke server berhasil");
        } catch (SQLException e) {
            // Tangani pengecualian jika koneksi gagal
            System.err.println("Koneksi tidak berhasil");
        }
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Connection Connection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
