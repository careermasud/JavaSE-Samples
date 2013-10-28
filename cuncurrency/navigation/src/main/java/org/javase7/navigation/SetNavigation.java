package org.javase7.navigation;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class SetNavigation 
{
    public static void main( String[] args ){
        String[] values={"3","4","89","23","54","67","12","4","9"};
//        NavigableSet<Integer> integers=new TreeSet<Integer>();
//        integers.addAll(Arrays.asList(values));
//        System.out.println(integers.floor(70));
        NavigableSet<String> integers=new TreeSet<>();
        integers.addAll(Arrays.asList(values));
        System.out.println(integers.floor("7"));
    }
}
