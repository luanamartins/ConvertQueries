package data;

import java.util.ArrayList;
import java.util.List;

public class WhereStatement {

	private List<Statement> tables;

	public WhereStatement() {
		tables = new ArrayList<Statement>();
	}

	public List<Statement> getTables() {
		return tables;
	}

	public void setTables(List<Statement> tables) {
		this.tables = tables;
	}

}
