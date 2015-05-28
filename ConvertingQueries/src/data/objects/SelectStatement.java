package data.objects;

import java.util.List;
import java.util.StringTokenizer;

public class SelectStatement extends Statement{

	private List<Statement> columns;
	
	public SelectStatement(List<Statement> columns){
		this.columns = columns;
	}
	
	public boolean validateStatement(StringTokenizer tokens){
		// TODO Validation of selectstatement
		
		return true; 
	}
	
}
