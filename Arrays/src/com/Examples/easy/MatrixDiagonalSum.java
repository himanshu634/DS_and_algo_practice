package com.Examples.easy;

// https://leetcode.com/problems/matrix-diagonal-sum/

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int basicSize = mat[0].length;

        if(mat.length == 1){
            return mat[0][0];
        }

        int primaryD = 0, sum = 0, secondaryR = 0, secondaryC = (basicSize - 1);
        while(primaryD < basicSize){
            sum += mat[primaryD][primaryD];

            if(primaryD != secondaryC){
                sum += mat[secondaryR++][secondaryC--];
            }else{
                secondaryC--; secondaryR++;
            }

            primaryD++;

        }
        return sum;

    }
}
