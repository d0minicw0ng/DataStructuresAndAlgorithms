package com.dominicwong.sort;

/**
 * Created by dominicwong on 30/1/15.
 */
public class BubbleSort {
    public static Integer[] sort(Integer[] toBeSorted) {
        boolean swapped = false;

        do {
            swapped = false;
            for (int i = 0; i < toBeSorted.length - 1; i++) {
                if (toBeSorted[i] > toBeSorted[i + 1]) {
                    Integer temp = toBeSorted[i + 1];
                    toBeSorted[i + 1] = toBeSorted[i];
                    toBeSorted[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped == true);

        return toBeSorted;
    }
}
