package com.dominicwong;

import com.dominicwong.sort.MergeSort;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[] { 1,214,1241,421,8798,124,1,434,5,34,231,5,436,46,534,24543 };
        MergeSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}