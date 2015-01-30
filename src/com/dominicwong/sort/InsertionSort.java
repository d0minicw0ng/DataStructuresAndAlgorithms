package com.dominicwong.sort;

/**
 * Created by dominicwong on 30/1/15.
 */
public class InsertionSort {
    public static int[] sort(int[] toBeSorted) {
        for (int i = 0; i < toBeSorted.length; i++) {
            int current = toBeSorted[i];
            int j = i - 1;

            while (j >= 0 && toBeSorted[j] > current) {
                toBeSorted[j+1] = toBeSorted[j];
                j--;
            }
            toBeSorted[j+1] = current;
        }
        return toBeSorted;
    }
}
