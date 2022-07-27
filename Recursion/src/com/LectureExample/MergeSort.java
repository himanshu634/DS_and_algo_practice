package com.LectureExample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    private int[] merge(int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        int[] ans = new int[left.length + right.length];
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                ans[k] = left[i++];
            }else{
                ans[k] = right[j++];
            }
            k++;
        }

        while( i < left.length){
            ans[k++] = left[i++];
        }

        while(j < right.length){
            ans[k++] = right[j++];
        }
        return ans;
    }
}