package model;

public class Archivo {
    public static class Node<E> {

        private String archivo;

        private Node<E> left;
        private Node<E> right;

        public Node(String archivo) {
            this.archivo = archivo;
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

        public void insert(String archivo) {
            if (archivo.compareTo(Node.this.archivo) < 0) {
                if (this.left != null) {
                    this.left.insert(archivo);
                } else {
                    System.out.println("La carpeta " + archivo + "fue guardada a la izquierda " + this.archivo);
                    this.left = new Node(archivo);
                }
            } else if (archivo.compareTo(Node.this.archivo) > 0) {
                if (this.right != null) {
                    this.right.insert(archivo);
                } else {
                    System.out.println("La carpeta " + archivo + "fue guardada a la derecha " + this.archivo);
                    this.right = new Node(archivo);
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
            System.out.println(archivo);
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
            System.out.println(archivo);
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
            System.out.println(archivo);
        }
    }
}
