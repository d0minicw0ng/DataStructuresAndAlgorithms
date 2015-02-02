package com.dominicwong.DataStructures.AbstractDataType;

/**
 * Created by dominicwong on 2/2/15.
 */
public class Queue {
    private Object[] items;
    private int head = 0;
    private int tail = 0;
    private int capactiy;
    private int size = 0;

    public Queue(int size) {
        this.capactiy = size;
        this.items = new Object[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capactiy;
    }

    public void enqueue(Object data) throws RuntimeException {
        if (isFull()) {
            throw new RuntimeException("The queue is full");
        } else {
            items[tail] = data;
            tail = (tail + 1) % capactiy;
            size++;
        }
    }

    public Object dequeue() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("The queue is empty");
        } else {
            Object data = items[head];
            items[head] = null;
            head = (head + 1) % capactiy;
            size--;
            return data;
        }
    }

}
