package com.example;

public class Kwadrat extends Prostokat {

    public Kwadrat(int wys, int szer) {
        super(wys, szer);

    }

    public String opis(String desc) {
        return this.desc;
    }

    @Override
    public String toString() {
        return "com.example.Kwadrat{" +
                "punkt=" + punkt +
                ", kolor='" + color + '\'' +
                ", wys=" + wys +
                ", szer=" + szer +
                '}';
    }
}
