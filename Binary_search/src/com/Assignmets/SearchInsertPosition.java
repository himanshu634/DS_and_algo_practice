package com.Assignmets;

// https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }
}
