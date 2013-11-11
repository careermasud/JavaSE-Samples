package org.javase7.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Masudul Haque
 */
public class JDBCConnector {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "");
            System.out.println("Connection Successful");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCConnector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
