package com.alexius;

public class Main {

    public static void main(String[] args) {
        // Creating an object of type `Car`
        Car porsche = new Car();
        Car holden = new Car();

        // Calling method
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());

        // BankAccount example
        BankAccount maxwell = new BankAccount(
            "123",
            1000,
            "Maxwell",
            "example@email.com",
            "123456789"
        );
        maxwell.deposit(1000);
        maxwell.withdraw(10000);
        maxwell.withdraw(500);
    }
}
