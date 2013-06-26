package search;

public class TempEdge {

	private String source;
	private String target;
	private String name;

	public TempEdge(String source, String target, String name) {
		this.source = source;
		this.target = target;
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
