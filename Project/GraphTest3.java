public class GraphTest3{
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
		myGraph.addVertex("J");
		myGraph.addEdge(0,1);
		myGraph.addEdge(0,6);
		myGraph.addEdge(1,2);
		myGraph.addEdge(2,6);
		myGraph.addEdge(1,3);
		myGraph.addEdge(3,4);
		myGraph.addEdge(4,5);
		myGraph.addEdge(6,7);
		myGraph.addEdge(7,8);
		myGraph.addEdge(8,8);
		myGraph.addEdge(8,9);
		
		
		myGraph.displayVertices();
		System.out.println(myGraph.displayEdges());
		System.out.println(myGraph.DFS(0));
		myGraph.reset();
		System.out.println(myGraph.DFS(8));
	}
}