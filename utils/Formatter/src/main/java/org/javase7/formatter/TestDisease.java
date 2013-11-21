package org.javase7.formatter;

/**
 *
 * @author Masudul Haque
 */
import java.util.Random;

public class TestDisease {

    public static void main(String[] args) {
        Random r = new Random();
        
        char[] arr={'A','B','C','D'};

        for (int i = 0; i < 12; i++) {
           int index =  r.nextInt(4);
            System.out.print(arr[index]);
        }

    }
}
