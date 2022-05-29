package com.LectureExample;

public class RotatedBinarySearch {
    public int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }else{
          if(arr[start] <= arr[mid]){
              if(arr[mid] >= target && target >= arr[start]){
                  return search(arr, target, start, mid - 1);
              }else{
                  return search(arr, target, mid + 1, end);
              }
          }else if(target >= arr[mid] && target <= arr[end]){
              return search(arr, target, mid + 1, end);
          }else{
              return search(arr, target, start, end - 1);
          }

        }
    }
}
