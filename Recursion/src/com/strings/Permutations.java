package com.strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
    public ArrayList<String> calculatePermutation(String p, String up, ArrayList<String> arr){
        if(up.isEmpty()){
            arr.add(p);
            return arr;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            calculatePermutation(p.substring(0, i) + ch + p.substring(i),
                    up.substring(1), arr);
        }

        return arr;
    }

    public void calculatePermutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p );
            return ;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            calculatePermutation(p.substring(0, i) + ch + p.substring(i),
                    up.substring(1));
        }
    }

    public ArrayList<String> calculatePermutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++){
            ans.addAll(calculatePermutationList(p.substring(0, i) + ch + p.substring(i),
                    up.substring(1)));
        }

        return ans;
    }

    public int calculatePermutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for(int i = 0; i <= p.length(); i++){
            count += calculatePermutationCount(p.substring(0, i) + ch + p.substring(i),
                    up.substring(1));
        }

        return count;
    }

}
