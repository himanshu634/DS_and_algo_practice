package com.LectureExamples;

public class Algorithm{
    // return -1 if arr does not exist
    public int algo(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/ 2;// here (end - start) because sometimes addition may cause integer value to go out of bound
            if(arr[mid] == target){
                return mid + 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }


}
