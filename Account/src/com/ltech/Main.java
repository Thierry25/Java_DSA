package com.ltech;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        Account[] accounts = new Account[10];
//        Account thierryAccount = new Account(1122, 20_000);
//        thierryAccount.setAnnualInterestRate(4.5);
//
//        thierryAccount.withdraw(25_000);
//        thierryAccount.withdraw(2_500);
//        thierryAccount.deposit(-123);
//        thierryAccount.deposit(3_000);
//
//        System.out.printf("Your balance is %4.2f\n",thierryAccount.getBalance());
//        System.out.printf("Your monthly interest is is %4.2f\n",thierryAccount.getMonthlyInterest());
//        System.out.printf("Your account was created on %s",thierryAccount.getDateCreated());
        for (int i = 0; i < 10; i++) {
            Account account = new Account(i, 100);
            accounts[i] = account;
        }

        while (true) {
            System.out.print("Enter and id : ");
            int id = input.nextInt();
            while (id < 0 || id > 9) {
                System.out.print("Enter and id : ");
                id = input.nextInt();
            }
            Account currentAccount = accounts[id];
            showMenu();

            int code = input.nextInt();
            while (code != 4) {
                makeOperation(currentAccount, code);
                System.out.println();
                showMenu();
                code = input.nextInt();
            }
            System.out.println("My pleasure to serve you!");
        }


    }

    public static void showMenu() {
        System.out.println("Main menu\n1: Check Balance\n2: Withdraw\n3: Deposit\n4:Exit");
        System.out.print("Enter a choice: ");

    }

    public static void makeOperation(Account account, int code) {
        switch (code) {
            case 1 -> System.out.printf("The balance is %4.2f\n", account.getBalance());
            case 2 -> withdrawMoney(account);
            case 3 -> depositMoney(account);
            default -> System.out.println("Invalid code you dumb mf");
        }
    }

    public static void withdrawMoney(Account account) {
        System.out.print("Enter amount to withdraw: ");
        double amount = input.nextDouble();
        account.withdraw(amount);
    }

    public static void depositMoney(Account account) {
        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        account.deposit(amount);
    }
}
