package com.dominicwong.DataStructures.AbstractDataType;

/**
 * Created by dominicwong on 13/2/15.
 */
public class HashTable {
    private static final int TABLE_SIZE = 100;
    private Record[] tableData = new Record[TABLE_SIZE];
    private class Record {
        Object key;
        Object data;

        public Record(Object key, Object data) {
            this.key = key;
            this.data = data;
        }

        public Object getKey() {
            return key;
        }

        public Object getData() {
            return data;
        }
    }

    public void put(Object key, Object value) {
        int keyCode = key.hashCode();
        int step = 0;
        int slot = hash(keyCode, step);
        while (!isEmpty(slot)) {
            slot = hash(keyCode, ++step);
        }
        tableData[slot] = new Record(key, value);
    }

    public boolean keyExists(Object key) {
        int keyCode = key.hashCode();
        int step = 0;
        int slot = hash(keyCode, step);
        while (tableData[slot] != null && !tableData[slot].getKey().equals(key)) {
            slot = hash(keyCode, ++step);
        }
        if (tableData[slot] != null) {
            return true;
        } else {
            return false;
        }
    }

    public Object get(Object key) {
        int keyCode = key.hashCode();
        int step = 0;
        int slot = hash(keyCode, step);
        while (tableData[slot] != null && !tableData[slot].getKey().equals(key)) {
            slot = hash(keyCode, ++step);
        }
        if (tableData[slot] != null) {
            return tableData[slot].getData();
        } else {
            return null;
        }
    }

    private int hash(int key, int step) {
        if (step == 0) {
            return key % TABLE_SIZE;
        } else {
            return (key % TABLE_SIZE + step * step) % TABLE_SIZE;
        }
    }

    private boolean isEmpty(int slot) {
        return tableData[slot] == null;
    }

}