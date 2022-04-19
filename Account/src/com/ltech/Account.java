package com.ltech;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account(){}

    public Account(int id, double initialBalance){
        this.id = id;
        this.balance = initialBalance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount){
        if(amount > this.balance) {
            System.out.printf("Insufficient funds for this transaction\nBalance is %4.2f\n", this.balance);
        }else{
            this.balance -= amount;
            System.out.printf("The new balance is %4.2f\n", this.balance);
        }
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Bro, That's not possible and I know you know that");
        }else{
            this.balance += amount;
            System.out.printf("New balance is %4.2f ", this.balance);
        }
    }

    public double getMonthlyInterest(){
        return this.balance * getMonthlyInterestRate();
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate / 100) / 12;
    }
}
