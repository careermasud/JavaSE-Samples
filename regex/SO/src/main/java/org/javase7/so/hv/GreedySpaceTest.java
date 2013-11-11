
package org.javase7.so.hv;

/**
 *
 * @author Masudul Haque
 */
public class GreedySpaceTest {
    public static void main(String[] args) {
        String sample="I  live in  Bangladesh";
        String[] out=sample.split(" {2}");
        for (String string : out) {
            System.out.println(string); 
        }
    }
}
