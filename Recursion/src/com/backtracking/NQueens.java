package com.backtracking;

public class NQueens {

    public int placeQueens(boolean[][] board, int row){

        if(row == board.length){
            display(board);
            return 1;
        }
        int count = 0;
        for(int i = 0; i < board.length; i++){
            if(check(board, row, i)){
                board[row][i] = true;
                count += placeQueens(board, row + 1);
                board[row][i] = false;
            }
        }

        return count;
    }

    private void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean cell : row){
                if(cell){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private boolean check(boolean[][] board, int row, int col){
        // upper column area checking
        for(int i = row - 1; i > -1; i--){
            if(board[i][col]){
                return false;
            }
        }

        // left upper diagonal
        int maxLeft = Math.min(row, col);
        for(int i = 0; i <= maxLeft; i++){
            if(board[row - i][col - i]){
                return false;
            }
        }

        // right upper diagonal
        int maxRight = Math.min(row, board.length - col - 1);
        for(int i = 1; i <= maxRight; i++){
            if(board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }

}
