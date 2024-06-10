public class LinkedList<T> {
    private Node<T> head;

    LinkedList() {
        this.head = null;
    }

    LinkedList(T first) {
        this.head = new Node<T>(first);
    }

    Node<T> getHead() {
        return this.head;
    }

    public void appendNode(T data) {
        Node<T> newNode = new Node<T>(data);

        Node<T> curNode = head;
        if (curNode == null) {
            this.head = newNode;
            return;
        }
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }

        curNode.setNext(newNode);
    }

    public void appendAfter(T val) {
        for (Node<T> curNode = this.head; curNode != null; curNode = curNode.getNext()) {
            if (curNode.getData() == val) {

            }
        }

    }

    public void printList() {

        for (Node<T> curNode = this.getHead(); curNode != null; curNode = curNode.getNext()) {
            System.out.print(curNode.getData() + " -> ");
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList<Integer>(1);
        L1.appendNode(3);
        L1.appendNode(5);

        LinkedList<String> L2 = new LinkedList<String>("hello");
        L2.appendNode("world");

        L1.printList();
        L2.printList();

    }
}

public class Node<T> {
    private T data;
    private Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public static void main(String[] args) {
        System.out.println("Node ka main");

    }

}
