package com.Examples.easy;

import java.util.*;

// https://leetcode.com/problems/add-to-array-form-of-integer/

public class AddToArrayForm {
        public List<Integer> addToArrayForm(int[] nums, int k) {
            ArrayList<Integer> al = new ArrayList<>();

            int curr = k, i = nums.length - 1;
            while(curr > 0 || i >= 0){
                if(i >= 0){
                    curr += nums[i--];
                }
                al.add(0, curr % 10);
                curr /= 10;
            }
            return al;
        }
}
