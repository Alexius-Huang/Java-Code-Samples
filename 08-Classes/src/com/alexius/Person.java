package com.alexius;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String input) {
        this.firstName = input;
    }

    public void setLastName(String input) {
        this.lastName = input;
    }

    public void setAge(int input) {
        this.age = input > 100 || input < 0 ? 0 : input;
    }

    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }

    public String getFullName() {
        boolean firstNameEmpty = this.firstName.isEmpty();
        boolean lastNameEmpty = this.lastName.isEmpty();
        if (firstNameEmpty)
            return lastNameEmpty ? "" : this.lastName;
        else
            return lastNameEmpty ? this.firstName : this.firstName + " " + this.lastName;
    }

}
