package com.ua.homework15;

public class Main {
    public static void main(String[] args) {

        Driving driver = new Driver();
        Driving pilot = new Pilot();
        Flyers sesna = new Airplane();
        driver.process();
        pilot.process();

        sesna.fly();


    }


}
