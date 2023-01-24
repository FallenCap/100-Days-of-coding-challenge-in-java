/*Implement Graph and also show remove vertex and edge method using java.*/

package Day087;

import java.util.*;

public class RemoveEdgeVertexGraph {
	private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

	//Method to print the graph.
    public void printGraph() {
        System.out.println(adjList);
    }

  //Method to add vertex into the graph
    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

  //Method to add edge into the graph.
    public boolean addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    //Method to remove edge from the graph.
    public boolean removeEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    //Method to remove vertex from the graph.
    public boolean removeVertex(String vertex) {
        if (adjList.get(vertex) == null) return false;
        for (String otherVertex : adjList.get(vertex)) {
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }

	public static void main(String[] args) {

		RemoveEdgeVertexGraph myGraph = new RemoveEdgeVertexGraph();
		
			myGraph.addVertex("A");
	        myGraph.addVertex("B");
	        myGraph.addVertex("C");
	        myGraph.addVertex("D");

	        myGraph.addEdge("A", "B");
	        myGraph.addEdge("A", "C");
	        myGraph.addEdge("A", "D");
	        myGraph.addEdge("B", "D");
	        myGraph.addEdge("C", "D");


	        System.out.println("\nGraph before removeVertex():");
	        myGraph.printGraph();

	        myGraph.removeVertex("C");

	        System.out.println("\nGraph after removeVertex():");
	        myGraph.printGraph();
	}

}


//------------ Test Cases -----------

//TestCase1:
/*
Graph before removeVertex():
{A=[B, C, D], B=[A, D], C=[A, D], D=[A, B, C]}

Graph after removeVertex():
{A=[B, C], B=[A], C=[A]}
*/

//TestCase2: 
/*
Graph before removeVertex():
{A=[B, C, D], B=[A, D], C=[A, D], D=[A, B, C]}

Graph after removeVertex():
{A=[B, D], B=[A, D], D=[A, B]}
*/