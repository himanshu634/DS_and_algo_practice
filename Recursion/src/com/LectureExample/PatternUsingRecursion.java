package com.LectureExample;

public class PatternUsingRecursion {
    public void print(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("* ");
            print(row, ++col);
        }else{
            System.out.println();
            col = 0;
            print(--row, col);
        }
    }

}
