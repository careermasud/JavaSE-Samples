/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javase7.bits;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.BitSet;

/**
 *
 * @author Masudul Haque
 */
public class Scratch {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BitSet bits1 = fromString("1000001");
        BitSet bits2 = fromString("1111111");

        System.out.println(toString(bits1)); // prints 1000001
        System.out.println(toString(bits2)); // prints 1111111

        bits2.and(bits1);

        System.out.println(toString(bits2)); // prints 1000001
    }

    private static BitSet fromString(final String s) {
        return BitSet.valueOf(new long[] { Long.parseLong(s, 2) });
    }

    private static String toString(BitSet bs) {
        return Long.toString(bs.toLongArray()[0], 2);
    }
}
