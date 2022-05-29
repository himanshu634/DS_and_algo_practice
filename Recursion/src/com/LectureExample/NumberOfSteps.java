package com.LectureExample;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumberOfSteps {
    public int countNumberOfSteps(int num){
        return helper(num, 0);
    }

    private int helper(int num, int count){
        if(num == 0){
            return count;
        }
        return (num % 2) == 0 ? helper(num/2, ++count): helper(num - 1, ++count);
    }

}
