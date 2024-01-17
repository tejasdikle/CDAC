package QueueImpl;



public class Queue {
    private int[] queue;
    private int front, rear, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = 0;
    }

    public boolean isFull() {
        return rear == capacity;
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            queue[rear] = val;
            rear++;
        }
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int val = queue[front];
            front++;
            return val;
        }
    }

    public void display() {
        System.out.println("Queue");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return rear - front;
    }

    public int getMax() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot find maximum.");
            return -1;
        }

        int max = queue[front];
        for (int i = front + 1; i < rear; i++) {
            if (queue[i] > max) {
                max = queue[i];
            }
        }
        return max;
    }

    public int getMin() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot find minimum.");
            return -1;
        }

        int min = queue[front];
        for (int i = front + 1; i < rear; i++) {
            if (queue[i] < min) {
                min = queue[i];
            }
        }
        return min;
    }
}
