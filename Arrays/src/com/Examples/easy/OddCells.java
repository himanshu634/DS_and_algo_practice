package com.Examples.easy;

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

public class OddCells {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        int oddCount = 0;

        for(int[] arr : indices){
            row[arr[0]] += 1;
            col[arr[1]] += 1;
        }

        for(int i : row){
            for(int j : col){
                if(((i + j) & 1) == 1){
                    oddCount++;
                }
            }
        }
        return oddCount;

    }
}
