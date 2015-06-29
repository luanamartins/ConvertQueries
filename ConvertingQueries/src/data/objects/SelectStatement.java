package data.objects;

import java.util.ArrayList;
import java.util.List;

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
	
	public void setModifiers(List<Statement> modifiers){
		this.modifiers = modifiers;
	}

	public List<Statement> getModifiers() {
		return modifiers;
	}

	public List<Statement> getColumns() {
		return columns;
	}
	
	
	
}
