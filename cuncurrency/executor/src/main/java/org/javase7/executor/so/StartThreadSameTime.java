/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javase7.executor.so;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author Masudul Haque
 */
public class StartThreadSameTime {
    public static void main(String[] args) {
    final CountDownLatch start = new CountDownLatch(2);
    final CountDownLatch end = new CountDownLatch(2);
    final List<String> list=new CopyOnWriteArrayList<String>();
    Runnable r1 = new Runnable() {
        @Override
        public void run() {
            try {
                start.countDown();
                start.await();
                System.out.println("In 1");
//                for (int i = 0; i < 10; i++) {                    
//                list.add("In1");
//                }
                end.countDown();
                end.await();
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt(); //restore interruption status
            }
        }
    };
    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            try {
                start.countDown();
                start.await();
                System.out.println("In 2");
//                for (int i = 0; i < 100; i++) {                    
//                list.add("In2");
//                }
                end.countDown();
                end.await();
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt(); //restore interruption status
            }
        }
    };
        Executor e=Executors.newCachedThreadPool();
        e.execute(r1);
        e.execute(r2);
//     Thread t1=new Thread(r1);
//     Thread t2=new Thread(r2);
//     t1.start();
//     t2.start();
        System.out.println(list);
    }
} 
