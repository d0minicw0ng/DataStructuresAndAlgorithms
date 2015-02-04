package com.dominicwong.DataStructures.BinaryTree;

/**
 * Created by dominicwong on 4/2/15.
 */
public class BinarySearchTree {
    private TreeNode root;

    public void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    public TreeNode find(int data) {
        if (root != null) {
            root.find(data);
        }
        return null;
    }

    public void delete(int data) {

    }
}
