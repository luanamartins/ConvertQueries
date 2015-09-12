package main;

import java.io.IOException;

import data.managers.TokenManager;
import data.managers.TokenUtils;

public class Main {
	
	/**
	 * Oracle Queries syntax:
	 * http://docs.oracle.com/cd/E17952_01/refman-5.0-en/select.html
	 * http://docs.oracle.com/cd/B19306_01/server.102/b14200/statements_10002.htm
	 * 
	 * SQL Server Queries syntax:
	 * https://msdn.microsoft.com/en-us/library/ms189499.aspx
	 * https://msdn.microsoft.com/en-us/library/ms187731.aspx
	 * 
	 * */
	
	public static void main(String[] args) {
		try {
			String query = TokenUtils.readFile("files/script1.sql");
			String fromDatabase = "SQL Server";
			String toDatabase = "Oracle";
			TokenManager tokenManager = new TokenManager(fromDatabase, toDatabase);
			tokenManager.parse(query);
			System.out.println(query);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
