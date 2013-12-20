package org.javase7.so;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        String str = "\"\n\""; // should be print "\n" in console 
        System.out.println(str.replace("\"\\n\"","\"\"")); //prints ""
    }
}
