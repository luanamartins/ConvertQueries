package testcases.sqlserver;

import org.junit.Test;

import constants.DatabaseName;
import databases.SQLServerDatabase;

public class SqlServerToMySqlTest {

	@Test
	public void test() {
		SQLServerDatabase sqlServer = new SQLServerDatabase();
		sqlServer.parse(DatabaseName.MY_SQL, "");
	}
}
