package com.LectureExample;

import java.util.ArrayList;

public class PhonePadLearning {
        public void findPermutationOfDigit(String p,String up){
            if(up.isEmpty()){
                System.out.println(p);
                return;
            }

            int digit = up.charAt(0) - '0'; // this will convert '2' into 2

            for(int i = (digit - 1) * 3; i < digit * 3; i++){
                findPermutationOfDigit( p + (char)('a' + i), up.substring(1));
            }

        }

        public ArrayList<String> findPermutationOfDigitArrayList(String p, String up){
            if(up.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }

            int digit = up.charAt(0) - '0'; // this will convert '2' into 2
            ArrayList<String> ans = new ArrayList<>();
            for(int i = (digit - 1) * 3; i < digit * 3; i++){
                ans.addAll(findPermutationOfDigitArrayList( p + (char)('a' + i), up.substring(1)));
            }
            return ans;
        }

        public int findPermutationDigitCount(String p, String up){
            if(up.isEmpty()){
                return 1;
            }

            int digit = up.charAt(0) - '0'; // this will convert '2' into 2
            int count = 0;
            for(int i = (digit - 1) * 3; i < digit * 3; i++){
                count += findPermutationOfDigitArrayList( p + (char)('a' + i), up.substring(1)).size();
            }
            return count;
        }

}
