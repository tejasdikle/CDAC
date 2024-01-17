package doublyLinkList;

import java.util.List;
import java.util.Scanner;

class DoublyLink {
	static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node() {
			data = 0;
			next = null;
			prev = null;
		}

		public Node(int val) {
			data = val;
			next = null;
			prev = null;
		}
	}

	private Node head;

	public DoublyLink() {
		head = null;
	}

	public void DisplayForword() {
		try {
			System.out.println("-------List---------");
			Node trav = head;
			while (trav != null) {
				System.out.println(trav.data);
				trav = trav.next;
			}
		} catch (Exception e) {
			System.out.println("Forword List is Empty");
		}
	}

	public void DisplayReverse() {
		try {
			System.out.println("rev list ");
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			while (trav != null) {
				System.out.println(trav.data);
				trav = trav.prev;
			}
		} catch (Exception e) {
			System.out.println(" Reverse List is Empty");
		}
	}

	private boolean isEmpty() {

		return head == null;
	}

	void addFirst(int val) {
		Node newNode = new Node(val);
		if (isEmpty()) {
			head = newNode;
		} else {

			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void addLast(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;

		} else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newNode;
			newNode.prev = trav;
		}

	}
	public void addAtPOs(int val ,int pos)
	{
		if(head==null || pos<=1) {
			addFirst(val);	
		}
		else
		{
			Node newNode=new Node(val);
			Node temp = null,trav = head;
			for(int i=1;i<pos-1;i++)
			{
				if(trav.next==null)
					break;
				trav=trav.next;
			}
		
			temp=trav.next;
			newNode.next=temp;
			newNode.prev=trav;
			trav.next=newNode;
			temp.prev=newNode;
					
		}
	}
	public int getMax() {
	    if (head == null) {
	        System.out.println("List is empty");
	    
	        return Integer.MIN_VALUE; 
	    }

	    int max = head.data;
	    Node trav = head.next;

	    while (trav != null) {
	        if (trav.data > max) {
	            max = trav.data;
	        }
	        trav = trav.next;
	    }

	    return max;
	}
	public int getMin() {
	    if (head == null) {
	        System.out.println("List is empty");
	        return Integer.MAX_VALUE; // Return the maximum integer value as a placeholder for an empty list
	    }

	    int min = head.data;
	    Node trav = head.next;

	    while (trav != null) {
	        if (trav.data < min) {
	            min = trav.data;
	        }
	        trav = trav.next;
	    }

	    return min;
	}
	
}

public class DoublyList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLink list = new DoublyLink();
		int val;
		boolean exit = false;
		while (!exit) {
			System.out.println("Choose below option \n1. Display\n2. Add First\n3. Add Last \n4. Add At Position\n5. GetMax\n6. GetMin\n7. Exit");

			switch (sc.nextInt()) {
			case 1:
				list.DisplayForword();
				list.DisplayReverse();
				break;
			case 2:
				System.out.println("Enter the value to insert at First");
				val = sc.nextInt();
				list.addFirst(val);
				System.out.println("Value added Succesfully");
				break;

			case 3:
				System.out.println("Enter the value to insert at last");
				val = sc.nextInt();
				list.addLast(val);
				System.out.println("Value added Succesfully");
				break;

			case 4:
				System.out.println("Enter the value to add at position");
				val=sc.nextInt();
				System.out.println("Enter the position");
				int pos=sc.nextInt();
				list.addAtPOs(val, pos);
				System.out.println("Added Successfully");
				break;
			case 5:
				list.getMax();
				System.out.println("max value :"+list.getMax());
				break;
			case 6:
				list.getMin();
				System.out.println("min value :"+list.getMin());
				break;
			
			case 7:
				System.out.println("Invalid option");
				exit = true;
				break;
			}
		}
	}
}
