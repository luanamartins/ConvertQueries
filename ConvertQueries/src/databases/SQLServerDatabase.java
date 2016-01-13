package databases;

public class SQLServerDatabase implements DatabaseType {

	public void parseSQLServer(String fromDatabase, String query) {
		// TODO make parse SQLServer
		// StringTokenizer tokens = new StringTokenizer(query);
		validate(query);
	}

	@Override
	public void validate(String query) {
		// TODO Validate method of SQLServerDatabase
	}

	@Override
	public void parse(String fromDatabase, String query) {
		// TODO Auto-generated method stub

	}
}
