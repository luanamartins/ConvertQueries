package testcases.oracle;

import org.junit.Test;

import constants.DatabaseName;
import databases.OracleDatabase;

public class OracleToPostgreSqlTest {

	@Test
	public void test() {
		OracleDatabase oracle = new OracleDatabase();
		oracle.parse(DatabaseName.POSTGRESQL, "");
	}

}
