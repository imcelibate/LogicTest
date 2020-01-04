package GraphRelated;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import GraphRelated.SimpleBreadthFirstSearch.Vertex;

public class DepthFirstSearch {
	
	static class Vertex{
		int weight;
	    boolean isVisited;
	    List<Vertex> adjVertices = new ArrayList<Vertex>();
	    
	    private void addAdjVertex(Vertex adjVertex) {
	    	adjVertices.add(adjVertex);
	    }
	    public Vertex(int weight) {
	    	this.weight = weight;
	    }
		
	}
	
	public static void main(String arg[]) {
		Vertex v40 = new Vertex(40);
		Vertex v10 = new Vertex(10);
		Vertex v20 = new Vertex(20);
		Vertex v30 = new Vertex(30);
		Vertex v50 = new Vertex(50);
		Vertex v60 = new Vertex(60);
		Vertex v70 = new Vertex(70);
		
		v40.addAdjVertex(v10);
		v40.addAdjVertex(v20);
		v20.addAdjVertex(v10);
		v20.addAdjVertex(v30);
		v20.addAdjVertex(v50);
		v20.addAdjVertex(v60);
		v10.addAdjVertex(v30);
		v30.addAdjVertex(v60);
		v50.addAdjVertex(v70);
		v60.addAdjVertex(v70);
		
		dfs(v40);
		
		Vertex Sv40 = new Vertex(40);
		Vertex Sv10 = new Vertex(10);
		Vertex Sv20 = new Vertex(20);
		Vertex Sv30 = new Vertex(30);
		Vertex Sv50 = new Vertex(50);
		Vertex Sv60 = new Vertex(60);
		Vertex Sv70 = new Vertex(70);
		
		Sv40.addAdjVertex(Sv10);
		Sv40.addAdjVertex(Sv20);
		Sv20.addAdjVertex(Sv10);
		Sv20.addAdjVertex(Sv30);
		Sv20.addAdjVertex(Sv50);
		Sv20.addAdjVertex(Sv60);
		Sv10.addAdjVertex(Sv30);
		Sv30.addAdjVertex(Sv60);
		Sv50.addAdjVertex(Sv70);
		Sv60.addAdjVertex(Sv70);		

		simpleDFS(Sv40);
	}
	
	private static void dfs(Vertex vertex) {
		Stack<Vertex> vStack = new Stack<Vertex>();
		vertex.isVisited = true;
		System.out.println("reached : "+vertex.weight);
		vStack.push(vertex);
		if(vertex.adjVertices.isEmpty()) {
			vStack.pop();
		}else {
			for(Vertex advVertex : vertex.adjVertices) {
				if(!advVertex.isVisited) {
				dfs(advVertex);
				}
			}
		}
	}
	
	private static void simpleDFS(Vertex vertex) {
		if(!vertex.isVisited) {
		vertex.isVisited = true;
		System.out.println("Reached SDFS :"+vertex.weight);
		for(Vertex vert : vertex.adjVertices) {
			if(!vert.isVisited) {
				simpleDFS(vert);
			}
		 }			
	  }	
	}
	
	

}


