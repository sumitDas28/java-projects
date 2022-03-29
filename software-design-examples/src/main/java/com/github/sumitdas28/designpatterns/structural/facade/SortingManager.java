package com.github.sumitdas28.designpatterns.structural.facade;

public class SortingManager {
    private SortAlgorithm bubbleSort;
    private SortAlgorithm mergeSort;
    private SortAlgorithm quickSort;

    public SortingManager() {
        this.bubbleSort=new BubbleSort();
        this.mergeSort=new MergeSort();
        this.quickSort=new QuickSort();
    }

    public void doBubbleSort(){
        this.bubbleSort.sort();
    }

    public void doMergeSort(){
        this.mergeSort.sort();
    }

    public void doQuickSort(){
        this.quickSort.sort();
    }
}
