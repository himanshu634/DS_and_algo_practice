package com.LectureExample;

public class CheckSorted {
    // Check whether the array is sorted or not using recursion.

    public boolean checkSorted(int[] arr, int startIndex){
        if(startIndex == (arr.length -1)){
            return true;
        }
        return arr[startIndex] < arr[++startIndex] ? checkSorted(arr, startIndex): false;
    }

}
