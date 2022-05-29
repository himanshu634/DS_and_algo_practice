package com.Assignmets;

// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println("pivot is : " + pivot);
        int firstPart = binarySearch(nums, 0, pivot, target);
        if(firstPart != -1){
            return firstPart;
        }
        return binarySearch(nums, pivot + 1, nums.length - 1, target);
    }

    // for finding break out element

    private int findPivot(int[] nums){
        int start = 0, end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }else if(mid > start && nums[mid - 1] > nums[mid]){
                return mid - 1;
            }
            else if(nums[start] < nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

}
