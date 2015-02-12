package com.dominicwong.DataStructures.BinaryTree;

/**
 * Created by dominicwong on 12/2/15.
 */
public class MinHeap {
    private Integer[] heapData;
    private int currentPosition = -1;

    public MinHeap(int size) {
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
        fixDown(0);
        return result;
    }

    public void fixDown(int index) {
        while (index <= currentPosition) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            if (leftChild <= currentPosition) {
                int childToSwap;
                if (rightChild > currentPosition) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = (heapData[leftChild] > heapData[rightChild] ? heapData[rightChild] : heapData[leftChild]);
                }

                if (heapData[index] > heapData[childToSwap]) {
                    int tmp = heapData[index];
                    heapData[index] = heapData[childToSwap];
                    heapData[childToSwap] = heapData[index];
                } else {
                    break;
                }
                index = childToSwap;
            } else {
                break;
            }
        }
    }

    public void fixUp(int index) {
        int i = (index - 1) / 2;
        while (i >= 0 && heapData[i] > heapData[index]) {
            int tmp = heapData[i];
            heapData[i] = heapData[index];
            heapData[index] = heapData[i];
            index = i;
            i = (index - 1) / 2;
        }
    }
}
