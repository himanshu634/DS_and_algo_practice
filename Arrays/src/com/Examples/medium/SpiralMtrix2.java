package com.Examples.medium;

// https://leetcode.com/problems/spiral-matrix-ii/

public class SpiralMtrix2 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int top = 0, left = 0, right = n, bottom = n, counter = 1;


        while(top < bottom && left < right){

            for(int i = left; i < right; i++){
                ans[top][i] = counter++;
            }
            top++;

            for(int i = top; i < bottom; i++){
                ans[i][right - 1] = counter++;
            }
            right--;

            if(!((left < right) && (top < bottom))){
                break;
            }

            for(int i = right - 1; i >= left; i--){
                ans[bottom - 1][i] = counter++;
            }
            bottom--;

            for(int i = bottom - 1; i >= top; i--){
                ans[i][left] = counter++;
            }
            left++;
        }
        return ans;
    }
}
