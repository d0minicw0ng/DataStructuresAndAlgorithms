package com.dominicwong.DataStructures.AbstractDataType;

import javax.management.relation.RoleUnresolved;

/**
 * Created by dominicwong on 3/2/15.
 */
// NOTE: TwoStacks is a data structure that implements two stacks in one array.
public class TwoStacks {
    private int[] items;
    private int size;
    private int headOne;
    private int headTwo;

    public TwoStacks(int size) {
        this.items = new int[size];
        this.size = size;
        this.headOne = -1;
        this.headTwo = size;
    }

    public void pushOne(int data) {
        if (headTwo - headOne == 1) {
            throw new RuntimeException("The stack is full.");
        }
        items[++headOne] = data;
    }

    public void pushTwo(int data) {
        if (headTwo - headOne == 1) {
            throw new RuntimeException("The stack is full.");
        }
        items[--headTwo] = data;
    }

    public int popOne() {
        if (headOne < 0) {
            throw new RuntimeException("The stack is empty.");
        }
        return items[headOne--];
    }

    public int popTwo() {
        if (headTwo > size - 1) {
            throw new RuntimeException("The stack is empty.");
        }
        return items[headTwo++];
    }
}
