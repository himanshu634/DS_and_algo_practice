package com.Examples.easy;

// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

public class FindRotation {
    public boolean findRotation(int[][] mat, int[][] target) {

        for(int i = 1; i < 4; i++){
            mat = rotate(mat);
            if(compare(mat, target)) return true;
        }
        return false;

    }

    private int[][] rotate(int[][] mat){
        int[][] ans = new int[mat[0].length][mat.length];
            for(int i = 0; i < mat.length; i++){
                int col = mat[0].length - i - 1;
                for(int j = 0; j < mat[0].length; j++){
                    ans[j][col] = mat[i][j];
                }
            }
        return ans;
    }

    private boolean compare(int[][] mat, int[][] target){
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                if(target[row][col] != mat[row][col]){
                    return false;
                }
            }
        }
        return true;
    }
}
