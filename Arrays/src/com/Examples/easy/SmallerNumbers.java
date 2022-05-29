package com.Examples.easy;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

public class SmallerNumbers {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int current = 0; current < nums.length; current++){
            int count = 0;

            int right = current + 1;
            int left = current - 1;

            while(left > -1 || right < nums.length){
                if(left > -1 && nums[left] < nums[current]){
                    count++;
                    left--;
                }

                if(right < nums.length && nums[right] < nums[current]){
                    count++;
                    right++;
                }


            }
            ans[current] = count;
        }
        return ans;
    }}

