package com.LectureExample;

import java.util.ArrayList;

public class LinearSearch {
    // Linear Search using recursion.
    public int search(int[] arr, int target, int position){
        if(position == arr.length){
            return -1;
        }
        return arr[position] == target ? position : search(arr, target, ++position);
    }

    // When i want all occurrences
    public ArrayList search(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){

            list.add(index);
        }
        return search(arr, target, ++index, list);
    }

    // If i don't wanna use ArrayList in args

    public ArrayList<Integer> searchWithoutList(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> fromBelowCalls = searchWithoutList(arr, target, ++index);
        list.addAll(fromBelowCalls);
        return list;
    }




}
