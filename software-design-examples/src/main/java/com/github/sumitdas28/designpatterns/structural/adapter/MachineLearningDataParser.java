package com.github.sumitdas28.designpatterns.structural.adapter;

public class MachineLearningDataParser implements CSVParser{
    @Override
    public void parseCSVData() {
        System.out.println("Parsing Machine Learning data in CSV format");
    }
}
