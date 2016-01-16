package testcases;

import org.junit.Test;

import constants.DatabaseName;
import databases.OracleDatabase;

public class OracleToSqlServerTest {

	@Test
	public void test() {
		OracleDatabase oracle = new OracleDatabase();
		oracle.parse(DatabaseName.SQL_SERVER, "");
	}

}
