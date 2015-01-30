package com.dominicwong;

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
        System.out.println(Arrays.toString(unsortedArray));
        int[] sortedArray = InsertionSort.sort(unsortedArray);
        System.out.println("The result is:");
        System.out.println(Arrays.toString(sortedArray));
    }
}