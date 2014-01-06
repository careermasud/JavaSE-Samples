package org.javase7.effectivejava;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class EnumSortComparable 
{
    public static void main( String[] args )
    {
        Day[] dayArr=Day.values();
        Arrays.sort(dayArr);
        for (Day day : dayArr) {
            System.out.println(day);
        }
    }
}
