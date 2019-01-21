package Generics;

public class Node<T> {
    private T data;
    private Node<T> leftChild, rightChild;

    public Node(T data, Node<T> leftChild, Node<T> rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public boolean isLeaf() {
        return this.rightChild == null && this.leftChild == null;
    }

    public Node<T> getLeftChild() {
        return this.leftChild;
    }
    public Node<T> getRightChild() { return this.rightChild; }
}
