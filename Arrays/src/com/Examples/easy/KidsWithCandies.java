package com.Examples.easy;

import java.util.List;
import java.util.ArrayList;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

public class KidsWithCandies {
    public List<Boolean> solution(int[] candies, int extraCandies){
        List<Boolean> ans = new ArrayList<Boolean>(candies.length);
        int max = Integer.MIN_VALUE;
        for(int i : candies){
            if(max < i){
                max = i;
            }
        }

        for(int i = 0; i < candies.length; i++){
            int sum = candies[i] + extraCandies;
            if(sum < max){
                ans.add(false);
            }else{
                ans.add(true);
            }
        }
        return ans;
    }

}
