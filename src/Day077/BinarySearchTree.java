/*Implement Binary Search Tree using java.*/

package Day077;

class Node {
	int data;
	Node left;
	Node right;
	
}

public class BinarySearchTree {
	
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
		Node temp = root; //Assigning root as temp;
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

	public static void main(String[] args) {
		BinarySearchTree BST = new BinarySearchTree();
		
		BST.insert(47);
		BST.insert(21);
		BST.insert(76);
		BST.insert(18);
		BST.insert(52);
		BST.insert(82);
		BST.insert(27);
		
		System.out.println(BST.root.right.right.data);
	}

}


//------------ Test Cases -----------

//TestCase1: 
//Input: BST.root.left.right.data
//Output: 27

//Testcase2:
//Input: BST.root.data
//Output: 47

//TestCase3:
//Input: BST.root.right.right.data
//Output: 82
