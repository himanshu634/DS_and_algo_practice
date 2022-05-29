package com.Assignmets;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class MInimumInRotatedArr {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if(pivot != -1){
            return nums[pivot + 1];
        }
        return nums[0];
    }

    private int findPivot(int[] nums){
        int start = 0, end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }else if(mid > start && nums[mid - 1] > nums[mid]){
                return mid - 1;
            }else if(nums[start] < nums[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
