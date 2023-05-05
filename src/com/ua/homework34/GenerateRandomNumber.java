package com.ua.homework34;

import java.util.Random;
import java.util.concurrent.Callable;


public class GenerateRandomNumber implements Callable {
    Random random = new Random();

    @Override
    public Integer call() throws Exception {
        return random.nextInt(50 ) + 1;
    }
}
