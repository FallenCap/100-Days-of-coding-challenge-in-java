/*Implement Stack using Linked list and also show the push method, show the top, height and also print the stack in java.*/

package Day073;

import java.util.Scanner;

//Creating class Node for the Stack.
class Node {
	int data;
	Node next;
}

public class StackUsingLinkedList {
	
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
	
	//Method for print the stack.
	public void printStack() {
		Node temp = top; //Assigning top as temp.
		System.out.println("\nStack:");
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
	
	//Method to show the height of the stack.
	public void getHeight() {
		System.out.println("\nHeight: " + height);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StackUsingLinkedList stack = new StackUsingLinkedList();
		
		System.out.print("How many time you want to push into the stack: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the datas: ");
		for(int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			stack.push(a);
		}
		
		
		stack.getTop();
		stack.getHeight();
		
		stack.printStack();
		
		sc.close();

	}

}


//------------ Test Cases -----------
//TestCase1: 
/*How many time you want to push into the stack: 3
Enter the datas: 
3
4
5

Top: 5

Height: 3

Stack:
{5}
{4}
{3}
*/

//Testcase2:
/*How many time you want to push into the stack: 10
Enter the datas: 
0
1
2
3
4
5
6
7
8
9

Top: 9

Height: 10

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
*/
