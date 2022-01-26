package com.example;

class Trojkat extends Figura {
    int wys = 0;
    int podst = 0;

    public Trojkat(int wys, int podst) {
        this.wys = wys;
        this.podst = podst;
    }

    public Trojkat(int wys, int podst, String kolor) {
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }

    public String opis(String desc) {
        return this.desc;
    }

    @Override
    public String toString() {
        return "com.example.Trojkat{" +
                "punkt=" + punkt +
                ", kolor='" + color + '\'' +
                ", wys=" + wys +
                ", podst=" + podst +
                '}';
    }
}