package com.interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("CDPlayer starts.");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer stops.");
    }
}
