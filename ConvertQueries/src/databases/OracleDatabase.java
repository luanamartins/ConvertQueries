package databases;

public class OracleDatabase implements DatabaseType {

	public void parseOracle(String fromDatabase, String query) {
		validate(query);

	}

	public void validate(String query) {
		// TODO Validate method of OracleDatabase
	}

	@Override
	public void parse(String fromDatabase, String query) {
		// TODO Auto-generated method stub

	}

}
