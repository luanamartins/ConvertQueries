package data.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SelectStatement extends Statement{

	private List<Statement> modifiers;
	private List<Statement> columns;
	
	public SelectStatement(){
		modifiers = new ArrayList<Statement>();
		columns = new ArrayList<Statement>();
	}
	
	public void setColumns(List<Statement> columns){
		this.columns = columns;
	}
	
}
