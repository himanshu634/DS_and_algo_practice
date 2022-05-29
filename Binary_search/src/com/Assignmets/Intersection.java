package com.Assignmets;

// https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.*;

public class Intersection {

    // time complexity is O(n)
//    public int[] intersection(int[] nums1, int[] nums2) {
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        ArrayList<Integer> al = new ArrayList<>();
//
//        for (int j : nums1) {
//            if (!hm.containsKey(j)) {
//                hm.put(j, 1);
//            }
//        }
//
//        for (int j : nums2) {
//            if (hm.containsKey(j)) {
//                    al.add(j);
//                    hm.remove(j);
//            }
//        }
//
//        return al.stream().mapToInt(i -> i).toArray();
//    }

    // com. = O(nlog(n))
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);

        for(int i : nums1){
            if(binarySearch(nums2, i)){
                set.add(i);
            }
        }

        return set.stream().mapToInt(i -> i).toArray();

    }

    private boolean binarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return true;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
