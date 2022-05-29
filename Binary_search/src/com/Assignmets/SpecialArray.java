package com.Assignmets;

import java.util.Arrays;

// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

public class SpecialArray {
//    public int specialArray(int[] nums) {
//        for(int i = 0; i <= nums.length; i++){
//            if(i == (findVals(nums, i) + 1)){
//                return i;
//            }
//
//        }
//        return -1;
//    }
//
//    private int findVals(int[] nums, int target){
//        int count = -1;
//
//        for(int i : nums){
//            if(i >= target){
//                count++;
//            }
//        }
//
//        return count;
//    }

    // TODO understand it
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int n = nums.length-i;
            boolean cond1 =  n<=nums[i];
            boolean cond2 = (i-1<0) || (n>nums[i-1]);
            if (cond1 && cond2) return n;
        }
        return -1;
    }
}
