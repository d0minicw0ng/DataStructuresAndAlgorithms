package com.dominicwong.DataStructures.LinkedList;

/**
 * Created by dominicwong on 1/2/15.
 */
public class SortedLinkedList {
    private Node head;

    public void insert(int data) {
        Node current = head;
        Node newNode = new Node(data);

        // If the list is empty, head becomes newNode.
        if (current == null) {
            head = newNode;
            return;
        }

        // If the head is greater than data, head becomes newNode.
        if (current.getData() > data) {
            newNode.setNext(current);
            this.head = newNode;
            return;
        }

        while (current != null) {
            Node next = current.getNext();
            if (next != null && next.getData() > data) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                return;
            } else if (next == null) {
                // If we are hitting the end of the list, newNode becomes tail.
                current.setNext(newNode);
                return;
            }
            current = next;
        }
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
