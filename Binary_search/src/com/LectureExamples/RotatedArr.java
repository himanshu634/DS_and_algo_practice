package com.LectureExamples;

public class RotatedArr {

    // https://leetcode.com/problems/search-in-rotated-sorted-array/
    public int findParticularElement(int[] arr, int target){
        int pivot = findPivotIndex(arr);
        if(arr[pivot] == target){
            return pivot;
        }else{
        int firstTry = binarySearch(arr, target, 0, pivot);
        if(firstTry != -1){
            return firstTry;
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);}
    }

    // This will not work in duplicate values.
    private int findPivotIndex(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }else{
                start = mid;
            }
        }
        return -1;
    }

    //This will work with duplicate values.
    private int findPivotIndexWithDuplicate(int[] arr){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // if mid, start and end is same.
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                //NOTE :What if start of end is pivot?
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    // This function is used to find rotation in array.
    public int findRotationCount(int[] arr){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }else if(mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                //Note: What if start or end is pivot one?
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end - 1] > arr[end]){
                    return end - 1;
                }
                end--;
            }else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }


    private int binarySearch(int[] arr, int target, int start , int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
