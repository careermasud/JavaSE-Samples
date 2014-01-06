package org.javase7.genericstutorial.gilardbarcha;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Masud
 */
public class Test {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>(); // 1
//        List<Object> lo = ls; // 2 
    }

    void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }

    }

    static <T> void  fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // compile-time error
        }
    }
}
