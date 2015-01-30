package com.dominicwong.sort;

/**
 * Created by dominicwong on 30/1/15.
 */
public class BubbleSort {
    // Solution 1
    public static int[] sort(int[] toBeSorted) {
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

    // Solution 2
    public static int[] sortTwo(int[] toBeSorted) {
        for (int i = 0; i < toBeSorted.length - 2; i++) {
            for (int j = 0; j < toBeSorted.length - 2 - i; j++) {
                if (toBeSorted[j] > toBeSorted[j+1]) {
                    Integer temp = toBeSorted[j+1];
                    toBeSorted[j+1] =  toBeSorted[j];
                    toBeSorted[j] = temp;
                }
            }
        }
        return toBeSorted;
    }
}
