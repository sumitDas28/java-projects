package com.github.sumitdas28.designpatterns.structural.adapter;

public class App2 {

    public static void main(String[] args) {
        CSVParser mlParser = new MachineLearningDataParser();
        CSVParser reParser = new RealEstateDataParser();
        CSVParser smParser = new StockMarketDataAdapter(new StockMarketDataParser());

        mlParser.parseCSVData();
        reParser.parseCSVData();
        smParser.parseCSVData();
    }
}
