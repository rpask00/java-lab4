package com.example;

import com.example.zad1.Okrag;
import com.example.zad2.Taxi;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Figura();
        Prostokat prostokat = new Prostokat(1, 2);
        Punkt punkt = new Punkt();
        Trojkat trojkat = new Trojkat(1, 1);
        Okrag okrag = new Okrag(new Punkt(1, 2), 3);
        Okrag okrag2 = new Okrag();

        Taxi taxi = new Taxi();
        taxi.main();
        prostokat.przesun(3, 5);
        Kwadrat kwadrat = new Kwadrat(5, 5);

        System.out.println(punkt.toString());
        System.out.println(figura.toString());
        System.out.println(prostokat.toString());
        System.out.println(trojkat.toString());
        System.out.println(kwadrat.toString());
        System.out.println(okrag.toString());
        System.out.println(okrag2.toString());

    }
}
