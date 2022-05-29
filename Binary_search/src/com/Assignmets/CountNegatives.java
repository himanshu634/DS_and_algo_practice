package com.Assignmets;

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class CountNegatives {

    // complexity O(nlog(n))
//    public int countNegative(int[][] grid) {
//        int count = 0;
//
//        for(int[] arr: grid){
//            count += countNegative(arr);
//        }
//
//        return count;
//    }
//
//    private int countNegative(int[] arr){
//        int start = 0, end = arr.length - 1;
//
//        while(start < end){
//            int mid = start + (end - start) / 2;
//
//            if(arr[mid] >= 0){
//                start = mid + 1;
//            }else {
//                end = mid;
//            }
//        }
//
//        if(arr[start] < 0){
//            return arr.length - start;
//        }else{
//            return 0;
//        }
//    }

    // complexity O(n + m)
    public int countNegatives(int[][] grid){
        int rows = grid.length, cols = grid[0].length, i = 0, j = cols - 1;
        int count = 0;

        while(i < rows && j >= 0){
            if(grid[i][j] < 0){
                j--;
                count += (rows - i);
            }else{
                i++;
            }
        }
        return count;
    }

}
