package org.javase7.collectionsapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        List<String> cdList = new ArrayList<String>();
        Collections.addAll(cdList, "ExampleA", "ExampleB", "ExampleC", "ExampleD");
        
    }
}
