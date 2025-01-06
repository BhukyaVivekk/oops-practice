package emphierarchy;

public class BackEnd extends Developer{
    private String database;

    public BackEnd(int id, String name, double salary, String language, String database) {
        super(id, name, salary, language);
        this.database = database;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Styling : "+database);
    }
}
