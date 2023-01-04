/*Implement Doubly linked list using  java.*/

package Day067;

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

public class DoublyLinkedList {

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
		DoublyLinkedList list = new DoublyLinkedList(); //Creating instance of the  Doubly linked list.
		
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
		
		list.displayList();

	}

}


//------------ Test Cases -----------

//TestCase1:
//Input: 10, 20, 30, 40, 50 , 60, 70, 80, 90, 100
//List (first <--> last) 
//{ 10 }  { 20 }  { 30 }  { 40 }  { 50 }  { 60 }  { 70 }  { 80 }  { 90 }  { 100 } 

//TestCase2:
//Input: 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000
//List (first <--> last) 
//{ 100 }  { 200 }  { 300 }  { 400 }  { 500 }  { 600 }  { 700 }  { 800 }  { 900 }  { 1000 } 
