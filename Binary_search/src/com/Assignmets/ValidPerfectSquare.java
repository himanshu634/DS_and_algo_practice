package com.Assignmets;

public class ValidPerfectSquare {
    public boolean isValid(int num){
        int start = 1, end = num;
        while(start <= end){
            long mid = (start + end) >>> 1;
            int sq = (int)(mid * mid);

            if(sq == num) {
                return true;
            }else if(sq > num){
                end = (int)mid - 1;
            }else{
                start = (int)mid + 1;
            }
        }
        return false;
    }

}
