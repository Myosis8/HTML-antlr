package search;

public class Query {
	public Query(String source, String target, int type){
		this.source = source;
		this.target = target;
		this.type = type;
	}
	private String source;
	public String getSource() {
		return source;
	}
	public String getTarget() {
		return target;
	}
	public int getType() {
		return type;
	}
	private String target;
	private int type;
}
