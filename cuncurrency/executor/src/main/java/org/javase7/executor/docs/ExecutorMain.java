/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javase7.executor.docs;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author Masud
 */
public class ExecutorMain {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ScheduledThreadPoolExecutor scheduledExecutorService = new ScheduledThreadPoolExecutor(2);
        scheduledExecutorService.scheduleAtFixedRate(new ShortTask(2), 0, 3, TimeUnit.SECONDS);
        final ScheduledFuture<?> longTaskHandler = scheduledExecutorService.scheduleAtFixedRate(new LongTask(1), 0, 10, TimeUnit.SECONDS);

        scheduledExecutorService.schedule(new Runnable() {
            public void run() {
                longTaskHandler.cancel(true);
                // This will cancel your task after 5 sec.
            }
        }, 20, TimeUnit.SECONDS);

    }
}

class ShortTask implements Runnable {

    private int id;

    ShortTask(int id) {
        this.id = id;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Short Task with id " + id + " executed by " + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LongTask implements Runnable {

    private int id;

    LongTask(int id) {
        this.id = id;
    }

    public void run() {
        try {
            Thread.sleep(60000);
            System.out.println("Long Task with id " + id + " executed by " + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
