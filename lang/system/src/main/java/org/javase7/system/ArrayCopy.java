
package org.javase7.system;

/**
 *
 * @author Masudul Haque
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] source={4,5,6,7,1,3,5,6,6,99,44};
        int[] dest=new int[5];
        System.arraycopy(source, 0, dest, 0, 5);
        
        for (int i : dest) {            
        System.out.println(i);
        }
    }
}
