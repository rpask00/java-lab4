package com.example.zad1;

import com.example.Figura;
import com.example.Punkt;

public class Okrag extends Figura {

    Punkt mid;
    int radius;

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double setDiameter() {
        return 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean inMid(Punkt punkt) {
        double lSide = Math.pow((punkt.getX() - mid.getX()), 2) + Math.pow((punkt.getY() - mid.getY()), 2);
        double pSide = Math.pow(radius, 2);

        return (lSide == pSide) ;
    }

    public Okrag() {
        this.mid = mid;
        this.radius = radius;
    }

    public Okrag(Punkt mid, int radius) {
        this.mid = mid;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Okrag{" +
                "srodek=" + mid +
                ",promien=" + radius +
                '}';
    }
}
