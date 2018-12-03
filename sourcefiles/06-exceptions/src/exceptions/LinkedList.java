package exceptions;

public class LinkedList {

    public static void main(String[] args) {
        Node head;
        Node node1, node2;

        head = null;
        node1 = new Node();
        node2 = new Node();

        node1.setData(1);
        node1.setNext(node2);
        node2.setData(2);

        printList(head);
    }

    private static class Node {
        private int data;
        private Node next;

        private void setData(int data) {
            this.data = data;
        }

        private void setNext(Node next) {
            this.next = next;
        }

        private int getData() { return data; }

        private Node getNext() { return this.next; }
    }

    private static void printList(Node head) {
        System.out.println(head.getData());
        if(head.getNext() == null) return;
        printList(head.getNext());
    }
}
