/*Perform Depth First Search Post-order in a BST using  java.*/

package Day081;

import java.util.*;

class Node {
	int data;
	Node left;
	Node right;
	
}

public class DFSPostOrder {

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
	
	public ArrayList<Integer> dfsPostOrder() {
		ArrayList<Integer> results = new ArrayList<>();  //Creating a ArrrayList.
		
		class Traverse {
			//Creating class Traverse.
			Traverse(Node currentNode) {
				//Creating a constructor.
				if(currentNode.left != null) {
					//if the currentNode.left is no equals to null then the currentNode.left will traverse and added into the ArrayList.
					new Traverse(currentNode.left);
				}
				if(currentNode.right != null) {
					//if the currentNode.right is no equals to null then the currentNode.right will traverse and added into the ArrayList.
					new Traverse(currentNode.right);
				}
				results.add(currentNode.data); //adding the value of the currentNode into the ArrayList.
			}
		}
		new Traverse(root);
		return results;
	}

	public static void main(String[] args) {
		
		DFSPostOrder BST = new DFSPostOrder();
		

		BST.insert(47);
		BST.insert(21);
		BST.insert(76);
		BST.insert(18);
		BST.insert(52);
		BST.insert(82);
		BST.insert(27);
		
		System.out.println("After Depth first search Post-order: " + BST.dfsPostOrder());

	}

}


//------------ Test Cases -----------
//TestCase1: 
//Input: 47, 21, 76, 18, 52, 82, 27.
//Output:
//After Depth first search Post-order: [18, 27, 21, 52, 82, 76, 47]




//TestCase2:
//Input: 21, 23, 32, 12, 45, 12, 39
//Output: 
//After Depth first search Post-order: [12, 39, 45, 32, 23, 21]

