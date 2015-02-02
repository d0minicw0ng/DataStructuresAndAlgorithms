package com.dominicwong.DataStructures.AbstractDataType;

/**
 * Created by dominicwong on 2/2/15.
 */
public class Stack {
    private int top;
    private int maxSize;
    private int[] items;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.items = new int[maxSize];
        this.top = -1;
    }

    public void push(int data) {
        items[++top] = data;
    }

    public int pop() {
        return items[top--];
    }

    public int peek() {
        return items[top];
    }

    public boolean isEmpty() {
        return top == 1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
