package com.LectureExamples;

// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArray {
    public int splitArr(int[] nums, int m){
        int start = 0, end = 0;

        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while(start < end){
            int mid = start + (end - start) / 2;
            int sum = 0, pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    // We are not allowed to add more than boundary
                    // We have to add piece
                    pieces++;
                    sum = num;
                }else{
                    sum += num;
                }
            }
            if(pieces <= m){
                end = mid;
            }else{
                start = mid + 1;
            }

            }
        return end;
    }
}
