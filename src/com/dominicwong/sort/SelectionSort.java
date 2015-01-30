package com.dominicwong.sort;

/**
 * Created by dominicwong on 30/1/15.
 */
public class SelectionSort {
    public static int[] sort(int[] toBeSorted) {
        for (int i = 0; i < toBeSorted.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < toBeSorted.length; j++) {
                if (toBeSorted[j] < toBeSorted[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = toBeSorted[i];
            toBeSorted[i] = toBeSorted[minIndex];
            toBeSorted[minIndex] = temp;
        }
        return toBeSorted;
    }
}
