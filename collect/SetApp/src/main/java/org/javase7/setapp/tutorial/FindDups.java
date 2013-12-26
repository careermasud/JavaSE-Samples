package org.javase7.setapp.tutorial;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Masud
 */
public class FindDups {
    public static void main(String[] args) {
        String[] arr="i came i saw i left".split(" ");
        Set<String> set=new HashSet<>();
        for (String e : arr) {
            if(!set.add(e)){
                System.out.println("Duplicate detected : "+e);
            }
        }
        System.out.println("Distinct word : "+set);
    }
}
