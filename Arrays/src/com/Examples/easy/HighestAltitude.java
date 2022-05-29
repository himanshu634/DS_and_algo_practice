package com.Examples.easy;

// https://leetcode.com/problems/find-the-highest-altitude/

public class HighestAltitude {
    public static int findHighestAltitude(int[] gain){
        int cumulativeVar = 0;
        int ans = 0;

        for(int i : gain){
            cumulativeVar += i;

            if(ans <= cumulativeVar){
                ans = cumulativeVar;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(findHighestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }
}
