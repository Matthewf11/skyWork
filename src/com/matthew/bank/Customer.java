package com.matthew.bank;

public class Customer extends Person{
    int CustomerID;
    private int accountNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer(String firstName, String lastName, String address, int age, int customerID) {
        super(firstName, lastName, address, age);
        CustomerID = customerID;
    }

    @Override
    public String toString() {
        return "com.matthew.bank.Customer{" +
                "CustomerID=" + CustomerID +
                '}';
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }
}
