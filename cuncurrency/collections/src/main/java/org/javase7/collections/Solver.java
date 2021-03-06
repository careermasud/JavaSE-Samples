///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package org.javase7.collections;
//
//import java.util.concurrent.BrokenBarrierException;
//import java.util.concurrent.CyclicBarrier;
//
///**
// *
// * @author Masudul Haque
// */
//public class Solver {
//
//    final int N;
//    final float[][] data;
//    final CyclicBarrier barrier;
//
//    class Worker implements Runnable {
//
//        int myRow;
//
//        Worker(int row) {
//            myRow = row;
//        }
//
//        public void run() {
//            while (!done()) {
//                processRow(myRow);
//
//                try {
//                    barrier.await();
//                } catch (InterruptedException ex) {
//                    return;
//                } catch (BrokenBarrierException ex) {
//                    return;
//                }
//            }
//        }
//    }
//
//    public Solver(float[][] matrix) {
//        data = matrix;
//        N = matrix.length;
//        barrier = new CyclicBarrier(N,
//                new Runnable() {
//                    public void run() {
//                        mergeRows();
//                                   }
//                                 });
//     for (int i = 0; i < N; ++i) {
//            new Thread(new Worker(i)).start();
//        }
//
//        waitUntilDone();
//    }
//}
