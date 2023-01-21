/*Implement AVL tree And show the deletion in java.*/

package Day084;

import java.util.*;

class Node {
	int data, height;
	Node left, right;
	
	Node() {
		this.height = 0;
	}
}

public class DeletionAVLTree {
Node root;
	
	//Method for Pre-order traversal.
	public void preOrder(Node newNode) {
		if(newNode == null) {
			//If newNode is null then it returns null.
			return;
		}
		System.out.println(newNode.data + " ");
		preOrder(newNode.left);
		preOrder(newNode.right);
	}
	
	//Method for In-order traversal.
	public void inOrder(Node newNode) {
		if(newNode == null) {
			//If newNode is null then it returns nothing.
			return;
		}
		preOrder(newNode.left);
		System.out.println(newNode.data + " ");
		preOrder(newNode.right);
	}
	
	//Method for Post-order traversal.
	public void postOrder(Node newNode) {
		if(newNode == null) {
			//If newNode is null then it returns null.
			return;
		}
		preOrder(newNode.left);
		preOrder(newNode.right);
		System.out.println(newNode.data + " ");
	}
	
	//Method for Level order.
	public void levelOrder() {
		Queue<Node> queue = new LinkedList<>(); //Creating a queue.
		queue.add(root); //Adding root into the queue.
		
		while(!queue.isEmpty()) {
			//The loop will run till the queue is no empty.
			Node presentNode = queue.remove(); // Assigning the removed node from the queue as presentNode.
			System.out.println(presentNode.data + " ");
			if(presentNode.left != null) {
				//If presentNode.left not equals to null then presentNode.left will be added into the queue.
				queue.add(presentNode.left);
			}
			if(presentNode.right != null) {
				//If presentNode.right not equals to null then presentNode.right will be added into the queue.
				queue.add(presentNode.right);
			}
		}
	}
	
	//Method for Search.
	Node search(Node newNode, int data) {
		if(newNode == null) {
			//If newNode is null then it return null.
			System.out.println("Data: " + data + " not found in AVL");
			return null;
		}
		else if(data == newNode.data) {
			//If data is equals newNode.data then it returns newNode.
			System.out.println("Data: " + data + " found in AVL");
			return newNode;
		}
		else {
			return search(newNode.right, data);
		}
	}

	//Method for get height.
	public int getHeight(Node node) {
		if(node == null) {
			//If the node is equals to null then it returns 0 or its return height.
			return 0;
		}
		return node.height;
	}
	
	//Method for rotate right.
	private Node rotateRight(Node disbalancedNode) {
		Node newRoot = disbalancedNode.left;
		disbalancedNode.left = disbalancedNode.left.right;
		newRoot.right = disbalancedNode;
		disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
		newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
		return newRoot;
	}
	
	//Mehtod for rotate left.
	private Node rotateLeft(Node disbalancedNode) {
		Node newRoot = disbalancedNode.right;
		disbalancedNode.left = disbalancedNode.right.left;
		newRoot.left = disbalancedNode;
		disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
		newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
		return newRoot;
	}
	
	//Method for balance the height.
	public int getBalance(Node node ) {
		if(node == null) {
			return 0;
		}
		return getHeight(node.left) - getHeight(node.right);	
	}
	
	//Method to insert Node
	private Node insertNode(Node node, int data) {
		if(node == null) {
			Node newNode = new Node();
			newNode.data = data;
			newNode.height = 1;
			return newNode;
		}
		else if(data < node.data) {
			node.left = insertNode(node.left, data);
		}
		else {
			node.right = insertNode(node.right, data);
		}
		
		node.height =  1 + Math.max(getHeight(node.left), getHeight(node.right));
		int balance = getBalance(node);
		
		if(balance > 1 && node.data < node.left.data) {
			return rotateRight(node);
		}
		
		if(balance > 1 && node.data > node.left.data) {
			node.left = rotateLeft(node.left);
			return rotateRight(node);
		}
		
		if(balance < -1 && data > node.right.data) {
			return rotateLeft(node);
		}
		
		if(balance < -1 && data > node.right.data) {
			node.right = rotateRight(node.right);
			return rotateLeft(node);
		}
		
		return node;
	}
	
	//Method to insert into root.
	public void insert(int data) {
		root = insertNode(root, data);
	}

	//Method for minimum node
	public static Node minimumNode(Node root) {
		if((root.left == null) ) {
			return root;
		}
		return minimumNode(root.left);
	}
	
	//Method for delete Node
	public Node deleteNode(Node node, int data) {
		if(node.data == data) {
			System.out.println("Value not found in AVL");
			return node;
		}
		if(data < node.data) {
			node.left = deleteNode(node.left, data);
		}
		else if(data > node.data) {
			node.right = deleteNode(node.right, data);
		}
		else {
			if(node.left != null && node.right != null) {
				Node temp = node;
				Node minNodeForRight = minimumNode(temp.right);
				node.data = minNodeForRight.data;
				node.right = deleteNode(node.right, minNodeForRight.data);
			}
			else if(node.left != null) {
				node = node.left;
			}
			else if(node.right != null) {
				node = node.right;
			}
			else {
				node = null;
			}
		}
		int balance = getBalance(node);
		if(balance > 1 && getBalance(node.left) >= 0) {
			return rotateRight(node);
		}
		if(balance > 1 && getBalance(node.left) < 0) {
			node.left = rotateLeft(node.left);
			return rotateRight(node);
		}
		if(balance < -1 && getBalance(node.left) <= 0) {
			return rotateLeft(node);
		}
		if(balance < -1 && getBalance(node.left) > 0) {
			node.right = rotateRight(node.right);
			return rotateLeft(node);
		}
		return node;
	}
	
	//Method to delete node.
	public void delete(int data) {
		root = deleteNode(root, data);
	}
	
	public static void main(String[] args) {

		DeletionAVLTree AVL = new DeletionAVLTree();
		
		AVL.insert(5);
		AVL.insert(10);
		AVL.insert(15);
		AVL.insert(20);
		AVL.insert(25);
		AVL.insert(30);
		
		AVL.delete(5);
		
		AVL.levelOrder();
	}

}


//------------ Test Cases -----------
//TestCase1: 
//Input: 5, 10, 15, 20, 25, 30.
//Output:
//20 15 10 20 30
