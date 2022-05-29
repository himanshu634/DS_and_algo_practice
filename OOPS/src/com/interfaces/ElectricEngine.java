package com.interfaces;

public class ElectricEngine implements Engine{
    static final int PRICE = 100000;

    @Override
    public void start() {
        System.out.println("Electric Engine Starts.");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stops.");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine accelerates.");
    }
}
