package com.Assignmets;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FandLIndex {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{search(nums, target, true), search(nums, target, false)};
    }

    private int search(int[] nums, int target, boolean startIndex){
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                ans = mid;

                if(startIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

}
