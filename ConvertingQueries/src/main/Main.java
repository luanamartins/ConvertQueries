package main;

import java.util.StringTokenizer;

import data.managers.TokenManager;

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
//		String inputFileStr = readFile("");
		String query = "SELECT EmployeeID, FirstName, LastName, HireDate, City"
					+ " FROM Employees" + 
					" WHERE (HireDate >= '1-june-1992') AND (HireDate <= '15-december-1993')";
		StringTokenizer tokens = new StringTokenizer(query);
		TokenManager tokenManager = new TokenManager("","");
		tokenManager.parse(tokens);
		
		System.out.println();
	}

	
}
