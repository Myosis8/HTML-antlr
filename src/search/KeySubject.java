package search;
import hello.ParserBuilder;

public class KeySubject implements KeyNode{
	public KeySubject(String id){
		this.id = id;
	}
	
	public String getNodeId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void getContent( ParserBuilder builder) {
		builder.levelUp();
		builder.append("<p>");
		builder.append(getNodeId());
		builder.append("</p>");
	 	builder.levelDown();
	}	
	
	public String toString(){
		return getNodeId();
	}
	
	public boolean equals( KeySubject subject){
		return getNodeId() == subject.getNodeId();
	}
	
	private String id;

}
