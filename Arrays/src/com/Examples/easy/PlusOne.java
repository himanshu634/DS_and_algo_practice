package com.Examples.easy;

// https://leetcode.com/problems/plus-one/submissions/

public class PlusOne {


    public int[] plusOne(int[] nums){
        int sum = 1, rem = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            sum += nums[i];
            if(sum == 10){
                nums[i] = 0;
                sum = 1;
            }else{
                nums[i] = sum;
                sum = 0;
            }
        }
        if(sum == 0){
            return nums;
        }

        int[] ans = new int[nums.length + 1];

        ans[0] = 1;
        for(int i = 0; i < nums.length; i++) ans[i + 1] = nums[i];
        return ans;

    }
}
