package QueueImpl;

import java.util.Scanner;

class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the count of elements from user to create the queue
        System.out.println("Enter the Size of Queue: ");
        int capacity = sc.nextInt();
        // Create the queue
        Queue queue = new Queue(capacity);
        boolean exit = false;
        while(!exit)
         {
        	 System.out.println("Enter your choice: ");
             
            System.out.println("----------------------------------");
            System.out.println("Queue Operations: ");
            System.out.println("1. Show queue");
            System.out.println("2. Store data in queue");
            System.out.println("3. D data from queue");
            System.out.println("4. Check the size of queue");
            System.out.println("5. Check if queue is full");
            System.out.println("6. Check if queue is empty");
            System.out.println("7. Get Max");
            System.out.println("8. Get Min");
            
            System.out.println("9. Exit");

           

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("-------------");
                    queue.display();
                    System.out.println("-------------");
                    break;

                case 2:
                    System.out.println("Enter the data to store: ");
                    int element = sc.nextInt();
                    System.out.println("-------------");
                    queue.enqueue(element);
                    System.out.println("-------------");
                    break;

                case 3:
                    int data = queue.dequeue();
                    if (data != -1) {
                        System.out.println("--------------------");
                        System.out.println("Data dequeued: " + data);
                        System.out.println("---------------------");
                    }
                    break;

                case 4:
                    System.out.println("---------------------------------");
                    System.out.println("Size of the queue: " + queue.size());
                    System.out.println("----------------------------------");
                    break;

                case 5:
                    System.out.println("----------------------------------");
                    System.out.println("Is queue full? " + queue.isFull());
                    System.out.println("----------------------------------");
                    break;

                case 6:
                    System.out.println("----------------------------------");
                    System.out.println("Is queue empty? " + queue.isEmpty());
                    System.out.println("----------------------------------");
                    break;
                case 7:
                	int max = queue.getMax();
                    if (max != -1) {
                        System.out.println("Maximum value in the queue: " + max);
                    }
                    break;
                case 8:
                	int min = queue.getMin();
                    if (min != -1) {
                        System.out.println("Minimum value in the queue: " + min);
                    }
                    break;

                case 9:
                    System.out.println("----------------------------------");
                    System.exit(0);
                    System.out.println("----------------------------------");
                    break;

                default:
                    System.out.println("----------------------------------");
                    System.out.println("Invalid choice");
                    System.out.println("----------------------------------");
            }
        }
        sc.close();
    }
}
