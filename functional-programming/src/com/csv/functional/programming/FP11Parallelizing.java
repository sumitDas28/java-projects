package com.csv.functional.programming;

import java.util.stream.LongStream;

public class FP11Parallelizing {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(LongStream.rangeClosed(0, 1000000000).sum());
        System.out.println("Elapsed Time Without Parallelize:"+  Long.valueOf(System.currentTimeMillis()-startTime));

        long parallelizeStartTime = System.currentTimeMillis();
        System.out.println(LongStream.rangeClosed(0, 1000000000).parallel().sum());
        System.out.println("Elapsed Time With Parallelize:"+  Long.valueOf(System.currentTimeMillis()-parallelizeStartTime));

    }
}
