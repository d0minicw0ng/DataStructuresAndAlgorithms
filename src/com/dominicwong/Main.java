package com.dominicwong;


import com.dominicwong.sort.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,41,2,43,5,43,5,4645,34,324,2,53412,1,324423,4324,3};
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}