package org.javase7.adapter;

/**
 *
 * @author Masudul Haque
 */
public class Client {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{34, 2, 4, 12, 1};

        Sorter sorter = new SortListAdapter();
        numbers=sorter.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
