package de.teleran.HomeWork_28_04;

class MyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public void pushToIndex(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prev = getNodeAtIndex(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    private Node getNodeAtIndex(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }



public void removeFirst() {
    if (head != null) {
        head = head.next;
        size--;
    }
}

public void removeLast() {
    if (head == null) {
        return;
    }
    if (head.next == null) {
        head = null;
    } else {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    size--;
}

public void removeAtIndex(int index) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index out of bounds");
    }
    if (index == 0) {
        removeFirst();
    } else {
        Node prev = getNodeAtIndex(index - 1);
        prev.next = prev.next.next;
        size--;
    }
}