package com.Examples.easy;

//     https://leetcode.com/problems/reshape-the-matrix/

public class ReshapeArray {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] ans = new int[r][c];

        int ansRow = 0;
        int ansCol = 0;

        for(int i = 0; i < row; i++){

            for(int j = 0; j < col; j++){
                if(ansCol == c){
                    ansCol = 0;
                    ansRow++;
                }
                ans[ansRow][ansCol++] = mat[i][j];
            }
        }
        return ans;
    }
}
