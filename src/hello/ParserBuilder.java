package hello;

public class ParserBuilder {
	private StringBuilder builder = new StringBuilder();
	public StringBuilder getBuilder() {
		return builder;
	}
	private int tabsNumber = 0;
	
	public void levelUp(){
		++tabsNumber;
	}
	public void levelDown(){
		--tabsNumber;
	}
	private void appendTabs(){
		int temp=tabsNumber;
		for(;temp!=0;--temp)
			{
				builder.append("\t");
			}
	}
	public void append(String toAppend){
		appendTabs();
		builder.append(toAppend+"\n");
	}
	public void appendPlain(String toAppend){
		builder.append(toAppend);
	}
	public void appendN(String toAppend){
		builder.append(toAppend+"\n");
	}
	public void appendT(String toAppend){
		appendTabs();
		builder.append(toAppend);
	}
	
	
}
