package com.ua.homework11;

public class TestInherence {

    public static void main(String[] args){
        Car car = new Car( 100, "Skoda", "grey", 2018, 5, "Skoda");
        Truck truck = new Truck(130, "Ford", "grey", 2020, 30000, 2, "Ford");
        System.out.println(car);
        System.out.println(truck);


    }
}
