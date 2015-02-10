package com.dominicwong.sort;

/**
 * Created by dominicwong on 10/2/15.
 */
public class QuickSort {
    public static void sort(int[] toBeSorted) {
        sort(toBeSorted, 0, toBeSorted.length - 1);
    }

    private static void sort(int[] toBeSorted, int start, int end) {
        if (toBeSorted == null || toBeSorted.length == 0) {
            return;
        }

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        int pivot = toBeSorted[mid];

        int i = start, j = end;
        while (i <= j) {
            while (toBeSorted[i] < pivot) {
                i++;
            }

            while (toBeSorted[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = toBeSorted[i];
                toBeSorted[i] = toBeSorted[j];
                toBeSorted[j] = temp;
                i++;
                j--;
            }

            if (start < j) {
                sort(toBeSorted, start, j);
            }

            if (end > i) {
                sort(toBeSorted, i, end);
            }
        }
    }
}
