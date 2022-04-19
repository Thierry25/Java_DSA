package com.ltech;

public class Stock {
    private final String symbol;
    private final String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return (this.currentPrice - this.previousClosingPrice) / 100;
    }
}
