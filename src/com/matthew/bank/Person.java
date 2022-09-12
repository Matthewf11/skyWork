package com.matthew.bank;

public abstract class Person {
    private String firstName;
    private String lastName;

    private String Address;
    private int age;

    public Person(String firstName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        Address = address;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "com.matthew.bank.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Address='" + Address + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
