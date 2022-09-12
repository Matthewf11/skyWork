package com.matthew.bank;
import java.util.Scanner;
public class CurrentAccount implements Accounts {
    private int pin;
    private int accountNumber;

    private int balance =1000;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public String toString() {
        return "com.matthew.bank.CurrentAccount{" +
                "pin=" + pin + '}';
    }
    public CurrentAccount(int pin) {
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

    public int getBalance(){
        return balance;
    }
}
