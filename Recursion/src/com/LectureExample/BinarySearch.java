package com.LectureExample;

public class BinarySearch {
    public int search(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] < target){
            return search(arr, target, mid + 1, end);
        }
           return search(arr, target, start, mid - 1 );
    }
}
