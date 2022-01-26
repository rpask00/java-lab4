package com.example.zad2;

import java.util.Random;

public class Auto {
    float[] przebieg;

    public Auto() {
        this.przebieg = new float[12];
        Random rand = new Random();

        for (int i = 0; i < this.przebieg.length; i++) {
            this.przebieg[i] = (float) (rand.nextInt(100) + 1);
        }
    }

    public float sredniPrzebieg() {
        double sum = 0;
        for (int i = 0; i < this.przebieg.length; i++) {
            sum += this.przebieg[i];
        }
        return (float) (sum / this.przebieg.length);

    }

}
