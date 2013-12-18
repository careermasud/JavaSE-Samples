
package org.javase7.tutorial;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Masudul Haque
 */
public class RegexTestHarness {
     public static void main(String[] args) {
//         Console console = System.console();
//        if (console == null) {
//            System.err.println("No console.");
//            System.exit(1);
//        }
         Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter your regex: ");
            Pattern pattern = Pattern.compile(sc.nextLine());// Takes the regex
            System.out.println("Enter input string to search: ");
            Matcher matcher = pattern.matcher(sc.nextLine());// Takes the input string

            boolean found = false;
            while (matcher.find()) {
                System.out.printf("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                System.out.printf("No match found.%n");
            }
        }
    }
}
