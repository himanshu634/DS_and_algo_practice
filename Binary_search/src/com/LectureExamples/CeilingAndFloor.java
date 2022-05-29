package com.LectureExamples;

// If the given arr is {1,2,4,5,7} and target is 6 then we have to return smallest greater
// than or equal number to the target(Ceiling Number)


public class CeilingAndFloor {

    public int findCeilingNumber(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (target > arr[arr.length - 1]) return -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }


    // If the given arr is {1,2,4,5,7} and target is 6 then we have to return biggest smaller
    // than or equal number to the target(Floor Number)
    public int findFloorNumber(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (target < arr[arr.length - 1]) return -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }

}
