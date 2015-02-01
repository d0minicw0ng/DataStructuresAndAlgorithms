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

    public void deleteHead() {
        this.head = head.getNext();
    }

    public int length() {
        Node current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.getNext();
        }
        return length;
    }

    public Node search(int data) {
        Node current = head;
        while (current != null) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void appendLastNNodesToBeginningOfList(int n) {
        int length = length();
        if (head == null || length == 1 || n >= length) {
            return;
        }
        int targetNodeCount = length - n + 1;
        int currentCount = 1;
        Node current = head;
        Node newHead = null;
        Node tail = null;
        Node newTail = null;
        while (current != null) {
            if (currentCount == targetNodeCount - 1) {
                newTail = current;
            }
            if (currentCount == targetNodeCount) {
                newHead = current;
            }
            if (current.getNext() == null) {
                tail = current;
            }
            current = current.getNext();
            currentCount++;
        }
        tail.setNext(head);
        newTail.setNext(null);
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
