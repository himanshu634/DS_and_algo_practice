package com.Assignmets;

// https://leetcode.com/problems/single-element-in-a-sorted-array/

public class NonDuplicate {
    public int singleNonDuplicate(int[] nums) {

            int start = 0, end = nums.length - 1;

           while(start < end){
               int mid = start + (end - start) / 2;

               if(((mid % 2 == 0) && nums[mid + 1] == nums[mid]) || ((mid % 2 == 1) && (nums[mid - 1] == nums[mid]))){
                   start = mid + 1;
               }else{
                   end = mid;
               }
           }
           return nums[end];

    }
}
