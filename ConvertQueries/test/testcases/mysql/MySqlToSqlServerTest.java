package testcases.mysql;

import org.junit.Test;

import constants.DatabaseName;
import databases.MySQLDatabase;

public class MySqlToSqlServerTest {

	@Test
	public void test() {
		MySQLDatabase mysql = new MySQLDatabase();
		mysql.parse(DatabaseName.SQL_SERVER, "");
	}

}
