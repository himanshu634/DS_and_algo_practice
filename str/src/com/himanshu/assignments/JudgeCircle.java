package com.himanshu.assignments;

// https://leetcode.com/problems/robot-return-to-origin/

public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        int ansX = 0, ansY = 0;
        for(char ch : moves.toCharArray()){
            switch(ch){
                case 'L':
                    ansX--;
                    break;

                case 'R':
                    ansX++;
                    break;

                case 'U':
                    ansY++;
                    break;

                case 'D':
                    ansY--;
                    break;
            }
        }

        return ansX == 0 && ansY == 0;
    }
}
