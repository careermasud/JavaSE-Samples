
package org.javase7.sample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Masudul Haque
 */
public class PrintRes {
    public static void main(String[] args) throws SQLException {
        Connection con=JDBCConnector.getConnection();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from book");
        ResultSetMetaData meta = rs.getMetaData();
        int colNum=meta.getColumnCount();
        for (int i = 1; i <=colNum; i++) {
            System.out.print("  "+meta.getColumnName(i));
            
        }
        System.out.println("");
    }
}
