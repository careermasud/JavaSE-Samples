package org.javase7.effectivejava;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class EnumSortComparator 
{
    public static void main( String[] args )
    {
        Day[] dayArr=Day.values();
        Arrays.sort(dayArr, new Comparator<Day>() {

            @Override
            public int compare(Day o1, Day o2) {
               return o1.name().compareTo(o2.name());
            }
        });
        for (Day day : dayArr) {
            System.out.println(day);
        }
    }
}
