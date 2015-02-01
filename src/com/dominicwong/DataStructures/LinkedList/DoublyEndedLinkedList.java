package com.dominicwong.DataStructures.LinkedList;

/**
 * Created by dominicwong on 1/2/15.
 */
public class DoublyEndedLinkedList {
    private Node head;
    private Node tail;

    public void insertTail(int data) {
        Node newTail = new Node(data);
        if (head == null) {
            this.head = tail;
        }

        if (tail != null) {
            this.tail.setNext(newTail);
        }
        this.tail = newTail;
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
