/*Implement Binary Search Tree and check whether a element is in the tree present or not using java.*/

package Day078;

import java.util.*;

class Node {
	int data;
	Node left;
	Node right;
	
}

public class SearchingInBST {
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
	
	public boolean contains(int data) {
		Node temp = root; //Assigning root as temp.
		while(temp != null) {
			//if the temp is equals to null then the loop will terminate and it will return false.
			
			if(data < temp.data) {
				//If the data is less then given data then the temp will change its value to temp.left.
				temp = temp.left;
			}
			else if(data > temp.data) {
				//If the data is big then given data then the temp will change its value to temp.right.
				temp = temp.right;
			}
			else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SearchingInBST BST = new SearchingInBST();
		
		BST.insert(47);
		BST.insert(21);
		BST.insert(76);
		BST.insert(18);
		BST.insert(52);
		BST.insert(82);
		BST.insert(30);
		BST.insert(4);
		BST.insert(12);
		BST.insert(53);
		
		System.out.print("Enter the node data to check whether it is in the tree or not:  ");
		int a = sc.nextInt();
		
		if(!BST.contains(a)) {
			System.out.println("\nThe element is not in the tree.");
		}
		else {
			System.out.println("\nYes the element is in the tree.");
		}
		sc.close();
	}

}


//------------ Test Cases -----------

//TestCase1:
/*Enter the node data to check whether it is in the tree or not:  47

Yes the element is in the tree.*/

//TestCase2:
/*Enter the node data to check whether it is in the tree or not:  30

Yes the element is in the tree.
*/

//TestCase3:
/*Enter the node data to check whether it is in the tree or not:  100

The element is not in the tree.
*/
