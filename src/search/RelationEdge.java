package search;

import hello.ParserBuilder;

import org.jgraph.graph.DefaultEdge;

public class RelationEdge  extends DefaultEdge{

	private static final long serialVersionUID = 1L;
	private String relationName;

	public RelationEdge(KeyNode from, KeyNode to, String name) {
		super();
		this.source = from;
		this.target = to;
		this.relationName = name;
	}
	
	public String getRelationName() {
		return relationName;
	}

	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}
	
	public String toString(){
		String source = getSource().toString();
		String target = getTarget().toString();
		return source + "---" + relationName + "--->" + target;
	}
	
	public void getContent( ParserBuilder builder) {
		builder.levelUp();
		builder.append("<p>");
		builder.append(toString());
		builder.append("</p>");
	 	builder.levelDown();
	}
}
