package org.javase7.so.lookahead;

/**
 *
 * @author Masudul Haque
 */
public class SplitNumStr {

    public static void main(String[] args) {
        String s = "100.26 gallon 12";
//       String[] arr=s.split("(?i)(?=kg)");
        String[] arr = s.split("(?i)(?<=\\d)(?=[a-z ])|(?<=[a-z ])(?=\\d)");
        for (String st : arr) {
            System.out.println(st);
        }
    }
}
