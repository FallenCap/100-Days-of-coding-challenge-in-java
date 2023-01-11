/*Implement Stack using Linked list and also show the pop method, show the top, height and also print the stack in java.*/

package Day074;

import java.util.Scanner;

//Creating class Node for the Stcak.
class Node {
	int data;
	Node next;
}

public class PopStackUsingLinkedList {
	
	private Node top;
	private int height = 0;
	
	//Method for push function.
	public void push (int data) {
		Node newNode = new Node(); //Creating newNode.
		newNode.data = data; //Entering data into the node.
		if(height == 0) {
			//If the height is zero then we will assign newNode as top.
			top = newNode;
		}
		else {
			newNode.next = top; //newNode.next will point the old top.
			top = newNode; //Now the top will pont the  newNode.
		}
		height++; //For every node insertion the height will be increased by one.
		
	}
	
	//Method for pop function.
	public Node pop() {
		if(height == 0) {
			return null;
		}
		Node temp = top; //Assigning top as temp.
		top = top.next; // Now the top.next will point as top.
		temp.next = null; //temp.next noew point null.
		height--; //For every node deletion the height will be decreased by one.
		return temp;
	}
	
	//Method for print the stak.
	public void printStack() {
		Node temp = top; //Assigning top as temp.
		System.out.println("Stack:");
		do {
			//The loop will run until temp not equals to null.
			System.out.println("{" + temp.data + "}");
			temp = temp.next; //Assigning temp as temp.next.
		} while(temp != null);
	}
	
	//Method to show the top element.
	public void getTop() {
		System.out.println("\nTop: " +  top.data);
	}
	
	public void getHeight() {
		System.out.println("\nHeight: " + height);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		PopStackUsingLinkedList stack =  new PopStackUsingLinkedList();
		
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.printStack();
		
		System.out.print("How many times you want to pop element: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			stack.pop();
		}
		
		stack.getTop();
		stack.getHeight();
		
		stack.printStack();
		sc.close();
	}

}


//------------ Test Cases -----------

//TestCase1:
/*
Stack:
{9}
{8}
{7}
{6}
{5}
{4}
{3}
{2}
{1}
{0}
How many times you want to pop element: 3

Top: 6

Height: 7

Stack:
{6}
{5}
{4}
{3}
{2}
{1}
{0}
*/

//TestCase2:
/*
Stack:
{9}
{8}
{7}
{6}
{5}
{4}
{3}
{2}
{1}
{0}
How many times you want to pop element: 5

Top: 4

Height: 5
Stack:
{4}
{3}
{2}
{1}
{0}
*/