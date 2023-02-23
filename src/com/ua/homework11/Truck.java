package com.ua.homework11;

public class Truck  extends Vehicle{

    private int numPassengers;
    private int loadCapacity;

    public Truck(int horsePower, String make, String color, int year, int loadCapacity, int numPassengers, String carType) {
        super(horsePower, make, color, year, carType);
        this.loadCapacity = loadCapacity;
        this.numPassengers = numPassengers;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumPassengers() {
        return numPassengers;
    }



    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }


    @Override
    public String getCarType() {
        return "Truck";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "numPassengers=" + numPassengers +
                ", loadCapacity=" + loadCapacity +
                ", horsePower=" + horsePower +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", carType='" + this.getCarType() + '\'' +
                '}';
    }
}
