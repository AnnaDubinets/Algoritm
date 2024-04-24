package de.teleran.HW_24_04;

public class MyStack {
    //Реализация класса MyStack на Java и JavaScript

    private int[] stack;
    private int top;

    public MyStack(int maxSize) {
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int v) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = v;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1; // или выбросить исключение
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

