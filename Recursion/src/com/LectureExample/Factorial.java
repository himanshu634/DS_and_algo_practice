package com.LectureExample;

public class Factorial {
    public int fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
