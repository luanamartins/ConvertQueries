package testcases;

import org.junit.Test;

import constants.DatabaseName;
import databases.OracleDatabase;

public class OracleToMySqlTest {

	@Test
	public void test() {
		OracleDatabase oracle = new OracleDatabase();
		oracle.parse(DatabaseName.MY_SQL, "");
		
	}

}
