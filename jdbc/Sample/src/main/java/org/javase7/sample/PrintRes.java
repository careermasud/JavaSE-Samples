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
        Connection con = JDBCConnector.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from book");
        ResultSetMetaData meta = rs.getMetaData();
        int colNum = meta.getColumnCount();
        for (int i = 1; i <= colNum; i++) {
            System.out.print("  " + meta.getColumnName(i));
//            System.out.print("  " + meta.getColumnType(i));
            
        }
        System.out.println();
//        rs.last();
//        rs.beforeFirst();
        Object arr[]=new Object[10];
        while (rs.next()) {
           for(int j=1;j<colNum;j++)
            arr[j-1]=rs.getObject(j);
        }
        System.out.println("");
    }
}
