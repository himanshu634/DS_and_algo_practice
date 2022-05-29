package com.Assignmets;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSum {
    public int[] solution(int[] nums, int target){
        int start = 0, end = nums.length - 1;

        while(start < end && nums[start] + nums[end] != target){
            if(nums[start] + nums[end] > target){
                end--;
            }else{
                start++;
            }
        }


        return new int[]{++start, ++end};
    }

}
