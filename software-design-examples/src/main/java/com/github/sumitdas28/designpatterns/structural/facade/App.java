package com.github.sumitdas28.designpatterns.structural.facade;

public class App {

    public static void main(String[] args) {
        SortingManager sortingManager = new SortingManager();
        sortingManager.doBubbleSort();
        sortingManager.doMergeSort();
        sortingManager.doQuickSort();
    }
}
