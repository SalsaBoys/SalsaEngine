package salsaboy.ludo.misc;

import java.util.concurrent.TimeUnit;

public class Timer {
    public Timer(long milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Unable to time");
        }
    }
}
