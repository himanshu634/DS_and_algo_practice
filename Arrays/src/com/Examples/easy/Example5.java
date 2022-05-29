package com.Examples.easy;

// https://leetcode.com/problems/shuffle-the-array/submissions/

public class Example5 {
    public int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];
        for(int i = 0, j = 0; j < nums.length; j += 2, i++){
            ans[j] = nums[i];
            ans[j + 1] = nums[i + n];
        }
        return ans;
    }

}
