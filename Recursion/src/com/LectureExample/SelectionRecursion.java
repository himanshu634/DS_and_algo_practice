package com.LectureExample;

public class SelectionRecursion {

    public int[] selection(int[] arr, int row, int col, int max){
        if(row == 0){
            return arr;
        }

        if(col < row){
            if(arr[col] > arr[max]){
               return selection(arr, row, col + 1, col);
            }else{
                return selection(arr, row, col + 1, max);
            }
        }else{
            int temp = arr[row - 1];
            arr[row - 1] = arr[max];
            arr[max] = temp;
           return selection(arr, row - 1, 0, 0);
        }

    }
}
