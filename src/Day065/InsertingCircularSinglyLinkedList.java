/*Implement a Circular Singly linked list and perform insertion operation at beginning, at end and  at a given point.*/

package Day065;

import java.util.Scanner;

//Creating class for Nodes of the  linked list.
class Node {
	public int data;
	public Node next;
	
	//Method for display nodes of the linkedlist.
	public void displayNode() {
		System.out.print(" { " + data + " } ");
	}
}

public class InsertingCircularSinglyLinkedList {

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
			 
		 }
		 else {
			 tail.next = newNode;//tail will point to new node.
			 tail = newNode;//New node will become new tail.
			 tail.next = head;//now new taill will point head.
		 }
	}
	
	//Method for inserting node at begining.
	public void insertFirst(int data) {
		Node newNode = new Node(); //Creating  a new node.
		 newNode.data = data; //Adding data into the node.
		 tail.next = newNode; //now the tail will point the  new node.
		 newNode.next = head; //and the newNode point the  old head element.
		 head = newNode; //Now assigning the newNode as head.
	}
	
	//Method for inserting node at end.
	public void insertLast(int data) {
		Node newNode = new Node(); //Creating  a new node.
		newNode.data = data; //Adding data into the node.
		tail.next = newNode; //now the tail will point the  new node.
		newNode.next = head; //and the newNode point the  old head element.
		tail = newNode; //Now assigning the newNode as tail.
	}
	
	
	//Method for inserting new node at a giving point.
	public void insertPosition(int pos, int data) {
		Node newNode = new Node(); //Creating new node.
		Node currentNode = head; //assigning current node as head.
		
		for(int i = 1; i < pos - 1; i++) {
			//Running loop before the  giving position.
			currentNode = currentNode.next;
		}
		newNode.data = data; //adding data into the new node.
		newNode.next = currentNode.next; //Assigning newNode.next as old currentNode.next.
		currentNode.next = newNode; //Assigning currentNode.next as newNode.
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
		
		InsertingCircularSinglyLinkedList list = new InsertingCircularSinglyLinkedList();
		
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
		
		System.out.println("1. Insert at first." +
										"\n2. Insert at end." +
										"\n3. Insert at a given point.");
		
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: {
			System.out.println("Enter the data: ");
			int data = sc.nextInt();
			list.insertFirst(data);
			list.displayList();
			break;
		}
		case 2: {
			System.out.println("Enter the data: ");
			int data = sc.nextInt();
			list.insertLast(data);
			list.displayList();
			break;
		}
		case 3: {
			System.out.println("Enter the data: ");
			int data = sc.nextInt();
			System.out.println("Enter the position");
			int pos = sc.nextInt();
			list.insertPosition(pos, data);
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
// { 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
//1. Insert at first.
//2. Insert at end.
//3. Insert at a given point.
//Enter your choice: 1
//Enter the data: 
//5
//List (first --> last-->first) 
// { 5 }  { 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 


//TestCase2:
//Current Node: 
//List (first --> last-->first) 
// { 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
//1. Insert at first.
//2. Insert at end.
//3. Insert at a given point.
//Enter your choice: 2
//Enter the data: 
//110
//List (first --> last-->first) 
// { 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 }  { 110 } 


//TestCase3:
//Current Node: 
//List (first --> last-->first) 
// { 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
//1. Insert at first.
//2. Insert at end.
//3. Insert at a given point.
//Enter your choice: 3
//Enter the data: 
//45
//Enter the position
//5
//List (first --> last-->first) 
// { 10 }  { 20 }  { 30 }  { 40 }  { 45 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 


