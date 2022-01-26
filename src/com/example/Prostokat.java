package com.example;

class Prostokat extends Figura {
    int wys = 0;
    int szer = 0;

    Prostokat(int wys, int szer) {
        this.wys = wys;
        this.szer = szer;

    }

    Prostokat(int wys, int szer, String kolor) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
//		this.kolor = kolor;
    }

    int getPowierzchnia() {
        return (szer * wys);
    }

    @Override
    public String toString() {
        return "com.example.Prostokat{" +
                "punkt=" + punkt +
                ", kolor='" + color + '\'' +
                ", wys=" + wys +
                ", szer=" + szer +
                '}';
    }

    public String opis(String desc) {
        return this.desc;
    }

}