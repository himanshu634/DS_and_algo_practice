package com.Examples.easy;

// https://leetcode.com/problems/richest-customer-wealth/

public class Example4 {
    public int maximumWealth(int[][] accounts){
        int maximumWealth = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(maximumWealth < sum)
                maximumWealth = sum;
        }
        return maximumWealth;
    }
}
