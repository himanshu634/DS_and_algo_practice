package com.Examples.easy;

// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

public class MinimumCost {
    public int minimumCostToMoveChips(int[] position){
        int oddCount = 0;
        int evenCount = 0;

        for(int num: position){
            if((num & 1) == 1){
                oddCount++;
            }else{
                evenCount++;
            }
        }
        return Math.min(oddCount, evenCount);
    }


}
