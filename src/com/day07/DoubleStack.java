package com.day07;

public class DoubleStack {
    private int[] stack;

    // grows middle to left
    private int top1;
    // grows middle to right
    private int top2;

    public DoubleStack() {
        this.stack = new int[20];
        this.top1 = stack.length / 2 - 1;
        this.top2 = stack.length / 2;
    }

    public DoubleStack(int size) {
        this.stack = new int[size];
        this.top1 = stack.length / 2 - 1;
        this.top2 = stack.length / 2;
    }

    public boolean isEmpty1() {
        return this.top1 == stack.length / 2 - 1;
    }

    public boolean isEmpty2() {
        return this.top2 == stack.length / 2;
    }

    public void push1(int data) {
        if (this.top1 == -1) {
            System.out.println("Stack 1 is full");
            return;
        }
        stack[this.top1--] = data;
    }

    public void push2(int data) {
        if (this.top2 >= stack.length) {
            System.out.println("Stack 2 is full");
            return;
        }
        stack[this.top2++] = data;
    }

    public int pop1() {
        if (isEmpty1()) {
            System.out.println("Stack 1 is empty");
            return -1;
        }
        return stack[++this.top1];
    }

    public int pop2() {
        if (isEmpty2()) {
            System.out.println("Stack 2 is empty");
            return -1;
        }
        return stack[--this.top2];
    }

    public int peek1() {
        if (isEmpty1()) {
            System.out.println("Stack 1 is empty");
            return -1;
        }
        return stack[top1 + 1];
    }

    public int peek2() {
        if (isEmpty2()) {
            System.out.println("Stack 2 is empty");
            return -1;
        }
        return stack[top2 - 1];
    }

    public static void main(String[] args) {
        DoubleStack doubleStack = new DoubleStack(10);

        doubleStack.push1(10);
        doubleStack.push1(20);

        doubleStack.push2(10);
        doubleStack.push2(20);

        System.out.println("Top element of stack 1 is: " + doubleStack.peek1());
        System.out.println("Top element of stack 2 is: " + doubleStack.peek2());

        System.out.println("Popped element from stack 1 is: " + doubleStack.pop1());
        System.out.println("Popped element from stack 2 is: " + doubleStack.pop2());
        System.out.println("Popped element from stack 1 is: " + doubleStack.pop1());
        System.out.println("Popped element from stack 2 is: " + doubleStack.pop2());
        System.out.println("Popped element from stack 1 is: " + doubleStack.pop1());
        System.out.println("Popped element from stack 2 is: " + doubleStack.pop2());
        System.out.println("Popped element from stack 2 is: " + doubleStack.pop2());
        System.out.println("Popped element from stack 2 is: " + doubleStack.pop2());
        System.out.println("Popped element from stack 2 is: " + doubleStack.pop2());
        System.out.println("Popped element from stack 2 is: " + doubleStack.pop2());

    }

}
