package org.javase7.so;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Masudul Haque
 */
public class UTFLowerCase {

    public static void main(String[] args) {
        String input = "@dsaöäå007878-_";
        Matcher m = Pattern.compile("^[#@][\\p{javaLowerCase}\\d_-]{2,14}$").matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
