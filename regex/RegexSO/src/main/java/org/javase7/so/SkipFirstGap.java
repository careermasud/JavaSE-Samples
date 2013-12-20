package org.javase7.so;

/**
 *
 * @author Masudul Haque
 */
public class SkipFirstGap {

    public static void main(String[] args) {
        String string = "My name is the mighty llama";
        String[] stringArray = string.split("(?<!\\G\\S+)\\s");
        for (String string1 : stringArray) {
            System.out.println(string1);
        }
    }
}
