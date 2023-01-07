/*Implement Doubly Circular Linked List using java.*/

package Day070;

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

public class DoublyCircularLinkedList {	
	
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

		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		
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
//Input: 100, 200, 300, 400, 500, 600, 700.
//Output:
//List (first --> last-->first) 
//{ 100 } 
//{ 200 } 
//{ 300 } 
//{ 400 } 
//{ 500 } 
//{ 600 } 
//{ 700 } 


//TestCase2:
//Input: 10,20, 30, 40, 50, 60, 70, 80, 90, 100
//Output:
//List (first --> last-->first) 
//{ 10 } 
//{ 20 } 
//{ 30 } 
//{ 40 } 
//{ 50 } 
//{ 60 } 
//{ 70 } 
//{ 80 } 
//{ 90 } 
//{ 100 } 
