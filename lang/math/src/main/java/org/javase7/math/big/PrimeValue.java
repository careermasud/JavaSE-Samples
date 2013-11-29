
package org.javase7.math.big;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author Masudul Haque
 */
public class PrimeValue {
    public static void main(String[] args) {
        BigInteger rand=BigInteger.probablePrime(13, new Random());
        System.out.println(rand);
    }
}
