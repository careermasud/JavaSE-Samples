package org.javase7.queueapp;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Queue<Integer> integers=new PriorityQueue<>();
        integers.add(12);
        integers.add(32);
        integers.add(45);
        integers.add(22);
        integers.add(22);
        integers.add(22);
        integers.add(9);
        integers.add(99);
        integers.add(4);
        int size=integers.size();
        for (int i = 0; i <size ; i++) {
            System.out.println(integers.poll());
            
        }        
    }
}
