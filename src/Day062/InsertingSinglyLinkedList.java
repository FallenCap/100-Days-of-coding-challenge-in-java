/*Implement a Singly linked list and perform insertion operation at begining, at end and  at a given point.*/

package Day062;

import java.util.*;

//Creating class for Nodes of the  linked list.
class Node {
	public int data;
	public Node next;
	
	//Method for display nodes of the linkedlist.
	public void displayNode() {
		System.out.print("{" + data + "}-->");
	}
}

public class InsertingSinglyLinkedList {
	
public static Scanner sc = new Scanner(System.in);

private Node head;
	
	//Creating constructor of the class.
	public InsertingSinglyLinkedList() {
		
		head = null; //Declaring head as null.
	}
	
	//Method for inserting new node to a singly linked list.
	public void insert(int  data) {
		
		Node newNode = new Node(); //Creating  a  new Node.
		 newNode.data = data; //Entering data in the  new node.
		 
		 if(head == null) {
			 //if  head is null then the head will point  the new node.
			 head = newNode;
		 }
		 else {
			 //if head is not  null then the previous node point the new node.
			 
			 Node last = head; //Creating a  last node and  assigning it as head.
			 
			 while(last.next != null) {
				 //running the loop till last.next not equals to null.
				 
				 last = last.next;
			 }
			 last.next = newNode; //assigning last.next as a newNode.
		 }
	}
	
	//Method for inserting  element  first into the linked list.
	public void insertFirst(int data) {
		Node newNode = new Node(); //Creating new Node.
		
		newNode.data = data; //Inserting data into the new node.
		newNode.next = head; // assigning newNode.next as the old head element.
		 head = newNode; // Assigning head is equals to new node.
	}
	
	//Method to insert element at the last of the linked list.
	public void insertLast(int data) {
		Node newNode = new Node(); //Creating new node.
		Node currentNode = head; //assigning current node as head.
		
		while(currentNode.next != null) {
			//Running loop till currentNode.next is not equals to null.
			currentNode = currentNode.next; //Assigning currentNode as currentNode.next in every iteration.
		}
		newNode.data = data; //adding data into the new node.
		currentNode.next = newNode; //Now  currentNode.next pointing the new node.
		newNode.next = null; // Assigning newNode.next as null.
	}
	
	
	//Method for inserting new node at a giving point.
	public void insertPosition(int pos, int data) {
		Node newNode = new Node(); //Creating new node.
		Node currentNode = head; //assigning current node as head.
		
		for(int i = 0; i < pos - 1; i++) {
			//Running loop before the  giving position.
			currentNode = currentNode.next;
		}
		newNode.data = data; //adding data into the new node.
		newNode.next = currentNode.next; //Assigning newNode.next as old currentNode.next.
		currentNode.next = newNode; //Assigning currentNode.next as newNode.
	}
	
	//Method for display the linked list.
	public void displayList() {
		System.out.println("List (first --> last) ");
		Node current = head; //create current node and assigning as head.
		
		while(current != null) {
			//running the loop till current not equals to null.
			current.displayNode(); // Calling the displayNode() method.
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		InsertingSinglyLinkedList list = new InsertingSinglyLinkedList();
		
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
//List (first --> last) 
//{10}-->{20}-->{30}-->{40}-->{50}-->{60}-->{70}-->{80}-->{90}-->{100}-->
//1. Insert at first.
//2. Insert at end.
//3. Insert at a given point.
//Enter your choice: 1
//Enter the data: 
//5
//List (first --> last) 
//{5}-->{10}-->{20}-->{30}-->{40}-->{50}-->{60}-->{70}-->{80}-->{90}-->{100}-->


//TestCase2:
//Current Node: 
//List (first --> last) 
//{10}-->{20}-->{30}-->{40}-->{50}-->{60}-->{70}-->{80}-->{90}-->{100}-->
//1. Insert at first.
//2. Insert at end.
//3. Insert at a given point.
//Enter your choice: 2
//Enter the data: 
//105
//List (first --> last) 
//{10}-->{20}-->{30}-->{40}-->{50}-->{60}-->{70}-->{80}-->{90}-->{100}-->{105}-->


//TestCase3:
//Current Node: 
//List (first --> last) 
//{10}-->{20}-->{30}-->{40}-->{50}-->{60}-->{70}-->{80}-->{90}-->{100}-->
//1. Insert at first.
//2. Insert at end.
//3. Insert at a given point.
//Enter your choice: 3
//Enter the data: 
//55
//Enter the position
//5
//List (first --> last) 
//{10}-->{20}-->{30}-->{40}-->{50}-->{55}-->{60}-->{70}-->{80}-->{90}-->{100}-->