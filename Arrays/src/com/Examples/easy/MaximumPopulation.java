package com.Examples.easy;

// https://leetcode.com/problems/maximum-population-year/

public class MaximumPopulation {
    public int maximumPopulation(int[][] logs) {
        int[] temp = new int[101];

        for(int[] log: logs){
            temp[log[0] - 1950]++;
            temp[log[1] - 1950]--;
        }

        for(int i = 1; i < temp.length; i++){
            temp[i] += temp[i - 1];
        }

        int maxYear = 1950, maxValue = 0;
        for(int i = 0; i < temp.length; i++){
            if(maxValue < temp[i]){
                maxYear = 1950 + i;
                maxValue = temp[i];
            }
        }
        return maxYear;
    }
}
