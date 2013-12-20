
package org.javase7.so.hv;

import java.util.regex.Pattern;

/**
 *
 * @author Masudul Haque
 */
public class QuoteApp {
    public static void main(String[] args) {
        String res=Pattern.quote("$5");
        System.out.println(res);
    }
}
