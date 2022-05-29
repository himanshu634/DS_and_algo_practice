package com.LectureExamples;

public class RowColMatrix {

    public int[] search(int[][] arr, int target){
        int row = 0;
        int column = arr.length - 1;

        while(row < arr.length && column >= 0){
            if(arr[row][column] == target){
                return new int[]{++row, ++column};
            }else if(arr[row][column] > target){
                column--;
            }else{
                row++;
            }
        }
        return new int[]{-1, -1};
    }

}
