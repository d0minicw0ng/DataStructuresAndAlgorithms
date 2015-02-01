package com.dominicwong.DataStructures.Array;

import java.util.Arrays;

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
        return value;
    }

    public int getLength() {
        return length;
    }

    public int indexOf(int data) {
        for (int i = 0; i < length; i++) {
            if (value[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int delete(int data) {
        int index = this.indexOf(data);
        if (index == -1) {
            return index;
        }

        int[] newValue = new int[length - 1];
        int i = 0;
        for (; i < index; i++) {
            newValue[i] = value[i];
        }
        i++;
        for (; i < length; i++) {
            newValue[i-1] = value[i];
        }

        value = newValue;
        length--;
        return index;
    }

    public int push(int data) {
        int[] newArray = new int[length + 1];
        for (int i = 0; i < value.length; i++) {
            newArray[i] = value[i];
        }
        newArray[length] = data;
        length++;
        value = newArray;
        return length - 1;
    }

    public String toString() {
        return Arrays.toString(value);
    }
}
