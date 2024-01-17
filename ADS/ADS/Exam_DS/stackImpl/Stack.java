package stackImpl;

import java.util.Scanner;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() 
    {
    	
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        }
        else {
            stackArray[++top] = value;
            System.out.println(value + " pushed successfully");
        }
    }

    public void pop() {
        if (top == -1)
            System.out.println("Stack is Empty. Cannot pop");
        else {
            int value = stackArray[top--];
            System.out.println(value + " popped successfully");
        }
    }

    public void display() 
    {
        if (top == -1)
            System.out.println("Stack is Empty");
        else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }
    public void isFull(int maxSize )
    {
    	
    	
    }
}
