package com.LectureExamples;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLast {
    public int[] searchRange(int[] nums, int target){
        return new int[]{search(nums, target, true), search(nums, target, false)};
    }

    private int search(int[] nums, int target, boolean isStartIndex){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
                ans = mid;
                if(isStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else if(target < nums[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans;
    }


}
