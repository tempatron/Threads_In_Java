package com.tempatron;
import static com.tempatron.ThreadColour.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED +"Hello from MyRunnable's implementation of run()");
    }
}
