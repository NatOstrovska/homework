package com.ua.homework11;

public class Vehicle {

    protected int horsePower;
    protected String make;
    protected String color;
    protected int year;

    protected String carType;


    public Vehicle(int horsePower, String make, String color, int year, String carType) {
        this.horsePower = horsePower;
        this.make = make;
        this.color = color;
        this.year = year;
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
