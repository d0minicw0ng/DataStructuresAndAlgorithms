package com.dominicwong;

import com.dominicwong.DataStructures.LinkedList.LinkedList;
import com.dominicwong.DataStructures.LinkedList.Node;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertHead(120);
        list.insertHead(12);
        list.insertHead(10);
        list.insertHead(20);
        list.insertHead(0);
        list.insertHead(130);
        list.insertHead(400);

        list.getTail().setNext(list.getHead());
        System.out.println(list.isCircular());

    }
}