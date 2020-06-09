package com.org.utils;

import java.util.Random;

public class Utility {
    public static float randomNumberGenerator()
    {
        float rangeMin = 0.00f;
        float rangeMax = 1.00f;
        Random r = new Random();
        return rangeMin + (rangeMax - rangeMin) * r.nextFloat();
    }
}
