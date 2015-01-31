package com.dominicwong;

import com.dominicwong.CommonProblems.StringProblems;
import com.dominicwong.DataStructures.MockArray;
import com.dominicwong.DataStructures.OrderedArray;
import com.dominicwong.search.BinarySearch;
import com.dominicwong.sort.InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String str = "aa";
        System.out.println(StringProblems.hasUniqueCharsLinear(str));
        //        int[] unsortedArray = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            unsortedArray[i] = random.nextInt(100);
//        }
//
//        int[] a = {234,241,4124,213,121,3,123,1231};
//        OrderedArray arr = new OrderedArray(a);
//        System.out.println(arr.toString());
//        arr.insert(10);
//        arr.insert(50);
//        arr.insert(60);
//        System.out.println(arr.toString());
//        arr.delete(arr.getValue()[4]);
//        System.out.println(arr.toString());
//        System.out.println("The result is:");
//        System.out.println(Arrays.toString(sortedArray));
    }
}