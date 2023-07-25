package ru.zagalskij.api.homework4;

import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public MyQueue() {
    }

    public MyQueue(LinkedList linkedList) {
        this.elements = linkedList;
    }


    public void enqueue(T element) {
        elements.addLast(element);
    }

    public T dequeue() {
        if (!elements.isEmpty()) {
            return elements.removeFirst();
        }
        throw new IllegalStateException("Queue is empty");
    }

    public T first() {
        if (!elements.isEmpty()) {
            return elements.getFirst();
        }
        throw new IllegalStateException("Queue is empty");
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}