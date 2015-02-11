package com.dominicwong;

import com.dominicwong.sort.RadixSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,2,14,32,213,123,4,35,34,3,54,4,324,32,421,33,5073,43,43,12,4,325,324,1};
        RadixSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}