package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

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
		String query = "SELECT     EmployeeID, FirstName, LastName, HireDate, City"
					+ " FROM       Employees" + 
					" WHERE      (HireDate >= '1-june-1992') AND (HireDate <= '15-december-1993')";
		StringTokenizer tokens = new StringTokenizer(query);
		
		System.out.println(tokens);
		System.out.println(tokens.countTokens());
		while(tokens.hasMoreTokens()){
			System.out.println(tokens.nextToken());
		}
		
		System.out.println();
	}

	private static String readFile(String filename) {
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
			
			StringBuffer buffer = new StringBuffer();
			while(reader.ready()){
				buffer.append(reader.readLine());
			}
			reader.close();
			return buffer.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
