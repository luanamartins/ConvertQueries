package data.managers;

import java.util.StringTokenizer;

public class TokenManager {

	private String fromDatabase;
	private String toDatabase;
	
	public TokenManager(String fromDatabase, String toDatabase){
		this.fromDatabase = fromDatabase;
		this.toDatabase = toDatabase;
	}
	
	public void parse(StringTokenizer tokens){
		
		System.out.println(tokens);
		System.out.println(tokens.countTokens());
		while(tokens.hasMoreTokens()){
			System.out.println(tokens.nextToken());
		}
	}
	
}
