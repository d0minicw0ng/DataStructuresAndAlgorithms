package com.dominicwong;

import com.dominicwong.DataStructures.MockArray;
import com.dominicwong.search.BinarySearch;
import com.dominicwong.sort.InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] unsortedArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            unsortedArray[i] = random.nextInt(100);
        }
        int[] arr = {1,2,3,4,5,6,7,8,8,9,9,50};
        int index = BinarySearch.iterativeBinarySearch(arr, 50);
        System.out.println(index);
//        System.out.println("The result is:");
//        System.out.println(Arrays.toString(sortedArray));
    }
}