package statements;

public class TableNameStatement extends Statement {

	String tableName;
	String alias;

	public TableNameStatement(String name) {
		this.tableName = name;
	}

	public TableNameStatement(String name, String alias) {
		this.tableName = name;
		this.alias = alias;
	}

}
