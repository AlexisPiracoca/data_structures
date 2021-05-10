package USTA.modelo;

import java.util.List;

public class Node<E>{

    private int value;

    private Node<E> left;
    private Node<E> right;

    public Node(int value){
        this.value = value;
        left = null;
        right = null;
    }

    public Node<E> getLeft() {
        return left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public void insert(int value) {
        if (value < this.value)
        {
            if (this.left != null)
            {
                this.left.insert(value);
            } else
            {
                System.out.println(" Inserted " + value + " to left of " + this.value);
                this.left = new Node(value);
            }
        } else if (value > this.value)
        {
            if (this.right != null) {
                this.right.insert(value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + this.value);
                this.right = new Node(value);
            }
        }
    }

    public int size() {
        int size = 1;
        if (left != null) {
            size += left.size();
        }
        if (right != null) {
            size += right.size();
        }
        return size;
    }

    public int height() {
        int hl = -1;
        int hr = -1;
        if (left != null) {
            hl = left.height();
        }
        if (right != null) {
            hr = right.height();
        }
        return 1 + Math.max(hl, hr);
    }

    public void preorder() {
        System.out.println(value);
        if (left != null) {
            left.preorder();
        }
        if (right != null) {
            right.preorder();
        }
    }

    public void inorder() {
        if (left != null) {
            left.inorder();
        }
        System.out.println(value);
        if (right != null) {
            right.inorder();
        }
    }

    public void postorder() {
        if (left != null) {
            left.postorder();
        }
        if (right != null) {
            right.postorder();
        }
        System.out.println(value);
    }
}
