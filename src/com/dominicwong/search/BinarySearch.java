package com.dominicwong.search;

/**
 * Created by dominicwong on 30/1/15.
 */
public class BinarySearch {
    public static int recursiveSearch(int[] sortedArray, int data) {
        return BinarySearch.recursiveSearch(sortedArray, data, 0, sortedArray.length - 1);
    }

    private static int recursiveSearch(int[] sortedArray, int data, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (sortedArray[mid] == data) {
            return mid;
        } else if (sortedArray[mid] > data) {
            return recursiveSearch(sortedArray, data, 0, mid - 1);
        } else {
            return recursiveSearch(sortedArray, data, mid + 1, high);
        }
    }

    public static int iterativeBinarySearch(int [] sortedArray, int data) {
        int low = 0;
        int high = sortedArray.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (sortedArray[mid] == data) {
                return mid;
            } else if (sortedArray[mid] > data) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
