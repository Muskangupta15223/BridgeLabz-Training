package com.trafficmanager;

class VehicleQueue {

    private int[] queue;
    private int front = -1, rear = -1;
    private int capacity;

    VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int id) {

        if (isFull()) {
            System.out.println("Queue Overflow! Vehicle " + id + " cannot wait");
            return;
        }

        if (isEmpty())
            front = 0;

        queue[++rear] = id;
        System.out.println("Vehicle " + id + " added to waiting queue");
    }

    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return -1;
        }

        int id = queue[front++];

        if (front > rear)
            front = rear = -1;

        return id;
    }

    public boolean hasWaiting() {
        return !isEmpty();
    }
}

