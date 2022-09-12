package com.matthew.bank;

import java.util.Scanner;

public class SavingsAccount implements Accounts{
    private int pin;
    private static double interest = 0.1;
    private int balance=1000;
    private int accountNumber;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public SavingsAccount(int pin, double interest, int balance, int accountNumber) {
        this.pin = pin;
        this.interest = interest;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "com.matthew.bank.SavingsAccount{" +
                "pin=" + pin +
                '}';
    }
    public SavingsAccount(int pin) {
        this.pin = pin;
    }
    public int getPin(){
        return pin;
    }

    public void editPin(int newPin){
        this.pin = newPin;
    }
    public void createPin(int pin){
        this.pin = pin;
    }
    public void withdraw(){
        //enter and check pin
        System.out.println("enter pin");
        Scanner scan = new Scanner(System.in);
        int testPin = scan.nextInt();
        while(testPin != pin){
            System.out.println("wrong pin");
            testPin = scan.nextInt();
        }
        int amount = 0;
        System.out.println("enter amount to withdraw");
        amount = scan.nextInt();
        while(amount>balance){
            System.out.println("not enough money");
            amount = scan.nextInt();
        }
        System.out.println("success");
        System.out.println("printing money...");
    }
    public boolean deposit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter amount to deposit");
        int deposit = scan.nextInt();
        while(deposit <0){
            System.out.println("enter a positive amount");
            deposit = scan.nextInt();
        }
        balance += deposit;
        System.out.print("success");
        return true;
    }
    public double caculateInterest(){
        return balance + balance*interest;
    }
    public int getBalance(){
        return balance;
    }
}
