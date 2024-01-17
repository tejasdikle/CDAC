package singlyList;

import java.util.Scanner;



class SinglyList {
	static class Node {
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}
	}

	public Node head;

	public SinglyList() {
		head = null;
	}

	void display() {
		System.out.println("------List------");
		Node trav = head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		// System.out.println("Empty list");
		System.out.println("---------------------");
	}

	void addFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}

	void addLast(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}
	}

	void AtPos(int pos, int val) {
	   
	    if (head == null || pos <= 1) {
	        addFirst(val);
	    } else if (pos == 0) {
	        throw new RuntimeException("Invalid Position");
	    } else 
	    {
	        Node newNode = new Node(val);
	        Node trav = head;

	        for (int i = 1; i < pos-1; i++) 
	        {
	            if (trav.next == null)
	                break;
	            trav = trav.next;
	        }
	        newNode.next = trav.next;
	        trav.next = newNode;
	    }
	}


	void delFirst() {
		if (head == null) {
			throw new RuntimeException("List is Empty");
		}
		head = head.next;

	}

	void delAtPos(int pos) {
		if(pos == 1)
			delFirst();
		if (head == null || pos<1) {
			throw new RuntimeException("List is Empty");
		}
		Node temp=null,trav=head;
		for (int i = 1; i < pos; i++) 
		{
			if(trav==null)
				throw new RuntimeException("Invalid Postion");
			temp=trav;
			trav=trav.next;

		}
		temp.next=trav.next;

	}

	void delAll() {
		head = null;
	}
	void delLast()
	{
		if(head==null)
			throw new RuntimeException("List empty");
		if(head.next==null)
			head=null;
		else
		{
			Node temp=null,trav=head;
			while(trav.next!=null)
			{
				temp=trav;
				trav=trav.next;
			}
			temp.next=null;
				
		}
	}
}

public class SinglyLinkList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SinglyList list = new SinglyList();
		boolean exit = false;
		int val, pos;
		while (!exit) {

			System.out.println(
					"Choose below option \n0.Display\n1.Add First \n2.Add Last \n3.Add at position\n"
					+ "4.Delete First\n5.Delete Last\n6.Delete at Position \n7.All Delete\n8.Exit");

			switch (sc.nextInt()) {

			case 0:
				list.display();
				break;
			case 1:
				System.out.println("Enter the new element to add first ");
				val = sc.nextInt();
				list.addFirst(val);
				System.out.println("Element added ");
				break;
			case 2:
				System.out.println("Enter the new element to add at last");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 3:
				System.out.println("Enter the element to add at position  ");
				val = sc.nextInt();
				System.out.println("Enter the position");
				pos = sc.nextInt();
				list.AtPos(pos, val);
				System.out.println("Added successfully");
				break;
			case 4:
				list.delFirst();
				System.out.println("First node Deleted succssfully");
				break;
			case 5:
				list.delLast();
				System.out.println("Last node Deleted succssfully");
				break;
			case 6:
				System.out.println("Enter the position to delete element");
				pos = sc.nextInt();
				list.delAtPos(pos);
				System.out.println("Deleted succssfully");
				break;
			case 7:
				list.delAll();
				System.out.println("Deleted all Node");
				break;

			case 8:
				exit = true;
				System.out.println("Exiting program.");
				break;
			default:
				System.out.println("Invalid option. Please choose again.");
			}
		}
		sc.close();
	}
}
