package model;
/**
 *
 * @author Jhon Alexis
 */
public class Node<E> {

    private String pais;

    private Node<E> left;
    private Node<E> right;

    public Node(String pais) {
        this.pais = pais;
        left = null;
        right = null;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public void insert(String pais) {
        if (pais.compareTo(Node.this.pais) < 0) {
            if (this.left != null) {
                this.left.insert(pais);
                } else {
                    System.out.println("Insertado " + pais + " a la izquierda de: " + this.pais);
                    this.left = new Node(pais);
                }
            } else if (pais.compareTo(Node.this.pais) > 0){
                if (this.right != null) {
                    this.right.insert(pais);
                } else {
                    System.out.println("Insertado " + pais + " a la derecha de: " + this.pais);
                    this.right = new Node(pais);
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
        System.out.println(pais);
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
        System.out.println(pais);
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
        System.out.println(pais);
    }

}

