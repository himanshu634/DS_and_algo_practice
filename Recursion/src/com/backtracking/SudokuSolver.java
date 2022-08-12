package com.backtracking;

public class SudokuSolver {

    public void display(int[][] board){
        for(int[] arr : board){
            for(int number : arr){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        // checking if there are any empty element is left or not
        boolean emptyLeft = true;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft) break;
        }

        if(emptyLeft){
            // sudoku solved
            return true;
        }

        for(int number = 1; number <= 9; number++){
            if(isSafe(board, row, col, number)) {
                board[row][col] = number;
                if(solve(board)){
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    private boolean isSafe(int[][] board, int row, int col, int num){
        // for checking row
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        for(int[] nums : board){
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int r = rowStart;  r < rowStart + sqrt; r++){
            for(int c = colStart; c < colStart + sqrt; c++){
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
