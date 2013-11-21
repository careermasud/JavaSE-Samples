package org.javase7.collectionsapp;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Date d = new Date();
        d.setMonth(11);
        d.setDate(25);
        d.setYear(1013);
        
        System.out.println(d);

    }
}
