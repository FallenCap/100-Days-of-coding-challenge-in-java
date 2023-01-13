/*Implement Queue using Linked list and also show the dequeue method, show the first, last element, height and also print the queue in java.*/


package Day076;

import java.util.Scanner;

//Creating class node for 
class Node {
	int data;
	Node next;
}

public class DequeueQueueLinkedList {

	private Node first;
	private Node last;
	private int length = 0;
	
	//Method for enqueue from the Queue.
	public void enqueue(int data) {
		Node newNode = new Node(); //Creating newNode.
		newNode.data = data; //Entering data into the node.
		
		if(length == 0) {
			//If the length is zero then we will assign newNode as first and also last.
			first = newNode;
			last = newNode;
		}
		else {
			last.next = newNode; //last.next will point the newNode.
			last = newNode; //Now the newNode will be assigned as last.
		}
		length++;
	}
	
	//Method for dequeue from the queue.
	public Node dequeue() {
		if(length == 0 ) {
			//if the length is 0 then it will return null.
			return null;
		}
		Node temp = first; //Assigning first as temp.
		if(length == 1) {
			//if the length is 1 then the first and last are assigned 1.
			first = null;
			last = null;
		}
		else {
			first = first.next; //first.next will assigned as first.
			temp.next = null; //tem.next will point null.
		}
		length--; //For every node deletion the length will be decreased by one.
		return temp;
	}
	
	public void printQueue() {
		Node temp = first; //Assigning first as temp.
		System.out.println("\nQueue: ");
		do {
			//The loop will run until temp not equals to null.
			System.out.print("{" + temp.data + "}-->");
			temp = temp.next; //Assigning temp as temp.next.
		} while(temp != null);
	}
	
	//Method to show the first element.
	public void getFirst() {
		System.out.println("\nFirst: " + first.data);
	}
	
	//Method to show the last element.
	public void getLast() {
		System.out.println("\nLast: " + last.data);
	}
	
	//Method to show the length of the queue.
	public void getLength() {
		System.out.println("\nLength: " + length);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DequeueQueueLinkedList queue = new DequeueQueueLinkedList();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(10);
		queue.printQueue();
		
		System.out.print("\nHow many times you want to pop element: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			queue.dequeue();
		}
		
		queue.getFirst();
		queue.getLast();
		queue.getLength();
		
		queue.printQueue();
		
		sc.close();
	}

}


//------------ Test Cases -----------


//TestCase1:
/*
Queue: 
{1}-->{2}-->{3}-->{4}-->{5}-->{6}-->{7}-->{8}-->{9}-->{10}-->
How many times you want to pop element: 4

First: 5

Last: 10

Length: 6

Queue: 
{5}-->{6}-->{7}-->{8}-->{9}-->{10}-->
*/


//TestCase2:
/*
Queue: 
{1}-->{2}-->{3}-->{4}-->{5}-->{6}-->{7}-->{8}-->{9}-->{10}-->
How many times you want to pop element: 7

First: 8

Last: 10

Length: 3

Queue: 
{8}-->{9}-->{10}-->
*/