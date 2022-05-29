package com.LectureExample;

public class SumOfDigits {
    public int sum(int number){
        if(number < 10){
            return number;
        }
        return (number % 10) + sum(number / 10);
    }

}
