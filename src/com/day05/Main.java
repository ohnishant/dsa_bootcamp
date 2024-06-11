package com.day05;

/**
 * Main
 */
public class Main {

    public static void test() {
        System.out.println("Hello World");

    }

    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList<>(1);
        L1.appendNode(3);
        L1.appendNode(5);

        LinkedList<String> L2 = new LinkedList<>("hello");
        L2.appendNode("world");

        L1.printList();
        L2.printList();

    }
}
