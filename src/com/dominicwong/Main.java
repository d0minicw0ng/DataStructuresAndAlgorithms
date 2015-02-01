package com.dominicwong;

import com.dominicwong.CommonProblems.StringProblems;
import com.dominicwong.DataStructures.LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertHead(5);
        list.insertHead(10);
        list.insertHead(2);
        list.insertHead(30);
        System.out.println(list.toString());
    }
}