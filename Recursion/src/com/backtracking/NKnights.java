package com.backtracking;

public class NKnights {
    public void setKnights(boolean[][] board, int row, int col, int knights){
        if(knights == 0){
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length - 1 && col == board.length){
            return;
        }

        if(col == board.length){
            setKnights(board, row + 1, 0, knights);
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = true;
            setKnights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        setKnights(board, row, col + 1, knights);
    }

    private void display(boolean[][] board){
        for(boolean[] arr : board){
            for(boolean i : arr){
                if(i){
                    System.out.print("k ");
                }else{
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }

    private boolean isSafe(boolean[][] board, int row, int col){
        if(isValid(board, row - 2, col + 1)){
            if(board[row - 2][col + 1]){
                return false;
            }
        }

        if(isValid(board, row - 2, col - 1)){
            if(board[row - 2][col - 1]){
                return false;
            }
        }
        if(isValid(board, row - 1, col - 2)){
            if(board[row - 1][col - 2]){
                return false;
            }
        }
        if(isValid(board, row - 1, col + 2)){
            if(board[row - 1][col + 2]){
                return false;
            }
        }

        return true;
    }

    private boolean isValid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length)
            return true;
        return false;
    }
}
