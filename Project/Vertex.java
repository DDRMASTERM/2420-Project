// Upgraded Vertex

public class Vertex{
	private String label;
	private Object obj;
	private boolean wasVisited;
	//new variables are below this line
	private int edges;
	private int location;
	private Vertex adjacencyList[];
	
	public Vertex (String s) {
		this.label = s;
		this.wasVisited=false;
		//new variables are below this line
		this.edges=0;
		this.adjacencyList=new Vertex[20];
	}
	public String getLabel(){//unchanged
		return label;
	}
	public void addEdge(Vertex a){//new
		this.adjacencyList[edges]=a;
		this.edges++;
	}
	public int getEdges(){//new
		return this.edges;
	}
	public void setLocation(int l){//new
		this.location=l;
	}
	public int getLocation(){//new
		return location;
	}
	public String getAdjacencyList(){//new
		//Similar in function to original graph's displayEdges method
		String result="";
		if(this.edges!=0){
			for(int i=0; i<this.edges; i++){
				result+=this.label+"--"+this.adjacencyList[i].getLabel()+"\n";
			}
		}
		return result;
	}
	public Vertex getAdjacencyListLocation(int l){//new
		return this.adjacencyList[l];
	}
	public Boolean getWasVisited(){//Unchanged
		return wasVisited;
	}
	public void setLabel(String l){//Unchanged
		this.label=l;
	}
	public void setVisited(){//new
			this.wasVisited=true;
	}
	public void resetVisited(){//new
			this.wasVisited=false;
	}
}