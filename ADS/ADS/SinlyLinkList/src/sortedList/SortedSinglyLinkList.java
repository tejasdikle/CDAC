package sortedList;

import java.util.List;
import java.util.Scanner;

class SortedSinglyLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public SortedSinglyLinkedList() {
        this.head = null;
    }

    // Operation 1: Add element X such that the list remains sorted
    public void add(int x) {
        Node newNode = new Node(x);

        if (head == null || x < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null && current.next.data < x) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Operation 2: Adds a given list of X to the current list such that the list remains sorted
    public void addAll(List<Integer> list) {
        for (int x : list) {
            add(x);
        }
    }

    // Operation 3: Remove element present at index i
    public void remove(int i) {
        if (head == null || i < 0) {
            return; // Invalid index or an empty list
        }

        if (i == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null && count < i - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            return; // Invalid index
        }

        current.next = current.next.next;
    }

    // Operation 4: Returns comma-separated elements from start to end
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;

        while (current != null) {
            result.append(current.data).append(", ");
            current = current.next;
        }

        // Remove the trailing comma and space
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        return result.toString();
    }
}



public class SortedSinglyLinkList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedSinglyLinkedList sortedList = new SortedSinglyLinkedList();

        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an operation:\n" +
                    "1. Add element\n" +
                    "2. Add a list of elements\n" +
                    "3. Remove element at index\n" +
                    "4. Display the list\n" +
                    "5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to add:");
                    int elementToAdd = scanner.nextInt();
                    sortedList.add(elementToAdd);
                    break;
                case 2:
                    System.out.println("Enter the number of elements add in the list:");
                    int numberOfElements = scanner.nextInt();
                    System.out.println("Enter the elements separated by spaces:");
                    for (int i = 0; i < numberOfElements; i++) {
                        int element = scanner.nextInt();
                        sortedList.add(element);
                    }
                    break;
                case 3:
                    System.out.println("Enter the index to remove:");
                    int indexToRemove = scanner.nextInt();
                    sortedList.remove(indexToRemove);
                    break;
                case 4:
                    System.out.println("Current List: " + sortedList);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }

        scanner.close();
    }
}
