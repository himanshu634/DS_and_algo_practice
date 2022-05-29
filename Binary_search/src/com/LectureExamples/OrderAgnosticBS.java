package com.LectureExamples;

public class OrderAgnosticBS {
    //returns 01 if there is no target in array
    public int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //To know if arr is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid + 1;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

}
