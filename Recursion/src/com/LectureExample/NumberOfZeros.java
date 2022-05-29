package com.LectureExample;

public class NumberOfZeros {
    public int countNumberOfZero(int number){
        return helper(number, 0);
    }

    private int helper(int number, int count){
        if(number < 10){
            if(number == 0){
                return ++count;
            }
            return count;
        }
        return (number % 10) == 0 ? helper(number/10, ++count) : helper(number/10, count);
    }

}
