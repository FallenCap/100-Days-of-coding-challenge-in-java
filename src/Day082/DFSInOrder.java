/*Perform Depth First Search In-order in a BST using  java.*/

package Day082;

import java.util.*;

class Node {
	int data;
	Node left;
	Node right;
	
}

public class DFSInOrder {

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
	
	public ArrayList<Integer> dfsInOrder() {
		ArrayList<Integer> results = new ArrayList<>(); //Creating a ArrrayList.
		
		class Traverse {
			//Creating class Traverse.
			Traverse(Node currentNode) {
				//Creating a constructor.
				if(currentNode.left != null) {
					//if the currentNode.left is no equals to null then the currentNode.left will traverse and added into the ArrayList.
					new Traverse(currentNode.left);
				}
				results.add(currentNode.data);  //adding the value of the currentNode into the ArrayList.
				
				if(currentNode.right != null) {
					//if the currentNode.right is no equals to null then the currentNode.right will traverse and added into the ArrayList.
					new Traverse(currentNode.right);
				}
			}
		}
		new Traverse(root);
		return results;
	}

	public static void main(String[] args) {
		DFSInOrder BST = new DFSInOrder();
		
		BST.insert(21);
		BST.insert(23);
		BST.insert(32);
		BST.insert(12);
		BST.insert(45);
		BST.insert(13);
		BST.insert(39);

		System.out.println("After Depth first search In-order: " + BST.dfsInOrder());
	}

}


//------------ Test Cases -----------
//TestCase1: 
//Input: 47, 21, 76, 18, 52, 82, 27.
//Output:
//After Depth first search In-order: [18, 21, 27, 47, 52, 76, 82]


//TestCase2:
//Input: 21, 23, 32, 12, 45, 13, 39
//Output: 
//After Depth first search In-order: [12, 13, 21, 23, 32, 39, 45]
