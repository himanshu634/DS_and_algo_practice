package com.Assignmets;

import java.util.Arrays;

// https://leetcode.com/problems/check-if-n-and-its-double-exist/

public class DoubleExist {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] >= 0){
                if(binarySearch(arr, i + 1, arr.length - 1, arr[i] * 2)){
                    return true;
                }
            }else{
                if(binarySearch(arr, 0, i - 1, arr[i] * 2)){
                    return true;
                }
            }

        }

        return false;

    }

    private boolean binarySearch(int[] arr, int start, int end, int target){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return false;
    }
}
