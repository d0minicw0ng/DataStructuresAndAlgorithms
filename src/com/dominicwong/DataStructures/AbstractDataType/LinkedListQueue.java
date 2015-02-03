package com.dominicwong.DataStructures.AbstractDataType;

import com.dominicwong.DataStructures.LinkedList.LinkedList;
import com.dominicwong.DataStructures.LinkedList.Node;

/**
 * Created by dominicwong on 3/2/15.
 */
public class LinkedListQueue {
    private LinkedList list = new LinkedList();

    public LinkedListQueue() {}

    public void enqueue(int data) {
        Node tail = list.getTail();
        if (tail == null) {
            list.insertHead(data);
        } else {
            Node newNode = new Node(data);
            tail.setNext(newNode);
        }
    }

    public Node dequeue() throws RuntimeException {
        Node head = list.getHead();
        if (head == null) {
            throw new RuntimeException("The queue is empty.");
        }
        list.deleteHead();
        return head;
    }
}
