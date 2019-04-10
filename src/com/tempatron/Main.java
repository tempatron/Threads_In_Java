package com.tempatron;

import static com.tempatron.ThreadColour.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE+ "Hello from Main Thread! 1");


        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();


        //Anonymous InnerClass //
        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello from anonymous class thread");
            }
        }.start();

        //other way
//        Thread t = new Thread(){
//            public void run(){
//                System.out.println("Hello from anonymous class thread");
//            }
//        };t.start();




        Thread myRunnableThread = new Thread(new MyRunnable());  //created thread here
        myRunnableThread.start();


        //anonymous runnable class
        //Thread myRunnableThread =  new Thread(new MyRunnable(){};.myRunnableThread.start();
        new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED+"Hello from the anonymous class implementation of run!");
            }
        }).start();


        System.out.println(ANSI_PURPLE +"Hello again from the main thread 2 ");





    }



}
