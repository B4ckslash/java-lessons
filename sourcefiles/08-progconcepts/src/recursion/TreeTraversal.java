package recursion;

public class TreeTraversal {
    public static void main(String[] args) {
        BinaryNode root = initTree();
        printTree(root);
    }

    private static BinaryNode initTree() {
        BinaryNode<Float> leaf11, leaf12, child1, child2, root;
        leaf11 = new BinaryNode<>(13.37f);
        leaf12 = new BinaryNode<>(4.2f);
        child1 = new BinaryNode<>(7.89f, leaf11, leaf12);
        child2 = new BinaryNode<>(1.2f);
        root = new BinaryNode<>(1.5f, child1, child2);
        return root;

    }

    private static void printTree(BinaryNode root) {
        
    }
}
