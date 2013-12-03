package org.javase7.executor.docs;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 *
 * @author Masudul Haque
 */
public class BeeperControl {

    private final ScheduledExecutorService scheduler
            = Executors.newScheduledThreadPool(1);

    public void beepForAnHour() {
        final Runnable beeper = new Runnable() {
            public void run() {
                System.out.println("beep");
            }
        };
//        final ScheduledFuture<?> beeperHandle= scheduler.scheduleAtFixedRate(beeper, 5, 5, SECONDS);
        final ScheduledFuture<?> beeperHandle= scheduler.scheduleWithFixedDelay(beeper, 5, 5, SECONDS);
        
        scheduler.schedule(new Runnable() {
            public void run() {
                System.out.println("Cancell is called");
                beeperHandle.cancel(true);
            }
        }, 60*60, SECONDS);
    }

}
