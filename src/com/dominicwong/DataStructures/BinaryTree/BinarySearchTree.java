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
        if (root == null) {
            return;
        }

        TreeNode current = root;
        TreeNode parent = root;
        boolean isLeftChild = false;

        while (current != null && current.getData() != data) {
            parent = current;
            if (data < current.getData()) {
                current = current.getLeft();
                isLeftChild = true;
            } else {
                current = current.getRight();
                isLeftChild = false;
            }
        }

        if (current == null) {
            return;
        }

        if (current.getLeft() == null && current.getRight() == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
            }
        } else if (current.getLeft() == null) {
            if (current == root) {
                root = current.getRight();
            } else if (isLeftChild) {
                parent.setLeft(current.getRight());
            } else {
                parent.setRight(current.getRight());
            }
        } else if (current.getRight() == null) {
            if (current == root) {
                root = current.getLeft();
            } else if (isLeftChild) {
                parent.setLeft(current.getLeft());
            } else {
                parent.setRight(current.getLeft());
            }
        } else {
            TreeNode parentOfSuccessor = current.getRight();
            TreeNode successor = current.getRight();

            // If the successor has no left node...
            // NOTE: This is the correct procedure, correct?
            // Otherwise the deleted node's left child node will
            // be detached from the binary tree.
            if (successor.getLeft() == null) {
                parent.setRight(successor);
                successor.setLeft(current.getLeft());
                return;
            }

            while (successor.getLeft() != null) {
                parentOfSuccessor = successor;
                successor = successor.getLeft();
            }
            current.setData(successor.getData());
            parentOfSuccessor.setLeft(null);
        }
    }
}
