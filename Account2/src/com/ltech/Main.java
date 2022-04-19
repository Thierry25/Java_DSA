package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account thierryMarcelin = new Account(7, 90.0, "Thierry");
        thierryMarcelin.withdraw(120);
        thierryMarcelin.withdraw(150);
        thierryMarcelin.withdraw(89.8);
        thierryMarcelin.deposit(978);
        thierryMarcelin.deposit(89_000);
        thierryMarcelin.withdraw(90_000);
        thierryMarcelin.deposit(560);
        System.out.println(thierryMarcelin.getTransactions());
    }
}
