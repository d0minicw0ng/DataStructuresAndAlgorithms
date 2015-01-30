package com.dominicwong.DataStructures;

/**
 * Created by dominicwong on 30/1/15.
 */
public class MockArray {
    private int[] value;
    private int length;

    public MockArray(int[] value) {
        this.value = value;
        this.length = value.length;
    }

    public int[] getValue() {
        return this.value;
    }

    public int getLength() {
        return this.length;
    }

    public int indexOf(int data) {
        for (int i = 0; i < this.length; i++) {
            if (this.value[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean delete(int data) {
        int index = this.indexOf(data);
        if (index == -1) {
            return false;
        }

        int[] newValue = new int[this.length - 1];
        int i = 0;
        for (; i < index; i++) {
            newValue[i] = this.value[i];
        }
        i++;
        for (; i < this.length; i++) {
            newValue[i-1] = this.value[i];
        }

        this.value = newValue;
        this.length--;
        return true;
    }

    public int[] push(int data) {
        int[] newArray = new int[this.length + 1];
        for (int i = 0; i < this.value.length; i++) {
            newArray[i] = this.value[i];
        }
        newArray[this.length] = data;
        this.length++;
        this.value = newArray;
        return this.value;
    }
}
