package com.ua.homework15;

public class Airplane implements Flyers{

    @Override
    public boolean fly() {
        System.out.println("Has two wings");
        System.out.println("Has engine");
        System.out.println("Has rudder");
        return true;
    }
}
