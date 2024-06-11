package com.day05;

public class LinkedList<T> {

    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(T first) {
        this.head = new Node<>(first);
    }

    Node<T> getHead() {
        return this.head;
    }

    public void appendNode(T data) {
        Node<T> newNode = new Node<>(data);

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

}
