package com.Abstract;

public class Son extends Parent{

    Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be Engineer.");
    }

    @Override
    void partner() {
        System.out.println("My partner is Eshika and she is 21");
    }
}
