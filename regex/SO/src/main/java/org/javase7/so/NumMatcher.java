package org.javase7.so;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Masudul Haque
 */
public class NumMatcher {

    public static void main(String[] args) throws Exception {
        // the values
        char[] x = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        List<Integer> num = new ArrayList<>();
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // shortcut
        
        // enter the number
        while (true) {
            System.out.println("Please enter a number: ");
            String a = br.readLine();
            Pattern numPat=Pattern.compile("[0-9]");
            Matcher matcher=numPat.matcher(a);
            
            if (!matcher.find()) {
                System.err.println("Error! Please type a number: ");
                break;
            } else if (a.toLowerCase().equals("end")) {
                break;
            }
        }
    }
}
