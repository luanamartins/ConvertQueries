package data.managers;

public class TokenStatement {

	// Basic tokens
	public final static String SELECT_STATEMENT = "SELECT";
	public final static String WHERE_STATEMENT = "WHERE";
	public final static String FROM_STATEMENT = "FROM";

	// Modifiers tokens
	public final static String DISTINCT_STATEMENT = "DISTINCT";
	public final static String GROUP_BY_STATEMENT = "GROUP BY";
	public final static String ORDER_BY_STATEMENT = "ORDER BY";
	public final static String HAVING_STATEMENT = "HAVING";
	public final static String INNER_JOIN_STATEMENT = "INNER JOIN";
	public final static String LEFT_JOIN_STATEMENT = "LEFT JOIN";
	public final static String LIKE_STATEMENT = "LIKE";
	
	// Logical tokens
	public final static String AND_STATEMENT = "AND";
	public final static String OR_STATEMENT = "OR";
	
	// Set tokens
	public final static String MINUS_STATEMENT = "MINUS";
	public final static String UNION_STATEMENT = "UNION";
	public final static String INTERSECT_STATEMENT = "INTERSECT";
	public final static String EXCEPT_STATEMENT = "EXCEPT";
	
	// Update tokens
	public final static String UPDATE_STATEMENT = "UPDATE";
	public final static String SET_STATEMENT = "SET";
	
}
