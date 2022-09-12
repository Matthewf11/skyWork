package com.matthew.bank;

public class Main {
    public static void main(String[] args) {
        Person Bob = new Employee("Bob","Fisher","Earth",75,5,4);
        Customer Sarah = new Customer("Sarah","Stone","Earth",54,1201);

        CurrentAccount anAcc = new CurrentAccount(3333);
        Sarah.getCustomerID();
        SavingsAccount newAcc = new SavingsAccount(1234);
        System.out.println(newAcc.caculateInterest());
        //System.out.println(newAcc.toString());
        Bob.setFirstName("Bob");
        //System.out.println(Bob.toString());
        /*
        double [] array = new double[3];
        array[0] = 3;
        array[1] = 4;
        array[2] = 2;

        for(int i =0;i< array.length;i++){
            System.out.println("the value at index " + i + " in the array is "+ array[i]);
        }
        */
    }
}
