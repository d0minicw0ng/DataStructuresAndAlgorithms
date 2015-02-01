package com.dominicwong.DataStructures.Array;
import com.dominicwong.sort.InsertionSort;

import java.util.Arrays;

/**
 * Created by dominicwong on 30/1/15.
 */
public class OrderedArray {
    private int[] value;
    private int length;

    public OrderedArray(int[] value) {
        // NOTE: Just borrowing the sort from the InsertionSort class.
        this.value = InsertionSort.sort(value);
        this.length = value.length;
    }

    public int[] getValue() {
        return value;
    }

    public int getLength() {
        return length;
    }

    // Internally, it is a binary search.
    public int indexOf(int data) {
        int low = 0;
        int high = length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (value[mid] == data) {
                return mid;
            } else if (value[mid] > data) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int insert(int data) {
        int [] newValue = new int[length + 1];
        int i = 0;
        while (i < length && value[i] <= data) {
            newValue[i] = value[i];
            i++;
        }

        newValue[i] = data;
        int index = i;

        for (; i < length; i++) {
            newValue[i + 1] = value[i];
        }

        value = newValue;
        length++;
        return index;
    }

    public int delete(int data) {
        int index = indexOf(data);
        if (index >= 0) {
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
        }
        return index;
    }

    public String toString() {
        return Arrays.toString(value);
    }
}
