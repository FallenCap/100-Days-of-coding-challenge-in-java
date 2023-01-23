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

  // PreOrder Traversal
  public void preOrder(Node node) {
   if (node == null) {
     return;
   }
   System.out.print(node.data + " ");
   preOrder(node.left);
   preOrder(node.right);
 }

 // Inorder Traversal
 public void inOrder(Node node) {
   if (node == null) {
     return;
   }
   inOrder(node.left);
   System.out.print(node.data + " ");
   inOrder(node.right);


 }

 // PostOrder Traversal
 public void postOrder(Node node) {
   if (node == null) {
     return;
   }
   postOrder(node.left);
   postOrder(node.right);
   System.out.print(node.data + " ");
 }

 // Level Order

 void levelOrder() {
   Queue<Node> queue = new LinkedList<Node>();
   queue.add(root);
   while (!queue.isEmpty()) {
     Node presentNode = queue.remove();
     System.out.print(presentNode.data + " ");
     if (presentNode.left != null) {
       queue.add(presentNode.left);
     }
     if (presentNode.right != null) {
       queue.add(presentNode.right);
     }
   }
 }

 // Search Method
 Node search(Node node, int data) {
   if (node == null ) {
     System.out.println("Value: "+ data+ " not found in AVL");
     return null;
   } else if (node.data == data) {
     System.out.println("Value: "+ data+ " found in AVL");
     return node;
   } else if (data < node.data) {
     return search(node.left, data);
   } else {
     return search(node.right, data);
   }
 }

//  getHeight
  public int getHeight(Node node) {
    if (node == null) {
      return 0;
    }
    return node.height;
  }

  // rotateRight
  private Node rotateRight(Node disbalancedNode) {
    Node newRoot = disbalancedNode.left;
    disbalancedNode.left = disbalancedNode.left.right;
    newRoot.right = disbalancedNode;
    disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
    newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
    return newRoot;
  }

  // rotateLeft
  private Node rotateLeft(Node disbalancedNode) {
    Node newRoot = disbalancedNode.right;
    disbalancedNode.right = disbalancedNode.right.left;
    newRoot.left = disbalancedNode;
    disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
    newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
    return newRoot;
  }

  // getBalance
  public int getBalance(Node node) {
    if (node == null) {
      return 0;
    }
    return getHeight(node.left) - getHeight(node.right);
  }

  // insertNode Method
  private Node insertNode(Node node, int nodeValue) {
    if (node == null) {
      Node newNode = new Node();
      newNode.data = nodeValue;
      newNode.height = 1;
      return newNode;
    } else if (nodeValue < node.data) {
      node.left = insertNode(node.left, nodeValue);
    } else {
      node.right = insertNode(node.right, nodeValue);
    }

    node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
    int balance = getBalance(node);

    if (balance > 1 && nodeValue < node.left.data) {
      return rotateRight(node);
    }

    if (balance > 1 && nodeValue > node.left.data) {
      node.left = rotateLeft(node.left);
      return rotateRight(node);
    }

    if (balance < -1 && nodeValue > node.right.data) {
      return rotateLeft(node);
    }

    if (balance < - 1 && nodeValue < node.right.data) {
      node.right = rotateRight(node.right);
      return rotateLeft(node);
    }

    return node;

  }

  public void insert(int data) {
    root = insertNode(root, data);
  }

  // // Minimum node
  public static Node minimumNode(Node root) {
    if (root.left == null) {
      return root;
    } else {
      return minimumNode(root.left);
    }
  }

  // Delete node
 public Node deleteNode(Node node, int data) {
   if (node == null) {
     System.out.println("Value not found in AVL");
     return node;
   }
   if (data < node.data) {
     node.left = deleteNode(node.left, data);
   } else if (data > node.data) {
     node.right = deleteNode(node.right, data);
   } else {
     if (node.left != null && node.right != null) {
       Node temp = node;
       Node minNodeForRight = minimumNode(temp.right);
       node.data = minNodeForRight.data;
       node.right = deleteNode(node.right, minNodeForRight.data);
     } else if (node.left != null) {
       node = node.left;
     } else if (node.right != null) {
       node = node.right;
     } else {
       node = null;
     }
   }
   // Case 2 - rotation required

   // System.out.println("1");
   // System.out.println(previous.data);

   // node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
   int balance = getBalance(node);

   if (balance > 1 && getBalance(node.left) >= 0) {
     return rotateRight(node);
   }
   if (balance > 1 && getBalance(node.left) < 0) {
     node.left = rotateLeft(node.left);
     return rotateRight(node);
   }
   if (balance < -1 && getBalance(node.right) <= 0) {
     return rotateLeft(node);
   }

   if (balance < -1 && getBalance(node.right) > 0) {
     node.right = rotateRight(node.right);
     return rotateLeft(node);
   }

   return node;

 }

 public void delete(int data) {
   root = deleteNode(root, data);
 }

 public void deleteAVL() {
   root = null;
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
//20 10 25 15 30 
