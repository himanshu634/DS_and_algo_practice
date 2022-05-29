package com.Examples.easy;

import java.util.ArrayList;

// https://leetcode.com/problems/create-target-array-in-the-given-order/

public class TargetArray {
    // TODO complete the program

        public int[] createTargetArray(int[] nums, int[] index) {
            ArrayList list = new ArrayList<>(nums.length);
            for (int i = 0; i < nums.length; i++){
                int ind = nums[i];
                list.add(index[i], ind);
            }
            int [] result = new int[nums.length];
            for (int i = 0; i < list.size(); i++) {
                result[i] = (int)list.get(i);
            }
            return result;
        }

}
