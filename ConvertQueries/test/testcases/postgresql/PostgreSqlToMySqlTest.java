package testcases.postgresql;

import org.junit.Test;

import constants.DatabaseName;
import databases.PostgreSQLDatabase;

public class PostgreSqlToMySqlTest {

	@Test
	public void test() {
		PostgreSQLDatabase postgres = new PostgreSQLDatabase();
		postgres.parse(DatabaseName.MY_SQL, "");
	}
}
