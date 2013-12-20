package org.javase7.listapp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author Masud
 */
public class CopyOnWriteArrayListTest {

    public static void main(String[] args) {
        List<String> listA = new CopyOnWriteArrayList<>();
        listA.add("B");
        listA.add("C");
        listA.add("D");
        listA.add("C");

        for (String string : listA) {
            if (string.equals("C")) {
                listA.remove("C");
            }
        }
        System.out.println(listA);
    }
}
