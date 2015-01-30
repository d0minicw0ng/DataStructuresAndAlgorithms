package com.dominicwong;

import com.dominicwong.sort.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer[] unsortedArray = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            unsortedArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(unsortedArray));
        Integer[] sortedArray = BubbleSort.sortTwo(unsortedArray);
        System.out.println("The result is:");
        System.out.println(Arrays.toString(sortedArray));
    }
}