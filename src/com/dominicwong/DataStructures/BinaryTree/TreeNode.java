package com.dominicwong.DataStructures.BinaryTree;

/**
 * Created by dominicwong on 4/2/15.
 */
public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public int getData() {
        return data;
    }

    public TreeNode find(int data) {
        if (getData() == data) {
            return this;
        } else if (getData() > data && getLeft() != null) {
            getLeft().find(data);
        } else if (getRight() != null) {
            getRight().find(data);
        }
        return null;
    }

    public void insert(int data) {
        if (data >= getData()) {
            if (getRight() == null) {
                setRight(new TreeNode(data));
            } else {
                this.getRight().insert(data);
            }
        } else {
            if (getLeft() == null) {
                setLeft(new TreeNode(data));
            } else {
                this.getLeft().insert(data);
            }
        }
    }
}
