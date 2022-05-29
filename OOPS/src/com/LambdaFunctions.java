package com;

import java.util.ArrayList;

public class LambdaFunctions {

    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i < 6; i++){
            al.add(i);
        }

        al.forEach((item) -> System.out.println(item));
        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;


    }

    interface Operation{
        int operation(int a, int b);
    }
}
