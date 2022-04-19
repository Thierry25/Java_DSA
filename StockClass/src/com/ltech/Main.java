package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stock stock = new Stock("ORCL", "Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);
        System.out.println(stock.getChangePercent());
    }
}
