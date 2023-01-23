/*Implement Graph and also show add vertex and edge method using java.*/

package Day086;

import java.util.*;

public class AddEdgeVertexGraph {
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

	public static void main(String[] args) {

		AddEdgeVertexGraph myGraph = new AddEdgeVertexGraph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");


        System.out.println("\nGraph before addEdge():");
        myGraph.printGraph();


        myGraph.addEdge("A", "B");


        System.out.println("\nGraph after addEdge():");
        myGraph.printGraph();
	}

}


//------------ Test Cases -----------

//TestCase1:
/*
Graph before addEdge():
{A=[], B=[]}

Graph after addEdge():
{A=[B], B=[A]}
*/

