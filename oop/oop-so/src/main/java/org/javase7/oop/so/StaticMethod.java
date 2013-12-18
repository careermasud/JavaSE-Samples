package org.javase7.oop.so;

/**
 * http://stackoverflow.com/questions/20649322/why-doesnt-calling-a-static-variable-chained-from-a-static-method-that-returns
 * @author Masud
 */
public class StaticMethod {

    static String mountain = "Everest";

    static StaticMethod favorite() {
        System.out.print("Mount ");
        return null;
    }

    public static void main(String[] args) {
        System.out.println(favorite().mountain);
    }
}
