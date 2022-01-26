package com.example.zad2;

import java.util.Random;

public class Taxi extends Auto {
    float[] earnings;

    public Taxi() {
        Random rand = new Random();
        this.earnings = new float[12];

        for (int i = 0; i < this.earnings.length; i++) {
            this.earnings[i] = (float) (rand.nextInt(100) + 1);
        }
    }

    public float avgEarnings() {
        double sum = 0;
        for (int i = 0; i < this.earnings.length; i++) {
            sum += this.earnings[i];
        }
        return (float) (sum / this.earnings.length);

    }

    public void main() {
        System.out.println("Srednie zarobki: " + this.avgEarnings());
        System.out.println("Sredni przebieg: " + this.sredniPrzebieg());
    }


}
