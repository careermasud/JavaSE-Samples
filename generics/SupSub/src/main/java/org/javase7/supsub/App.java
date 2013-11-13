package org.javase7.supsub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
     String input="some@domain.com";
     String[] temp= input.split("(?=[@.])|(?<=[@.])");
     String[] str= input.split("(?=[@.])|(?<=[@.])");
     String[] str1= input.split("(?=[@.])");//look behind
     String[] str2= input.split("(?<=[@.])");//look ahead
        for (String string : temp) {
            System.out.println(string);
        }
     
       
    }
    
    static void takeParams(Object... params) {
        for (Object string : params) {
            System.out.println(string);
        }
    }
}
