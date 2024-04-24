package de.teleran.HW_24_04;

public class MyQueue {
    private Node front;
    private Node rear;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public MyQueue() {
        front = null;
        rear = null;
    }

    public void push(int v) {
        Node newNode = new Node(v);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1; // или выбросить исключение
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
}
