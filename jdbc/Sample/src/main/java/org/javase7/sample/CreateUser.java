/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javase7.sample;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Masud
 */
public class CreateUser {
    public static void main(String[] args) throws SQLException {
        Connection con=JDBCConnector.getConnection();
        Statement stmt = con.createStatement();
        String cu = "create user hasan2 identified by 12345;";
        int res=stmt.executeUpdate(cu);
        System.out.println("success");
    }
}
