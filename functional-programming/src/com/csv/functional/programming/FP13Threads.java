package com.csv.functional.programming;

import java.util.stream.IntStream;

public class FP13Threads {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000; i++){
                    System.out.println(Thread.currentThread().getId()+":"+i);
                }
            }
        };

        Thread t1 = new Thread(runnable1);
        t1.start();

        Thread t2 = new Thread(runnable1);
        t2.start();

        Thread t3 = new Thread(runnable1);
        t3.start();

        Runnable runnable2 = () -> {
            IntStream.range(0, 10000)
                    .forEach( i -> {
                                System.out.println("Functional Approach");
                                System.out.println(Thread.currentThread().getId()+":"+i);
                            });
            };

        Thread t4 = new Thread(runnable2);
        t4.start();
    }
}
