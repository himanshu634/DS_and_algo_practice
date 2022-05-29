package com.Examples.easy;

import java.util.*;


// https://leetcode.com/problems/lucky-numbers-in-a-matrix/

public class LuckyNumber {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(checkRow(matrix, i, j) && checkCol(matrix, i, j)){
                    list.add(matrix[i][j]);
                }
            }
        }

        return list;

    }

    private boolean checkRow(int[][] mat, int row, int col){
        int min = Integer.MAX_VALUE;


        for(int element : mat[row]){
            if(min > element){
                min = element;
            }
        }

        if(min == mat[row][col]){
            return true;
        }

        return false;
    }

    private boolean checkCol(int[][] mat, int row, int col){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < mat[0].length; i++){
            if(max < mat[i][col]){
                max = mat[i][col];
            }
        }

        if(max == mat[row][col]){
            return true;
        }

        return false;

    }

}
