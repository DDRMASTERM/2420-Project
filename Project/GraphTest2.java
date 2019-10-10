public class GraphTest2{
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
		myGraph.addEdge(0,1);
		myGraph.addEdge(0,2);
		myGraph.addEdge(0,3);
		myGraph.addEdge(1,2);
		myGraph.addEdge(1,4);
		myGraph.addEdge(1,5);
		myGraph.addEdge(2,3);
		myGraph.addEdge(2,5);
		myGraph.addEdge(3,4);
		myGraph.addEdge(3,5);
		myGraph.addEdge(4,5);
		
		myGraph.displayVertices();
		System.out.println(myGraph.displayEdges());
		System.out.println(myGraph.DFS(0));
		myGraph.reset();
		System.out.println(myGraph.DFS(8));
		System.out.println(myGraph.DFS(-1));
	}
}