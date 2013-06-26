package search;

import hello.ParserBuilder;

public class KeyText implements KeyNode {
	@Override
	public void getContent(ParserBuilder builder) {
		builder.levelUp();
		builder.append("<p>");
		builder.append(getText());
		builder.append("</p>");
	 	builder.levelDown();	
	}

	private String nodeId;
	private String text;
	
	
	public KeyText(String nodeId, String text){
		this.nodeId = nodeId;
		this.text = text;
	}
	
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	
	public String getNodeId() {
		// TODO Auto-generated method stub
		return this.nodeId;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String toString(){
		return getNodeId();
	}
}
