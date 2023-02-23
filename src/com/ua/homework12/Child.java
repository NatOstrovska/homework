package com.ua.homework12;

public class Child extends Parent {

    {
        System.out.println("init child:" + number++);
    }

    static {
        System.out.println("static child:" + number++);
    }

}
