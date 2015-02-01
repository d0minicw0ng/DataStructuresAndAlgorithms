package com.dominicwong.DataStructures.LinkedList;

/**
 * Created by dominicwong on 1/2/15.
 */
public class LinkedList {
    private Node head;

    public void insertHead(int data) {
        Node newHead = new Node(data);
        newHead.setNext(head);
        this.head = newHead;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;
        while (current != null) {
            result += current.toString() + ", ";
            current = current.getNext();
        }
        result += "}";
        return result;
    }
}
