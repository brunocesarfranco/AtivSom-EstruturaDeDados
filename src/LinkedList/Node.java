package LinkedList;

public class Node {
    private int data;
    private Node next;

    public Node(int d) {
        data = d;
        next = null;
    }

    public void setData(int d) {
        data = d;
    }

    public void setNext(Node n) {
        next = n;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
