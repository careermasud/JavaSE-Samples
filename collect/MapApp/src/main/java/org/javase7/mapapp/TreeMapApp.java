/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javase7.mapapp;

import java.util.Calendar;

/**
 *
 * @author Masud
 */
public class TreeMapApp {

    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        Calendar expires = Calendar.getInstance();
        expires.set(2013, 11, 15, 0, 0);
       
        if (today.after(expires)) {
            System.exit(0);
            System.out.println("true");
        }
    }
}
