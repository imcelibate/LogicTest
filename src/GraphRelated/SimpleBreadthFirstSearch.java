package GraphRelated;

import java.util.ArrayList;
import java.util.List;

import GraphRelated.DepthFirstSearch.Vertex;

public class SimpleBreadthFirstSearch {
	
	static int count = 0;
	
	static class Vertex{
		int value;
		boolean isVisited;
		List<Vertex> adjVertices = new ArrayList<Vertex>();
		
		public Vertex(int value) {
			this.value = value;
		}
		
		private void addAdjVertex(Vertex vertex) {
			adjVertices.add(vertex);
		}
		
	}
	
	static void bfs(Vertex vertex) {
		if(!vertex.isVisited) {
		vertex.isVisited = true;
		System.out.println("Reached :"+vertex.value);
		for(Vertex vert : vertex.adjVertices) {
			if(!vert.isVisited) {
				bfs(vert);
			}
		 }			
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
		
		bfs(v40);
	}

}
