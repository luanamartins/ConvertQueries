package statements;

import java.util.ArrayList;
import java.util.List;

public class FromStatement extends Statement {

	List<Statement> tables;

	public FromStatement() {
		tables = new ArrayList<Statement>();
	}

	public void setTables(List<Statement> tables) {
		this.tables = tables;
	}

}
