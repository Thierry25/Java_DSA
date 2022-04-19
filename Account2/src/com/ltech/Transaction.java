package com.ltech;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type;

    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }

    @Override
    public String toString(){
        return String.format("""
                Type is %s, Amount is %4.3f, Balance is %4.3f
                =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                Final description:
                 %s""",this.type, this.amount, this.balance, this.description);
    }

}
