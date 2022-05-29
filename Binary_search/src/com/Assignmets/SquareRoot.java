package com.Assignmets;

// https://leetcode.com/problems/sqrtx/

public class SquareRoot {
    public int findsqrt(int x){
        int start = 0, end = x / 2;
        int mid = start + (end - start) / 2;

        while(start <= end){
            if(mid * mid == x){
                return mid;
            }else if(mid * mid > x){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        if(mid * mid > x){
            return mid - 1;
        }else{
            return mid;
        }

    }
}
