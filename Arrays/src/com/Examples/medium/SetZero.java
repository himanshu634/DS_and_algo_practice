package com.Examples.medium;

// https://leetcode.com/problems/set-matrix-zeroes/

import java.util.Arrays;

public class SetZero {
    public void setZero(int[][] matrix){
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for(int i = 0; i < rows.length; i++){
            if(rows[i] == 1){
                Arrays.fill(matrix[i], 0);
            }
        }

        for(int i = 0; i < cols.length; i++){
            if(cols[i] == 1){
                for(int j = 0; j < matrix.length; j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
