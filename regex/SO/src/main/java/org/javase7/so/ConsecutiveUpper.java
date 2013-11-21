package org.javase7.so;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Masudul Haque
 */
public class ConsecutiveUpper {

    public static void main(String[] args) {

        String temp = "Jp Morgan & Chase Corporation is under pressure";
        Pattern p = Pattern.compile("([A-Z]*(?=\\s[A-Z])(?:\\s[a-z]+)+)");
        Matcher m = p.matcher(temp);
        while (m.find()) {
            System.out.print(m.group() +" ");
        }
        System.out.println();

    }
}
