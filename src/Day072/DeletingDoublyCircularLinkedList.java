/*Implement a Doubly Circular linked list and perform deletion operation at beginning, at end and  at a given point.*/


package Day072;

import java.util.Scanner;

//Creating class for Nodes of the  linked list.
class Node {
	public int data;
	public Node next;
	public Node prev;
	
	//Method for display nodes of the linkedlist.
	public void displayNode() {
		System.out.print(" { " + data + " } ");
	}
}

public class DeletingDoublyCircularLinkedList {
	
	public static Scanner sc = new Scanner(System.in);
	private Node head;
	private Node tail;
	
	//Method for inserting new node to a singly linked list.
	public void insert(int  data) {
		
		Node newNode = new Node(); //Creating  a  new Node.
		 newNode.data = data; //Entering data in the  new node.
		 
		 if(head == null) {
			 //if  head is null then the head will point  the new node.
			 head = newNode;
			 tail = newNode;
			 newNode.next = head;
			 newNode.prev = head;
			 
		 }
		 else {
			 tail.next = newNode;//tail will point to new node.
			 newNode.prev = tail; //newNode.prev will point the tail.
			 tail = newNode;//New node will become new tail.
			 tail.next = head;//now new taill will point head.
			 head.prev = tail; //head.prev will point the tail.
		 }
	}
	
	//Method to delete the first node of the linked list.
	public void deleteFirst() {
		Node firstNode = head; //Assigning head as first node.
		tail.next = firstNode.next; //Assigning tail.next as firstNode.next.
		head = firstNode.next;//Assigning firstNode.next as head.
		head.prev = tail; //head.prev will point the tail.
	}
	
	//Method to delete the last node of the linked list.
	public void deleteLast() {
		Node lastNode = tail.prev; //Assigning tail.prev as lastNode.
		lastNode.next = head; //lastNode.next will point the head.
		head.prev = lastNode; //head.prev will point the lastNode.
		
	}
	
	//Method to delete node from a given position.
	public void deletePosition(int pos) {
			Node currentNode = head; //Assigning currentNode as head.
			
			for(int i = 1 ; i < pos - 1; i++) {
				//running the loop to the given position
				currentNode = currentNode.next; //Assigning currentNode as currentNode.next in every iteration.
			}
			Node nextNode = currentNode.next.next; //Assigning nextNode as currentNode.next.next
			currentNode.next = nextNode; //Now the currentNode.next will point the nextNode.
			nextNode.prev = currentNode; //Now the  nextNode.prev will point the currentNode.
	}
	
	//Method for display the linked list.
	public void displayList() {
		System.out.println("List (first --> last-->first) ");
		Node current = head; //create current node and assigning as head.
		do {
			//running the loop till current not equals to null.
			current.displayNode(); // Calling the displayNode() method.
			current = current.next;
		}while(current != head);
		
		System.out.println();
	}

	public static void main(String[] args) {

		DeletingDoublyCircularLinkedList list = new DeletingDoublyCircularLinkedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.insert(70);
		list.insert(80);
		list.insert(90);
		list.insert(100);
		System.out.println("Current Node: ");
		list.displayList();
		
		System.out.println("1. Delete at first." +
				"\n2. Delete at end." +
				"\n3. Delete at a given point.");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: {
		list.deleteFirst();
		list.displayList();
		break;
		}
		case 2: {
		list.deleteLast();
		list.displayList();
		break;
		}
		case 3: {
		System.out.println("Enter the position:");
		int pos = sc.nextInt();
		list.deletePosition(pos);
		list.displayList();
		break;
		}
		default: System.out.println("Wrong choice.");
		}
	}

}


//------------ Test Cases -----------

//TestCase1:
//Current Node: 
//List (first --> last-->first) 
//{ 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
//1. Delete at first.
//2. Delete at end.
//3. Delete at a given point.
//Enter your choice: 1
//List (first --> last-->first) 
//{ 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 


//TestCase2:
//Current Node: 
//List (first --> last-->first) 
//{ 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
//1. Delete at first.
//2. Delete at end.
//3. Delete at a given point.
//Enter your choice: 2
//List (first --> last-->first) 
//{ 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 } 


//TestCase3:
//Current Node: 
//List (first --> last-->first) 
//{ 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
//1. Delete at first.
//2. Delete at end.
//3. Delete at a given point.
//Enter your choice: 3
//Enter the position:
//4
//List (first --> last-->first) 
//{ 10 }  { 20 }  { 30 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
