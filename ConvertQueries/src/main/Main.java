package main;

import java.io.IOException;

import data.managers.TokenManager;
import data.managers.TokenUtils;

public class Main {

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
