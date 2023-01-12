/*Implement Queue using Linked list and also show the enqueue method, show the first, last element, height and also print the queue in java.*/

package Day075;

import java.util.Scanner;

//Creating class node for 
class Node {
	int data;
	Node next;
}

public class EnqueueQueueLinkedList {
	
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
		
		EnqueueQueueLinkedList queue = new EnqueueQueueLinkedList();
		
		System.out.print("How many time you want to enqueue the queue: ");
		int n = sc.nextInt();
		
		System.out.println("\nEnter the datas: ");
		for(int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			queue.enqueue(a);
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
How many time you want to enqueue the queue: 5

Enter the datas: 
1
2
3
4
5

First: 1

Last: 5

Length: 5

Queue: 
{1}-->{2}-->{3}-->{4}-->{5}-->
*/

//TestCase2:
/*How many time you want to enqueue the queue: 10

Enter the datas: 
1
2
3
4
5
6
7
8
9
10

First: 1

Last: 10

Length: 10

Queue: 
{1}-->{2}-->{3}-->{4}-->{5}-->{6}-->{7}-->{8}-->{9}-->{10}-->*/