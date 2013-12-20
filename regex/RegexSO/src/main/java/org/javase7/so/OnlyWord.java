package org.javase7.so;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Masudul Haque
 */
public class OnlyWord {

    public static void main(String[] args) {
        String temp = "74 4F 4C 4F 49 65  brown fox jump over the fence";
        List<String> arr = new ArrayList<String>();
//        Pattern p = Pattern.compile("(?i)(?:^|\\s+)([a-z]+)");
        Pattern p = Pattern.compile("\\b[A-Za-z]+\\b");
        Matcher m = p.matcher(temp);
        while (m.find()) {
            arr.add(m.group());
        }

        // convert to String[]
        String[] word = arr.toArray(new String[0]);
        System.out.println(Arrays.toString(word));
    }
}
