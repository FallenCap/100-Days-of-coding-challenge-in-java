/*Implement a Doubly linked list and perform deletion operation at beginning, at end and  at a given point.*/

package Day069;

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

public class DeletingDoublyLinkedList {

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
	
	//Method for deletinng the first node of the linked list.
	public void deleteFirst() {
		Node firstNode = head; //Assigning firstNode as head.
		head = firstNode.next; //Assigning head is equals to firstNode.next.
		head.prev = null; //Assigning gead.prev null.
	}
	
	//Method for deleting the last element from the linked list.
	public void deleteLast() {
		Node currentNode = head; //Assigning currentNode as head.
		while(currentNode.next.next != null) {
			//Running loop till currentNode.next.next is not equals to null.
			currentNode = currentNode.next; //Assigning currentNode as currentNode.next in every iteration.
		}
		currentNode.next = null; //Assigning currentNode.next as null.
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

		DeletingDoublyLinkedList list = new DeletingDoublyLinkedList();
		
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
/*Current Node: 
List (first <--> last) 
 { 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
1. Delete at first.
2. Delete at end.
3. Delete at a given point.
Enter your choice: 1
List (first <--> last) 
 { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
*/

//TestCase2:
/*Current Node: 
List (first <--> last) 
 { 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
1. Delete at first.
2. Delete at end.
3. Delete at a given point.
Enter your choice: 2
List (first <--> last) 
 { 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 } 
*/


//TestCase3:
/*Current Node: 
List (first <--> last) 
 { 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
1. Delete at first.
2. Delete at end.
3. Delete at a given point.
Enter your choice: 3
Enter the position:
3
List (first <--> last) 
 { 10 }  { 20 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 
*/