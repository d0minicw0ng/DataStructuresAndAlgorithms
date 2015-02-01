package com.dominicwong.DataStructures.LinkedList;

/**
 * Created by dominicwong on 1/2/15.
 */
public class DoublyLinkedNode {
    private int data;
    private DoublyLinkedNode next;
    private DoublyLinkedNode prev;

    public DoublyLinkedNode (int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public DoublyLinkedNode getNext() {
        return this.next;
    }

    public DoublyLinkedNode getPrev() {
        return this.prev;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(DoublyLinkedNode next) {
        this.next = next;
    }

    public void setPrev(DoublyLinkedNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Data: " + this.data;
    }
}
