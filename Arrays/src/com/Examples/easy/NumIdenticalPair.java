package com.Examples.easy;

import java.util.HashMap;

// https://leetcode.com/problems/number-of-good-pairs/

public class NumIdenticalPair {
    public int numIdenticalPairs2(int[] nums){ // complexity O(n^2)
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public int numIdenticalPairs(int[] nums) { // complexity O(n)
        int count = 0;
        HashMap<Integer,Integer> seen = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(seen.containsKey(nums[i])){
                count = count + seen.get(nums[i]);
                seen.put(nums[i],seen.get(nums[i]) + 1);
            }
            else{
                seen.put(nums[i],1);
            }
        }
        return count;
    }
}
