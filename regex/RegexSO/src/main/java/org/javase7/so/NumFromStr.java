package org.javase7.so;

/**
 *
 * @author Masudul Haque
 */
public class NumFromStr {

    public static void main(String[] args) {
        String numStr = "1234";
        String[] num = numStr.split("(?!^)");
        for (String n : num) {
            System.out.print(n + ", ");
        }
        System.out.println();
    }
}
