package com.ltech;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private String name;
    private final ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(){}

    public Account(int id, double initialBalance, String name){
        this.id = id;
        this.balance = initialBalance;
        this.name = name;
        this.dateCreated = new Date();
    }

    public void withdraw(double amount){
        if(amount > this.balance) System.out.println("You know you ain't got that much money #EMOTIONAL_DAMAGE😅");
        else{
            this.balance -= Math.abs(amount);
            System.out.printf("Your new balance is now %4.3f\n", this.balance);
            transactions.add(new Transaction('W', amount, this.balance, "Withdrawal of " + amount+ "$"));
        }
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.printf("Your new balance is now %4.3f\n", this.balance);
        transactions.add(new Transaction('D', amount, this.balance, "Deposit of " + amount+ "$"));
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
