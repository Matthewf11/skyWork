package com.matthew.bank;

public interface Accounts {

    public int getAccountNumber();
    public void setAccountNumber(int accountNumber);
    public int getPin();
    public void withdraw();
    public boolean deposit();
    public void createPin(int pin);
    public void editPin(int newPin);
}

