/*Implement Doubly linked list and perform insertion operation at begining, at end and  at a given point using java.*/

package Day068;

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

public class InsertingDoublylinkedList {

	public static Scanner sc = new Scanner(System.in);
	private Node head = null;
	
	//Method for inserting new node to a doubly linked list.
	public void insert(int data) {
		Node newNode = new Node(); //Creating a new node.
		newNode.data = data;
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
			last.next = newNode; //Assigning last.next as  newNode.
			newNode.prev = last; //Assigning newNode.prev as last node.
		}
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node(); //Creating newNode.
		newNode.data = data; //Adding data into the newNode.
		Node firstNode = head; //Assigning head as first node.
		newNode.next = firstNode; //Assigning newNode.next as firstNode.
		firstNode.prev = newNode; //Assigning firstNode.prev as newNode.
		head = newNode; //Assigning newNode as head;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node(); //Creating newNode.
		Node currentNode = head; //Assigning head as current node.
		while(currentNode.next != null) {
			//Running loop till currentNode.next is not equals to null.
			currentNode = currentNode.next; //Assigning currentNode as currentNode.next in every iteration.
		}
		newNode.data = data; //Adding data into the newNode.
		currentNode.next = newNode; //Assigning currentNode.next as newNode.
		newNode.prev = currentNode; //Assigning newNode.prev as firstNode.
	}
	
	public void insertPosition(int pos, int data) {
		Node newNode = new Node();  //Creating newNode.
		Node currentNode = head; //assigning current node as head.
		for(int i = 1; i < pos - 1; i++) {
			//Running loop before the  giving position.
			currentNode= currentNode.next;
		}
		newNode.data=data; //Adding data into the newNode.
		Node nextNode = currentNode.next; //Assigning nextNode as currentNode.next.
		newNode.next = currentNode.next; //Assigning newNode.next as old currentNode.next.
		currentNode.next = newNode; //Assigning currentNode.next as newNode.
		newNode.prev = currentNode; //Assigning newNode.prev as currentNode.
		nextNode.prev = newNode; // Assigning nextNode.prev as newNode.
	}
	
	//Method for display the linked list.
		public void displayList() {
			System.out.println("List (first <--> last) ");
			Node current = head; //create current node and assigning as head.
			
			while(current != null) {
				//running the loop till current not equals to null.
				current.displayNode(); // Calling the displayNode() method.
				current = current.next;
			}
			System.out.println();
		}
	public static void main(String[] args) {
		
		InsertingDoublylinkedList list = new InsertingDoublylinkedList();	
		
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
		list.insertPosition(5, 45);
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
/*Current Node: 
List (first <--> last) 
 { 10 }  { 20 }  { 30 }  { 40 }  { 45 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
1. Insert at first.
2. Insert at end.
3. Insert at a given point.
Enter your choice: 1
Enter the data: 
5
List (first <--> last) 
 { 5 }  { 10 }  { 20 }  { 30 }  { 40 }  { 45 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } */


//TestCase2:
/*Current Node: 
List (first <--> last) 
 { 10 }  { 20 }  { 30 }  { 40 }  { 45 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
1. Insert at first.
2. Insert at end.
3. Insert at a given point.
Enter your choice: 2
Enter the data: 
110
List (first <--> last) 
 { 10 }  { 20 }  { 30 }  { 40 }  { 45 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 }  { 110 } 
*/


//Testcase3:
/*Current Node: 
List (first <--> last) 
 { 10 }  { 20 }  { 30 }  { 40 }  { 45 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
1. Insert at first.
2. Insert at end.
3. Insert at a given point.
Enter your choice: 3
Enter the data: 
45
Enter the position
5
List (first <--> last) 
 { 10 }  { 20 }  { 30 }  { 40 }  { 45 }  { 45 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
*/
