public class GraphTest4{
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
		myGraph.addVertex("K");
		myGraph.addVertex("L");
		myGraph.addVertex("M");
		myGraph.addVertex("N");
		myGraph.addVertex("O");
		myGraph.addVertex("P");
		myGraph.addEdge(0,1);
		myGraph.addEdge(0,4);
		myGraph.addEdge(1,2);
		myGraph.addEdge(1,5);
		myGraph.addEdge(2,3);
		myGraph.addEdge(2,6);
		myGraph.addEdge(3,7);
		myGraph.addEdge(4,5);
		myGraph.addEdge(4,8);
		myGraph.addEdge(5,6);
		myGraph.addEdge(5,9);
		myGraph.addEdge(6,7);
		myGraph.addEdge(6,10);
		myGraph.addEdge(7,11);
		myGraph.addEdge(8,9);
		myGraph.addEdge(8,12);
		myGraph.addEdge(9,10);
		myGraph.addEdge(9,13);
		myGraph.addEdge(10,11);
		myGraph.addEdge(10,14);
		myGraph.addEdge(11,15);
		myGraph.addEdge(12,13);
		myGraph.addEdge(13,14);
		myGraph.addEdge(14,15);
		
		
		
		myGraph.displayVertices();
		System.out.println(myGraph.displayEdges());
		System.out.println(myGraph.DFS(0));
		myGraph.reset();
		System.out.println(myGraph.DFS(8));
	}
}