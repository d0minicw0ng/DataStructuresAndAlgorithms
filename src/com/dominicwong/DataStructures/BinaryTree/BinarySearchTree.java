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

    public TreeNode smallestNode() {
        if (root == null) {
            return null;
        }
        TreeNode current = root;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current;
    }

    public TreeNode largestNode() {
        if (root == null) {
            return null;
        }
        TreeNode current = root;
        while (current.getRight() != null) {
            current = current.getRight();
        }
        return current;
    }

    public void traversalInOrder() {
        if (root != null) {
            traversalInOrder(root);
        }
    }

    private void traversalInOrder(TreeNode node) {
        if (root.getLeft() != null) {
            traversalInOrder(root.getLeft());
        }
        System.out.println(node.getData());
        if (root.getRight() != null) {
            traversalInOrder(root.getRight());
        }
    }

    public void traversalPreOrder() {
        if (root != null) {
            traversalPreOrder(root);
        }
    }

    private void traversalPreOrder(TreeNode node) {
        System.out.println(node.getData());
        if (node.getLeft() != null) {
            traversalInOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            traversalInOrder(node.getRight());
        }
    }

    public void traversalPostOrder() {
        if (root != null) {
            traversalPostOrder(root);
        }
    }

    private void traversalPostOrder(TreeNode node) {
        if (node.getLeft() != null) {
            traversalInOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            traversalInOrder(node.getRight());
        }
        System.out.println(node.getData());
    }

    public int numberOfLeafNodes(TreeNode rootNode) {
        if (rootNode == null) {
            return 0;
        } else if (rootNode.getLeft() == null && rootNode.getRight() == null) {
            return 1;
        } else {
            return numberOfLeafNodes(rootNode.getLeft()) + numberOfLeafNodes(rootNode.getRight());
        }
    }
}
