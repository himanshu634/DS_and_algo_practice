package com.interfaces;

public class PowerEngine implements Engine{
    static final int PRICE = 50000;

    @Override
    public void start() {
        System.out.println("Power Engine starts.");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stops.");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerate");
    }
}
