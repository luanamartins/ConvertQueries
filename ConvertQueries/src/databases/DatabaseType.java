package databases;

public interface DatabaseType {

	public void validate(String query);
	public void parse(String fromDatabase, String query);
}
