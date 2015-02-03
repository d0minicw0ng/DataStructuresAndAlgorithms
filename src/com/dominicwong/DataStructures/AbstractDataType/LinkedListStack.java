package com.dominicwong.DataStructures.AbstractDataType;

import com.dominicwong.DataStructures.LinkedList.LinkedList;
import com.dominicwong.DataStructures.LinkedList.Node;

/**
 * Created by dominicwong on 3/2/15.
 */
public class LinkedListStack {
    private LinkedList list = new LinkedList();

    public LinkedListStack() {}

    public boolean isEmpty() {
        return this.list.getHead() == null;
    }

    public void push(int data) {
        if (isEmpty()) {
            this.list.insertHead(data);
        }

        Node newNode = new Node(data);
        Node current = this.list.getHead();
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public Node pop() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty.");
        }
        Node prev = this.list.getHead();
        Node current = prev.getNext();

        if (current == null) {
            this.list.deleteHead();
            return prev;
        }

        while (current.getNext() != null) {
            prev = prev.getNext();
            current = current.getNext();
        }
        prev.setNext(null);
        return current;
    }
}
