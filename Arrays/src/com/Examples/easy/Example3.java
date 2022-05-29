package com.Examples.easy;

// https://leetcode.com/problems/running-sum-of-1d-array/

public class Example3 {
    public int[] runningSum(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            nums[i + 1] = nums[i] + nums[i + 1];
        }
        return nums;
    }

}
