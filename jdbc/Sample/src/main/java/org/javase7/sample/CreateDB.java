package org.javase7.sample;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Masudul Haque
 */
public class CreateDB {

     public static void main(String[] args) throws SQLException {
        Connection con = JDBCConnector.getConnection();
        Statement statement = con.createStatement();
        String hrappSQL = "CREATE DATABASE college";
        statement.executeUpdate(hrappSQL);
    }
}
