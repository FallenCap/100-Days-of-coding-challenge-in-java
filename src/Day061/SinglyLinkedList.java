/*Implement Singly linked list using  java.*/

package Day061;

//Creating class for Nodes of the  linked list.
class Node {
	public int data;
	public Node next;
	
	//Method for display nodes of the linkedlist.
	public void displayNode() {
		System.out.println(" { " + data + " } ");
	}
}
public class SinglyLinkedList {
	
	private Node head;
	
	//Creating constructor of the class.
	public SinglyLinkedList() {
		
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
		
		SinglyLinkedList list = new SinglyLinkedList();  //Creating instance of the  SinglyLinkedList.
		
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
//List (first --> last) 
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
//List (first --> last) 
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