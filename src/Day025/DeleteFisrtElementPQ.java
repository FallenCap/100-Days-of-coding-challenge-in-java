/*Write a Java program to retrieve and remove the first element.*/

package Day025;

import java.util.*;
public class DeleteFisrtElementPQ {

	public static void main(String[] args) {
		//Creating Priority Queue
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		
		//Add Elements in the priority queue
		pq1.add(10);
		pq1.add(11);
		pq1.add(8);
		pq1.add(18);
		pq1.add(25);
		pq1.add(31);
		pq1.add(70);
		pq1.add(28);
		pq1.add(89);
		pq1.add(14);
		
		System.out.println("Original priority queue: " + pq1);
		System.out.println("Removes the first element: " + pq1.poll());
		System.out.println("Priority queue after removing first element: " + pq1);

	}

}


//-------------Test Case-------------

//TestCase1:
//pq1: 10, 11, 8, 18, 25, 31, 70, 28, 89, 14
//Output:
//Original priority queue: [8, 11, 10, 18, 14, 31, 70, 28, 89, 25]
//Removes the first element: 8
//Priority queue after removing first element: [10, 11, 25, 18, 14, 31, 70, 28, 89]

//TestCase2:
//pq1:	Subham, Sarvesh, Surya, Tarang, Atin, Pranav, Abhishek, Raj, Sanjiban, Fayaj
//Output: 
//Original priority queue: [Abhishek, Fayaj, Atin, Sanjiban, Raj, Surya, Pranav, Tarang, Sarvesh, Subham]
//Removes the first element: Abhishek
//Priority queue after removing first element: [Atin, Fayaj, Pranav, Sanjiban, Raj, Surya, Subham, Tarang, Sarvesh]
