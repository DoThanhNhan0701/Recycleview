package com.example.listviewcustoms;

public class Country {
    private String name;
    private int flas;
    private int popul;

    public Country(String name, int flas, int popul) {
        this.name = name;
        this.flas = flas;
        this.popul = popul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlas() {
        return flas;
    }

    public void setFlas(int flas) {
        this.flas = flas;
    }

    public int getPopul() {
        return popul;
    }

    public void setPopul(int popul) {
        this.popul = popul;
    }
}
