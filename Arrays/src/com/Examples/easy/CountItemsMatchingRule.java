package com.Examples.easy;

// https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.ArrayList;
import java.util.*;


public class CountItemsMatchingRule {
    enum RuleKey{
        type,
        color,
        name;
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        RuleKey rKey = RuleKey.valueOf(ruleKey);

        int position = rKey.ordinal(), count = 0;

        for(List<String> item : items){
            if(Objects.equals(item.get(position), ruleValue)){
                count++;
            }
        }

        return count;
    }
}
