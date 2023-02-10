package Chapter7;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String name;
    private String accountNumber;
    private String pin;


    public BankAccount(double balance, String name, String accountNumber, String pin) {
        this.balance = balance;
        this.name = name;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }


    public void depositTest(double amount) {
        balance = balance + amount;

    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void makeWithdrawal(double amount) {
        if ((amount > 0) && (amount <= balance))
            balance = balance - amount;
    }

    public double makeTransfer(double amount) {
        if (amount <= balance) {
            balance = balance - amount;

            System.out.println(name + " your account has been debitted with : " + amount);
            System.out.println("your new account balance is : ");

            return balance;
        }
        return 0;


    }

    // public double DoTransfer(){
    //   return balance;
    // }
    public double getCredited(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(name + " your account has been credited with : " + amount);
            System.out.println("your new account balance is : ");}
                             return balance;
        }
    }

