package com.touchey_pouley.utils;

import java.util.Random;

public class RandomGenerator {
    public static int randomWithZero(int max){
        Random r = new Random();
        return r.nextInt((max) + 1);
    }
}
