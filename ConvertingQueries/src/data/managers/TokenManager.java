package data.managers;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import data.objects.Statement;

public class TokenManager {
	
	private String fromDatabase;
	private String toDatabase;
	
	public TokenManager(String fromDatabase, String toDatabase){
		this.fromDatabase = fromDatabase;
		this.toDatabase = toDatabase;
	}

	public List<Statement> parse(StringTokenizer tokens){
		List<Statement> queryListToken = new ArrayList<Statement>();
		// TODO make parse
		return queryListToken;
	}
	
	public void validate(){
		if(toDatabase.equals(TokenDatabaseUtils.SQL_SERVER))
			parseSQLServer(fromDatabase);
		else if(toDatabase.equals(TokenDatabaseUtils.ORACLE))
			parseOracle(fromDatabase);
		else if(toDatabase.equals(TokenDatabaseUtils.POSTGRESQL))
			parsePostgreSQL(fromDatabase);
	}
	
	public void parseSQLServer(String fromDatabase){
		// TODO make parse SQLServer
	}
	
	public void parseOracle(String fromDatabase){
		// TODO make parse Oracle		
	}
	
	public void parsePostgreSQL(String fromDatabase){
		// TODO make parse PostgreSQL		
	}
	
}
