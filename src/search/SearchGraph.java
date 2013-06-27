package search;

import java.util.Set;


import org.jgrapht.graph.SimpleDirectedGraph;

public class SearchGraph extends SimpleDirectedGraph< KeyNode, RelationEdge>{

	private static final long serialVersionUID = 1L;

	private SearchGraph(Class<? extends  RelationEdge > arg0){
		super(arg0);	
	}

	
	static public boolean addVertexToSearchGraph(KeyNode vertex){
		return getSearchGraph().addVertex(vertex)? true : false ;
	}
	
	static public KeyNode getVertexByID( String ID){
		Set< KeyNode > vertexes = getSearchGraph().vertexSet();
		for( KeyNode vertex : vertexes){
			if( vertex.getNodeId().equals(ID)){
				return vertex;
			}
		}
		return null;
	}
	
	static public void addEdgeToSearchGraph(KeyNode source, KeyNode target, RelationEdge edge){
		getSearchGraph().addEdge(source, target, edge);
	}
	
	static public void print(){
		Set< RelationEdge > edgeSet = getSearchGraph().edgeSet();
		Set< KeyNode > nodeSet = getSearchGraph().vertexSet();
		System.out.println("---Vertices------------");
		for( KeyNode node : nodeSet){
			System.out.println(node.toString());
		}
		System.out.println("---Edges---------------");
		for( RelationEdge edge : edgeSet){
			System.out.println(edge.toString());
		}
		System.out.println("***");
	}
	
	static public SearchGraph getSearchGraph(){
		if(instance == null){
			instance = new SearchGraph(RelationEdge.class);
			return instance;
		}
		else{
			return instance;
		}
	}
	
	static public void clearSearchGraph(){
		if(instance != null){
			instance = null;
		}
	}
 
	private static SearchGraph instance = null;
}
