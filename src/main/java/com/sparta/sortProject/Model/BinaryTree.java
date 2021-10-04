package com.sparta.sortProject.Model;

public class BinaryTree {
    private Node root = null;

    public Node add(Node current, int nextValue) {
        if (current == null) {
            return new Node(nextValue);
        }

        if (nextValue <= current.nextValue) {
            current.left = add(current.left, nextValue);
        } else if (nextValue > current.nextValue) {
            current.right = add(current.right, nextValue);
        }
        return current;
    }

    public void adder(int nextValue) {
        root = add(root, nextValue);
    }


    public Node getRoot(){
        return root;
    }

    private class Node {
        private int nextValue;
        private Node left;
        private Node right;

        public Node(int nextValue) {
            this.nextValue = nextValue;
            this.left = null;
            this.right = null;
        }

        public int getValue() {
            return nextValue;
        }

        public void setValue(int nextValue) {
            this.nextValue = nextValue;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeftNode(com.sparta.sortProject.Model.BinaryTree.Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRightNode(com.sparta.sortProject.Model.BinaryTree.Node right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "nextValue=" + nextValue +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}