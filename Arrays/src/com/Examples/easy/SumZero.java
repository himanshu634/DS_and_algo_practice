package com.Examples.easy;

// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

public class SumZero {
    public int[] sumZero(int n) {
        int[] ans = new int[n];

        int num = n / 2;
        for(int i = 0,j = n - 1; i < (n / 2); i++, j--){
            ans[j] = -num;
            ans[i] = num--;
        }

//        if((n & 1) != 1){
//            ans[n/2] = 0;
//        }

        return ans;

    }
}
