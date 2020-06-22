package com.alexius;

public class BankAccount {

    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    // Creating constructor function
    public BankAccount(
        String number,
        double balance,
        String name,
        String email,
        String phone
    ) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Constructor function can be overloaded
    public BankAccount() {
        // Calling another constructor function
        this("12345", 0, "default name", "default email", "default phone");
        System.out.println("Default BankAccount created");
    }

    public BankAccount(String name, String email, String phone) {
        this("12345", 0, name, email, phone);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Remaining balance: " + this.balance);
        } else {
            System.out.println("Not enough balance, remaining balance: " + this.balance);
        }
    }

}
