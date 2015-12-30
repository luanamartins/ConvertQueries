package databases;

public interface DatabaseType {

	public void validate();

	public void parse(String fromDatabase, String query);
}
