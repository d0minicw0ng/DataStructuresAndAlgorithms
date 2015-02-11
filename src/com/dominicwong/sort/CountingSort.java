package com.dominicwong.sort;

/**
 * Created by dominicwong on 11/2/15.
 */
public class CountingSort {
    public static void sort(int[] toBeSorted, int min, int max) {
        int[] count = new int[max - min + 1];
        for (int number : toBeSorted) {
            count[number-min]++;
        }
        int currentIndex = 0;
        for (int i = min; i <= max; i++) {
            while (count[i-min] > 0) {
                toBeSorted[currentIndex] = i;
                currentIndex++;
                count[i-min]--;
            }
        }
    }
}
