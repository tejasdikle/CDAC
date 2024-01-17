package com.circular;

import java.util.Scanner;

public class Main
{   public static void main(String[] args)

{
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the size of the circular queue: ");
       int size = scanner.nextInt();
       System.out.println("-----------------------");

       CircularQueue queue = new CircularQueue(size);

       int choice;
       do {
           System.out.println("1. Enqueue");
           System.out.println("2. Dequeue");
           System.out.println("3. Show queue");
           System.out.println("4. Size of queue");
           System.out.println("5. Is queue empty?");
           System.out.println("6. Is queue full?");
           System.out.println("7. Exit");
           System.out.println("Enter your choice: ");

           choice = scanner.nextInt();
           System.out.println("----------------------------------");

           switch (choice) {
               case 1:
                   System.out.println("Enter the data to enqueue: ");
                   int data = scanner.nextInt();
                   System.out.println("----------------------------------");
                   queue.enqueue(data);
                   System.out.println("----------------------------------");
                   break;
               case 2:
                   int dequeuedData = queue.dequeue();
                   if (dequeuedData != -1) {
                        System.out.println("----------------------------------");
                       System.out.println("The dequeued data is: " + dequeuedData);
                       System.out.println("----------------------------------");
                   }
                   break;
               case 3:
                   queue.show();
                   break;
               case 4:
                   int size1 = queue.size();
                   System.out.println("----------------------------------");
                   System.out.println("The size of the queue is: " + size1);
                   System.out.println("----------------------------------");
                   break;
               case 5:
                   boolean isEmpty = queue.isEmpty();
                   System.out.println("----------------------------------");
                   System.out.println("Is queue empty?: " + isEmpty);
                   System.out.println("----------------------------------");
                   break;
               case 6:
                   boolean isFull = queue.isFull();
                   System.out.println("----------------------------------");
                   System.out.println("Is queue full?: " + isFull);
                   System.out.println("----------------------------------");
                   break;
               default:
                    System.out.println("----------------------------------");
                   System.out.println("Invalid choice");
                   System.out.println("----------------------------------");
           }
       } while (choice != 7);
   }
}
