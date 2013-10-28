package org.javase7.bits;

import java.util.BitSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         BitSet bits1 = new BitSet();
         BitSet bits2 = new BitSet();
         bits1.set(0);
         bits2.set(6);
         bits2.and(bits1);
//         System.out.println(BitSet);
    }
}
