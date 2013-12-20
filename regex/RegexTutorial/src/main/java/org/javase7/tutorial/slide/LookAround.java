package org.javase7.tutorial.slide;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Masud
 */
public class LookAround {

    public static void main(String[] args) {
        String input = "I catch the housecat 'Tom-cat' with catnip";
//        String regex = "cat(?=\\s+)";//Positive look-ahead 17-20 index
//        String regex = "cat(?!\\s+)";//Negative look-ahead 2-5, 26-29, 36-39
//        String regex = "(?<=\\s)cat";//Positive look-behind 2-5, 36-39
//        String regex = "(?<!\\s)cat";//Negative look-behind 17-20, 26-29
//        String regex = "(?<=\\s)cat(?=\\s)";//Isolating cat
        String regex = "\\bcat\\b";//Non-word boundary
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(input);
        boolean found = false;
        while (matcher.find()) {
            System.out.printf("I found the text"
                    + " \"%s\" starting at "
                    + "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
            found = true;
        }
        if (!found) {
            System.out.printf("No match found.%n");
        }
    }
}
