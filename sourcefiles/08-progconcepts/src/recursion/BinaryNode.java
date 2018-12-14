package recursion;

public class BinaryNode<T> {
    private BinaryNode left, right;
    private T data;

    public BinaryNode(T data) {
        if(data == null) throw new IllegalArgumentException();
        this.data = data;
    }

    public BinaryNode(T data, BinaryNode<T> left) {
        this(data);
        this.left = left;
    }

    public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
        this(data, left);
        this.right = right;
    }

    public BinaryNode getLeftChild() {
        return this.left;
    }

    public BinaryNode getRightChild() {
        return this.right;
    }

    public T getData() {
        return this.data;
    }

    public void setLeftChild(BinaryNode newLeftChild) {
        this.left = newLeftChild;
    }

    public void setRightChild(BinaryNode newRightChild) {
        this.right = newRightChild;
    }

    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }
}
