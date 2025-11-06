package com.vortex.pc.base;

public abstract class Component {
    private String name;
    private double price;

    public Component(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double calculatePrice() {
        return price;
    }
}
