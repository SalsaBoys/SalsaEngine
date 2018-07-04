package salsaboy.ludo.misc;

import java.util.concurrent.TimeUnit;

public class Timer {
    /**
     * Yes Max, it is supposed to stop the thread
     * @param milliseconds How long to stop the thread.
     */
    public Timer(long milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Unable to time");
        }
    }
}
