package com.LectureExample;

public class ReverseNumber {

    // You can get number of digits by Math.log10(number) + 1
    public int rev(int number, int numberOfDigits){
        if(number < 10){
            return number;
        }
        return ((number % 10) * (int)Math.pow(10, --numberOfDigits)) + rev(number / 10, numberOfDigits);
    }

}
