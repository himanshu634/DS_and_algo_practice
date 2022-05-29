package com.Examples.easy;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        // optimized solution
        int i = nums.length > 0 ? 1 : 0;
        for(int num : nums){
            if(num > nums[i - 1])
                nums[i++] = num;
        }
        return i;
    }

    public int removeDuplicates1(int[] nums){
        // done by me
        int len = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[len] == nums[i]){
                nums[i] = 0;
            }else{
                nums[++len] = nums[i];
            }
        }
        return ++len;
    }

}
