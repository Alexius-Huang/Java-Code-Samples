package com.alexius;

public class Car {

    // Member Variables
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public static void main(String[] args) {}

    // Public methods
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
