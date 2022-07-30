package com.LectureExample;

import java.util.ArrayList;

public class Dice {
    public void findCombination(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= target && i <= 6; i++){
            findCombination(p + i, target - i);
        }
    }

    public ArrayList<String> findCombinationArrayList(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i <= target && i <= 6; i++){
            ans.addAll(findCombinationArrayList(p + i, target - i));
        }

        return ans;
    }
}
