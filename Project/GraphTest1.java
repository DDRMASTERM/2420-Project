//Graph Test driver

public class GraphTest1{
	public static void main (String[] args) {
		Graph myGraph = new Graph();
		myGraph.addVertex("A");
		myGraph.addVertex("B");
		myGraph.addVertex("C");
		myGraph.addVertex("D");
		myGraph.addVertex("E");
		myGraph.addVertex("F");
		myGraph.addVertex("G");
		myGraph.addVertex("H");
		myGraph.addVertex("I");
		myGraph.addEdge(0,1);
		myGraph.addEdge(0,4);
		myGraph.addEdge(1,2);
		myGraph.addEdge(2,3);
		myGraph.addEdge(4,5);
		myGraph.addEdge(5,6);
		myGraph.addEdge(6,7);
		
		myGraph.displayVertices();
		System.out.println(myGraph.displayEdges());
		System.out.println(myGraph.DFS(0));
		myGraph.reset();
		System.out.println(myGraph.DFS(8));
	}
}
		
		