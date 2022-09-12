package com.matthew.bank;

public class Employee extends Person{
    private int EmployeeID;
    private int salary;
    static {
        numOfEmployees =1231;
    }
    private static int numOfEmployees;

    public static int getNumOfEmployees() {
        return numOfEmployees;
    }

    public static void setNumOfEmployees(int numOfEmployees) {
        Employee.numOfEmployees = numOfEmployees;
    }

    @Override
    public String toString() {
        return "com.matthew.bank.Employee{" +
                "EmployeeID=" + EmployeeID +
                ", salary=" + salary + " First Name=" + this.getFirstName() +
                '}';
    }

    public Employee(String firstName, String lastName, String address, int age, int employeeID, int salary) {
        super(firstName, lastName, address, age);
        this.EmployeeID = employeeID;
        this.salary = salary;
    }

    public int getEmployeeID() {

        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
