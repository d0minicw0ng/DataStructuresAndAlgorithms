package com.dominicwong.DataStructures.LinkedList;

/**
 * Created by dominicwong on 1/2/15.
 */
public class DoublyLinkedList {
    private DoublyLinkedNode head;

    public void insertHead(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DoublyLinkedNode next = head;
        next.setPrev(newNode);
        newNode.setNext(next);
        this.head = newNode;
    }

    @Override
    public String toString() {
        String result = "{";
        DoublyLinkedNode current = this.head;
        while (current != null) {
            result += current.toString() + ", ";
            current = current.getNext();
        }
        result += "}";
        return result;
    }
}
