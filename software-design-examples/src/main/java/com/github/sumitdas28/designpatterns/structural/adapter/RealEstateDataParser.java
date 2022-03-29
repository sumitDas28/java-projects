package com.github.sumitdas28.designpatterns.structural.adapter;

public class RealEstateDataParser implements CSVParser{
    @Override
    public void parseCSVData() {
        System.out.println("Parsing Real Estate data in CSV format");
    }
}
