package org.javase7.so.hv;

/**
 *
 * @author Masudul Haque
 */
public class DigitMatch {

    public static void main(String[] args) {
        String regex = "^(\\d{1}){2}$"; // ^$ to make those not familiar with 'matches' happy
        System.out.println("1".matches(regex)); // true
        System.out.println("12".matches(regex)); // false
    }
}
