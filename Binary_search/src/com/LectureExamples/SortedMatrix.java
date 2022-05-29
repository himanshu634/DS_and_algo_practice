package com.LectureExamples;

public class SortedMatrix {
    /* Sorted Matrix looks like this [[1,2,3,4],
                                      [5,6,7,8],
                                      [9,10,11,12]]
     */

    public int[] search(int[][] mat, int target){
        int row = mat.length;
        int col = mat[0].length;

        if(row == 1){
            return binarySearch(mat, 0, 0, mat.length - 1, target);
        }

        int cMid = col / 2;
        int rStart = 0;
        int rEnd = mat.length - 1;

        while(rStart != (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;

            if(mat[mid][cMid] == target){
                return new int[]{mid, cMid};
            }else if(mat[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        if(mat[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }else if(mat[rEnd][cMid] == target) {
            return new int[]{rEnd, cMid};
        }else if(mat[rStart][cMid - 1] >= target){
            return binarySearch(mat, rStart, 0, cMid - 1, target);
        }else if(mat[rStart][col - 1] >= target){
            return binarySearch(mat, rStart, cMid + 1, col - 1, target);
        }else if(mat[rEnd][cMid - 1] >= target){
            return binarySearch(mat, rEnd, 0, cMid - 1, target);
        }else{
            return binarySearch(mat, rEnd, cMid + 1, col - 1, target);
        }

    }

    private int[] binarySearch(int[][] mat, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int cMid = cStart + (cEnd - cStart) / 2;

            if(mat[row][cMid] == target){
                return new int[]{row, cMid};
            }else if(mat[row][cMid] < target){
                cStart = cMid + 1;
            }else{
                cEnd = cMid - 1;
            }
        }
        return new int[]{-1, -1};
    }

}
