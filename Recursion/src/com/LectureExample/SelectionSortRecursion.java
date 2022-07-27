package com.LectureExample;

public class SelectionSortRecursion {
    public void sort(int[] arr, int row, int col, int max){
        if(row == 0){
            return;
        }

        if(col < row) {
            if (arr[col] > arr[max]) {
                sort(arr, row, ++col, col);
            } else {
                sort(arr, row, ++col, max);
            }
        }else {
            int temp = arr[row - 1];
            arr[row - 1] = arr[max];
            arr[max] = temp;
            sort(arr, --row, 0, max);
        }
    }
}
