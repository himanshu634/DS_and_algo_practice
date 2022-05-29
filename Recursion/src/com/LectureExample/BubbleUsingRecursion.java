package com.LectureExample;

public class BubbleUsingRecursion {
    public int[] sort(int[] arr, int pos, int count){
        if(count == 0){
            return arr;
        }
        if(pos == count){
           return sort(arr, 0, --count);
        }
        if(((pos + 1) < arr.length) && arr[pos] >= arr[pos + 1]){
            int temp = arr[pos];
            arr[pos] = arr[pos + 1];
            arr[pos + 1] = temp;
        }
       return sort(arr, ++pos, count);
    }

}
