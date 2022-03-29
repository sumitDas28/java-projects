package com.github.sumitdas28.designpatterns.structural.adapter;

public class StockMarketDataAdapter implements CSVParser{

    private StockMarketDataParser stockMarketDataParser;

    public StockMarketDataAdapter(StockMarketDataParser stockMarketDataParser) {
        this.stockMarketDataParser = stockMarketDataParser;
    }

    @Override
    public void parseCSVData() {
        this.stockMarketDataParser.parseXMLData();
    }
}
