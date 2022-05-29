package com.Assignmets;

// https://leetcode.com/problems/kth-missing-positive-number/

public class MissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
       int start = 0, end = arr.length;

       while(start < end){
           int mid = start + (end - start) / 2;

           if(arr[mid] - 1 - mid < k){
                start = mid + 1;
           }else{
               end = mid;
           }
       }

       return start + k;

    }

}
