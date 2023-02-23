package com.ua.homework11;

public class Car extends Vehicle {

    private int numPassengers;

    public Car(int horsePower, String make, String color, int year, int numPassengers, String carType) {
        super(horsePower, make, color, year, carType);
        this.numPassengers = numPassengers;

    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    @Override
    public String getCarType() {
        return "Car";
    }

    @Override
    public String toString() {
        return "Car{" +
                "numPassengers=" + numPassengers +
                ", horsePower=" + horsePower +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", carType='" + this.getCarType() + '\'' +
                '}';
    }
}
