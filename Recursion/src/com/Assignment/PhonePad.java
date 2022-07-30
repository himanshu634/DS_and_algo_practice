package com.Assignment;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class PhonePad {
        public List<String> letterCombinations(String digits) {
            if(digits.isEmpty()){
                return new ArrayList<>();
            }
            return helper("", digits);
        }

        private List<String> helper(String p, String up){
            if(up.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }

            int number = up.charAt(0) - '0';
            int[] range = findRange(number);
            int start = range[0], end = range[1];

            ArrayList<String> ans = new ArrayList<>();
            for(int i = start; i < end; i++){
                ans.addAll(helper(p + (char)(i + 'a'), up.substring(1)));
            }
            return ans;
        }

        private int[] findRange(int number){
            switch(number){
                case 2:
                    return new int[]{0, 3};
                case 3:
                    return new int[]{3, 6};
                case 4:
                    return new int[]{6, 9};
                case 5:
                    return new int[]{9, 12};
                case 6:
                    return new int[]{12, 15};
                case 7:
                    return new int[]{15, 19};
                case 8:
                    return new int[]{19, 22};
                case 9:
                    return new int[]{22, 26};
            }
            return new int[]{-1, -1};
        }

}
