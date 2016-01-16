package testcases.postgresql;

import org.junit.Test;

import constants.DatabaseName;
import databases.PostgreSQLDatabase;

public class PostgreSqlToSqlServerTest {

	@Test
	public void test() {
		PostgreSQLDatabase postgres = new PostgreSQLDatabase();
		postgres.parse(DatabaseName.SQL_SERVER, "");
	}
}
