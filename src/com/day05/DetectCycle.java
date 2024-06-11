package com.day05;

public class DetectCycle {
    public static void main(String[] args) {
        Node<Integer> commonNode = new Node<>(3);
        LinkedList<Integer> list = new LinkedList<>(1);
        list.appendNode(2);
        list.appendNode(commonNode);
        list.appendNode(4);
        list.appendNode(5);
        list.appendNode(5);
        list.appendNode(6);
        list.appendNode(commonNode);

        System.out.println(detectCycle(list.getHead()));

        LinkedList<String> list2 = new LinkedList<>("Wan");
        list.appendNode("Too");
        list.appendNode("Thri");
        list.appendNode("Fore");
        list.appendNode("Fvyy");

        System.out.println(detectCycle(list2.getHead()));
    }

    public static boolean detectCycle(Node<T> head) {
        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            System.out.println("Slow at: " + slow.getData() + " \t Fast at:" + fast.getData());

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

}
