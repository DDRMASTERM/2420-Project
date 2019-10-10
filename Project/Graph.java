//An upgraded Graph class

public class Graph {
	private int maxverts=20;
	private Vertex vertexList[];//List of vertices
	private int nverts; // holds number of vertices
	private int adjMat[][];
	private Stack s;//new variable
	
	public Graph () {
		nverts=0;
		vertexList = new Vertex[maxverts];
		adjMat = new int[maxverts][maxverts];
		for(int i=0; i<maxverts; i++){
			for(int j=0; j<maxverts; j++){
				adjMat[i][j]=0;
			}
		}
		s=new Stack();//new variable
	}
	
	public void addVertex (String s) {
		vertexList[nverts] = new Vertex(s);
		//Below are the new lines
		vertexList[nverts].setLocation(nverts);
		nverts++;
	}
	
	public void addEdge (int start, int end) {
		adjMat[start][end]=1;
		adjMat[end][start]=1;
		//Below are the new lines
		if(start==end){
			vertexList[start].addEdge(vertexList[end]);
		}
		else{
			vertexList[start].addEdge(vertexList[end]);	
			vertexList[end].addEdge(vertexList[start]);
		}
	}
	
	public void displayVertices () {//Unchanged
		System.out.println("Here are the vertices: ");
		for(int i = 0; i<nverts; i++){
			System.out.println(vertexList[i].getLabel());
		}
	}
	
	public String displayEdges () {
		/*System.out.println("Here are the edges: ");
		for(int i=0; i<nverts; i++){
			for(int j=0; j<maxverts; j++){
				if(adjMat[i][j]==1){
					System.out.println(vertexList[i].getLabel() + "--" + vertexList[j].getLabel());
				}
			}
		}Above is the original code*/
		String result="";
		result+="Here are the edges: \n";
		for(int i=0; i<nverts; i++){
			result+=vertexList[i].getAdjacencyList();
		}
		result+="Number of edges per vertex: \n";
		for(int i=0; i<nverts; i++){
			result+=vertexList[i].getLabel()+" "+vertexList[i].getEdges()+"\n";
		}
		return result;
	}
	public void reset(){//new
		for(int i=0; i<nverts; i++){
			vertexList[i].resetVisited();
		}
	}
	public String DFS(int a){//The main event
		String result="Vertex or Vertices not visited: ";
		boolean unvisited=false;
		if(a>=nverts||a<0){
			return "The number "+a+" is outside the range.";
		}
		Vertex v=vertexList[a];
		v.setVisited();
		if(v.getEdges()==0){
			return "This function cannot be performed with "+v.getLabel()+" vertex.";
		}
		s.push(v.getLabel());
		System.out.print(s.print());
		for(int i=0; i<v.getEdges(); i++){
			if(v.getAdjacencyListLocation(i).getWasVisited()==false){
				this.DFS(v.getAdjacencyListLocation(i).getLocation());
			}
		}
		s.pop();
		System.out.print(s.print());
		for(int i=0; i<nverts; i++){
			if(vertexList[i].getWasVisited()==false){
				result+=vertexList[i].getLabel()+" ";
				unvisited=true;
			}
		}
		if(unvisited==false){
			result+="none";
		}
		return result;
	}
}