package com.day07;

import com.day05.Node;

public class Stack<T> {
    private Node<T> top;

    public Node<T> getTop() {
        return top;
    }

    public Stack() {
        this.top = null;
    }

    public Stack(T data) {
        this.top = new Node<T>(data);
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(top);
        top = newNode;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = top.getData();
        top = top.getNext();
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return top.getData();
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());

        System.out.println("Pushing 40 to stack...");
        stack.push(40);
        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        stack.push(50);
        System.out.println("Popped element is: " + stack.pop());

    }

}
