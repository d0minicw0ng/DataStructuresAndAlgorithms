package com.dominicwong.DataStructures.AbstractDataType;

/**
 * Created by dominicwong on 3/2/15.
 */
public class DoubleEndedQueue {
    private Object[] items;
    private int head = 0;
    private int tail = 0;
    private int capacity;
    private int size = 0;

    public DoubleEndedQueue(int size) {
        this.capacity = size;
        this.items = new Object[size];
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertRight(Object data) throws RuntimeException {
        if (isFull()) {
            throw new RuntimeException("The queue is full.");
        }
        size++;
        tail = (tail + 1) % capacity;
        items[tail] = data;
    }

    public void insertLeft(Object data) throws RuntimeException {
        if (isFull()) {
            throw new RuntimeException("The queue is full.");
        }
        size++;
        head--;
        if (head == -1) {
            head = capacity - 1;
        }
        items[head] = data;
    }

    public Object deleteLeft() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("The queue is empty.");
        }
        size--;
        Object data = items[head];
        items[head] = null;
        head = (head + 1) % capacity;
        return data;
    }

    public Object deleteRight() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("The queue is empty.");
        }
        size--;
        Object data = items[tail];
        items[tail] = null;
        tail--;
        if (tail == -1) {
            tail = capacity - 1;
        }
        return data;
    }
}
