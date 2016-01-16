package testcases;

import org.junit.Test;

import constants.DatabaseName;
import databases.SQLServerDatabase;

public class SqlServerToOracleTest {

	@Test
	public void test() {
		SQLServerDatabase oracle = new SQLServerDatabase();
		oracle.parse(DatabaseName.ORACLE, "");
	}

}
