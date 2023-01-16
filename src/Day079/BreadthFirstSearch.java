/*Perform Breadth First Search in a BST using  java.*/

package Day079;

import java.util.*;

class Node {
	int data;
	Node left;
	Node right;
	
}

public class BreadthFirstSearch {
	
	Node root;
	
	//Method to insert data into the Binary search tree.
	public boolean insert(int data) {
		Node newNode = new Node(); //Creating newNode
		newNode.data = data; //Adding dat into the newNode.
		if(root == null) {
			//If the root is null then the newNode will be assigned as root.
			root = newNode;
			return true;
		}
		Node temp = root; //Assigning root as temp.
		while(true) {
			if(newNode.data == temp.data) {
				//if the data of the newNode and temp is same then it will return fale.
				return false;
			}
			if(newNode.data < temp.data) {
				//if the data of the newNode is less then temp node then the temp.left will point the newNode.
				if(temp.left == null) {
					temp.left = newNode;
					return true;
				}
				temp = temp.left;
			}
			else {
				//if the data of the newNode is more then temp node then the temp.right will point the newNode.
				if(temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}
		}
	}
	
	//Method for Breadth First Search.
	public ArrayList<Integer> BFS() {
		Node currentNode = root; //Assigning root as currentNode.
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Integer> results = new ArrayList<>();
		queue.add(currentNode);
		
		while(queue.size() > 0) {
			//The loop will run till the queue size is greater than 0.
			currentNode = queue.remove(); //Assigning current node as the node removed from the queue.
			results.add(currentNode.data); //Adding the Current node value into the array list.
			if(currentNode.left != null) {
				//If the currentNode.left not equals to null then its value will add into the queue.
				queue.add(currentNode.left);
			}
			if(currentNode.right != null) {
				//If the currentNode.right not equals to null then its value will add into the queue.
				queue.add(currentNode.right);
			}
		}
		return results;
	}

	public static void main(String[] args) {
		
		BreadthFirstSearch BST = new BreadthFirstSearch();
		
		BST.insert(21);
		BST.insert(23);
		BST.insert(32);
		BST.insert(12);
		BST.insert(45);
		BST.insert(12);
		BST.insert(39);

		System.out.println("After Breadth first search: " + BST.BFS());
	}

}


//------------ Test Cases -----------
//TestCase1: 
//Input: 47, 21, 76, 18, 52, 82, 27.
//Output:
//After Breadth first search: [47, 21, 76, 18, 27, 52, 82]


//TestCase2:
//Input: 21, 23, 32, 12, 45, 12, 39
//Output: 
//After Breadth first search: [21, 12, 23, 32, 45, 39]

