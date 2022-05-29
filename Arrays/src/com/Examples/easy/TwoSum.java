package com.Examples.easy;

import java.util.*;

// https://leetcode.com/problems/two-sum/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(target - nums[i])){
                return new int[]{hm.get(target - nums[i]), i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{};

    }
}
