package org.javase7.setapp.tutorial;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Masud
 */
public class FindDups2 {

    public static void main(String[] args) {
        String[] arr = "i came i saw i left".split(" ");
        Set<String> unique = new HashSet<>();
        Set<String> dup = new HashSet<>();
        for (String e : arr) {
            if (!unique.add(e)) {
                dup.add(e);
            }
        }
        unique.removeAll(dup);
        System.out.println("Unique word : " + unique);
        System.out.println("Duplicate word : " + dup);
    }
}
