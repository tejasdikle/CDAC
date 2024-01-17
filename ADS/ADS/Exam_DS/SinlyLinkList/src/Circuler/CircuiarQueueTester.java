package Circuler;

import java.util.Scanner;

public class CircuiarQueueTester {

    public static void main(String[] args) {
    	CircuiarQueueTester circularQueue = new CircuiarQueueTester();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Display the queue");
            System.out.println("4. Display the size");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    String elementToAdd = scanner.next();
                    boolean added = circularQueue.add(elementToAdd);
                    if (added) {
                        System.out.println("Element added successfully.");
                    }
                    break;
                case 2:
                    String removedElement = circularQueue.remove();
                    if (removedElement != null) {
                        System.out.println("Removed element: " + removedElement);
                    }
                    break;
                case 3:
                    System.out.println("Queue: " + circularQueue.toString());
                    break;
                case 4:
                    System.out.println("Size of the queue: " + circularQueue.size());
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 0);

        scanner.close();
    }
}


