package com.example;

public class Figura {

    //pola metody i kontruktory
    Punkt punkt;
    String color = "bialy";
    String desc = "opis";

    public Figura() {
        punkt = new Punkt(0, 0);
    }

    public Figura(String color) {
        this.color = color;
        punkt = new Punkt(0, 0);
    }

    public Figura(Punkt punkt) {
        this.punkt = punkt;
    }

    void przesun(int x, int y) {
        punkt.x += x;
        punkt.y += y;
    }



    @Override
    public String toString() {
        return "com.example.Figura{" +
                "punkt=" + punkt +
                ", kolor='" + color + '\'' +
                '}';
    }
}
