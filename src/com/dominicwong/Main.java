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

        list.deleteNode(new Node(0));
        list.deleteNode(new Node(120));
        list.deleteNode(new Node(10));
        list.deleteNode(new Node(20));
        list.deleteNode(new Node(130));

        System.out.println(list.toString());

    }
}