package com.Assignmets;


// https://leetcode.com/problems/arranging-coins/

public class CoinFilled {
    public int arrangeCoins(int n) {
        // brute force approach
        int i = 1;
        while(n > 0){
            n -= (i++);
        }

        if(n < 0){
            return (i - 2);
        }
        return i - 1;

    }

    public int arrangeCoins2(int n){
        // using binary search

        if(n < 0){
            throw new IllegalArgumentException("no negative allowed");
        }else if(n <= 3){
            return n == 3 ? 2 : 1;
        }else{
            long start = 2, end = n / 2;
            while(start < end){
                long mid = start + (end - start) / 2;
                long temp = (mid * (mid + 1)) / 2;
                if(temp == n) {
                    return (int)mid;
                }else if(temp > n){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            return (int)end;
        }
    }
}
