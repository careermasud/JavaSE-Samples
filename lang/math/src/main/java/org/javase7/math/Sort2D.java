package org.javase7.math;

import java.util.Arrays;

/**
 *
 * @author Masudul Haque
 */
public class Sort2D {

    public static void main(String[] args) {
        Integer[][] theArray = {
            {35, 22, 42, 28, 20, 11},
            {35, 21, 14, 33, 1, 34}};
        for (Integer outer[] : theArray) {
            Arrays.sort(outer);
            for (Integer integer : outer) {
                System.out.print(" "+integer);
            }
            System.out.println("");
        }

    }
}
