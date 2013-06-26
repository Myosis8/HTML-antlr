package search;

import hello.ParserBuilder;

public class KeyImage implements KeyNode {

	
	private String nodeId;
	private String imageSource;
	
	public KeyImage(String id, String imageSource){
		this.nodeId = id;
		this.imageSource = imageSource;
	}
	@Override
	public String getNodeId() {
		return this.nodeId;
	}

	@Override
	public void getContent(ParserBuilder builder) {
		builder.levelUp();
		builder.append("<br/>");
		builder.append("<img src='");
		builder.appendPlain(getImageSource());
		builder.appendN("'/>");
		builder.append("<br/>");
		builder.levelDown();
		
	}
	public String getImageSource() {
		return imageSource;
	}
	public void setImageSource(String imageSource) {
		this.imageSource = imageSource;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

}
