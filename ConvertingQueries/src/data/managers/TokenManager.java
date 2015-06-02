package data.managers;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import data.objects.SelectStatement;
import data.objects.Statement;
import data.objects.TableNameStatement;

public class TokenManager {
	
	private String fromDatabase;
	private String toDatabase;
	
	public TokenManager(String fromDatabase, String toDatabase){
		this.fromDatabase = fromDatabase;
		this.toDatabase = toDatabase;
	}

	public List<Statement> parse(String query){
		StringTokenizer tokens = new StringTokenizer(query);
		List<Statement> queryListToken = new ArrayList<Statement>();
		List<Statement> aux = new ArrayList<Statement>();
		while(tokens.hasMoreTokens()){
			String token = tokens.nextToken();
			if(token.equals(TokenStatement.SELECT_STATEMENT)){
				
				token = tokens.nextToken();
				while(!token.equals(TokenStatement.FROM_STATEMENT)){
					aux.add(new TableNameStatement(token));
					token = tokens.nextToken();
				}
				SelectStatement selectStatement = new SelectStatement();
				selectStatement.setColumns(aux);
				queryListToken.add(selectStatement);
				aux.clear();
			}
			if(token.equals(TokenStatement.FROM_STATEMENT)){
				token = tokens.nextToken();
				while(!token.equals(TokenStatement.WHERE_STATEMENT)){
					aux.add(new TableNameStatement(token));
					token = tokens.nextToken();
				}
				// TODO Statement of FROM -> TableStatement
				aux.clear();
			}
			if(token.equals(TokenStatement.WHERE_STATEMENT)){
				
			}
		}
		
		// TODO make parse
		return queryListToken;
	}
	
	public void validate(String query){
		if(toDatabase.equals(TokenDatabaseUtils.SQL_SERVER))
			parseSQLServer(fromDatabase, query);
		else if(toDatabase.equals(TokenDatabaseUtils.ORACLE))
			parseOracle(fromDatabase, query);
		else if(toDatabase.equals(TokenDatabaseUtils.POSTGRESQL))
			parsePostgreSQL(fromDatabase, query);
	}
	
	public void parseSQLServer(String fromDatabase, String query){
		// TODO make parse SQLServer
		//StringTokenizer tokens = new StringTokenizer(query);
		
	}
	
	public void parseOracle(String fromDatabase, String query){
		// TODO make parse Oracle
		
	}
	
	public void parsePostgreSQL(String fromDatabase, String query){
		// TODO make parse PostgreSQL		
	}
	
}
