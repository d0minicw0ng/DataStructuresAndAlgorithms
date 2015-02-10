package com.dominicwong.sort;

/**
 * Created by dominicwong on 10/2/15.
 */
public class ShellSort {
    public static void sort(int[] toBeSorted) {
        int h = 0, increment = 0;
        while (increment < toBeSorted.length / 3) {
            // NOTE: Knuth Sequence
            increment = 3 * h + 1;
            h++;
        }
        while (increment > 0) {
            for (int i = increment; i < toBeSorted.length; i++) {
                int j = i;
                int temp = toBeSorted[i];
                while (j >= increment && toBeSorted[j-increment] > temp) {
                    toBeSorted[j] = toBeSorted[j-increment];
                    j = j - increment;
                }
                toBeSorted[j] = temp;
            }
            h--;
            increment = 3 * h + 1;
        }
    }
}
