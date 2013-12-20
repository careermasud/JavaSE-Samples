package org.javase7.mapapp;

import java.util.Hashtable;

/**
 *
 * @author Masud
 */
public class HashTableApp {

    public static void main(String[] args) {
        Hashtable<String, Integer> numbers
                = new Hashtable<String, Integer>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        System.out.println(numbers);
    }
}
