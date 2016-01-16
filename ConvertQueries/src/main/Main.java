package main;

import java.io.IOException;

import managers.TokenManager;
import utils.FileUtils;

public class Main {

	public static void main(String[] args) {
		try {
			String query = FileUtils.readFile("files/script1.sql");
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
