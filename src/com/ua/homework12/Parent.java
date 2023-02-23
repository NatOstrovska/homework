package com.ua.homework12;

public class Parent {
   static int number = 1;

    {
        System.out.println("init parent:" + number++);
    }

    static {
        System.out.println("static parent:" + number++);
    }

}
