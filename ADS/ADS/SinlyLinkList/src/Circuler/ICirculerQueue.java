package Circuler;
public interface ICirculer {
    boolean add(String element);
    String remove();
    int size();
    String toString();
}

public class ICirculerQueue implements ICirculer {
    private static final int MAX_SIZE = 10;
    private String[] queue;
    private int front;
    private int rear;
    private int currentSize;

    public ICirculerQueue() {
        this.queue = new String[MAX_SIZE];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    private boolean isEmpty() {
        return currentSize == 0;
    }

    private boolean isFull() {
        return currentSize == MAX_SIZE;
    }

    @Override
    public boolean add(String element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add " + element);
            return false;
        }

        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = element;
        currentSize++;
        return true;
    }

    @Override
    public String remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove element.");
            return null;
        }

        String removedElement = queue[front];
        front = (front + 1) % MAX_SIZE;
        currentSize--;
        return removedElement;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 0;
        int index = front;
        while (count < currentSize) {
            result.append(queue[index]).append(", ");
            index = (index + 1) % MAX_SIZE;
            count++;
        }
        return result.substring(0, result.length() - 2); // Remove the trailing comma and space
    }
}
