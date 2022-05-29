package com.LectureExamples;


public class Mountain {

    // https://leetcode.com/problems/peak-index-in-a-mountain-array/

    public int findPickIndex(int[] arr){
        int start = 0, end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }

    // // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public int findParticularElement(int[] arr, int target){
        // To find particular target in mountain arr we have to find pickIndex
        // After that we have to find target in left-side area and then right-side area to the pick Index

        int pickIndex = findPickIndex(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, pickIndex);
        if(firstTry != -1){
            return firstTry;
        }else{
            return orderAgnosticBinarySearch(arr, target, pickIndex + 1, arr.length - 1);
        }
    }

    private int orderAgnosticBinarySearch(int arr[], int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }else{
                if (arr[mid] < target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


}
