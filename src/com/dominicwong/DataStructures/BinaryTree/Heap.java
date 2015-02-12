package com.dominicwong.DataStructures.BinaryTree;

/**
 * Created by dominicwong on 12/2/15.
 */
public class Heap {
    private Integer[] heapData;
    private int currentPosition = -1;

    public Heap(int size) {
        this.heapData = new Integer[size];
    }

    public boolean isFull() {
        return currentPosition == heapData.length - 1;
    }

    public void insert(int item) {
        if (isFull()) {
            throw new RuntimeException("The heap is full");
        }
        heapData[++currentPosition] = item;
        fixUp(currentPosition);
    }

    public int deleteRoot() {
        int result = heapData[0];
        heapData[0] = heapData[currentPosition--];
        heapData[currentPosition+1] = null;
        fixDown(0, -1);
        return result;
    }

    private void fixDown(int index, int upTo) {
        if (upTo < 0) {
            upTo = currentPosition;
        }
        while (index <= upTo) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            if (leftChild <= upTo) {
                int childToSwap;
                if (rightChild > upTo) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = (heapData[leftChild] > heapData[rightChild] ? leftChild : rightChild);
                }

                if (heapData[index] < heapData[childToSwap]) {
                    int tmp = heapData[index];
                    heapData[index] = heapData[childToSwap];
                    heapData[childToSwap] = tmp;
                } else {
                    break;
                }
                index = childToSwap;
            } else {
                break;
            }
        }
    }

    private void fixUp(int index) {
        int i = (index - 1) / 2;
        while (i >= 0 && heapData[i] < heapData[index]) {
            int tmp = heapData[i];
            heapData[i] = heapData[index];
            heapData[index] = tmp;
            index = i;
            i = (index - 1) / 2;
        }
    }

    public void heapSort() {
        for (int i = 0; i < currentPosition; i++) {
            int tmp = heapData[0];
            heapData[0] = heapData[currentPosition-i];
            heapData[currentPosition-i] = tmp;
            fixDown(0, currentPosition - i - 1);
        }
    }

    public static Heap heapify(int[] data) {
        Heap heap = new Heap(data.length);
        for (int i = 0; i < data.length; i++) {
            heap.insert(data[i]);
        }
        return heap;
    }

}
