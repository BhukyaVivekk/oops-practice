package emphierarchy;

public class FronEnd extends Developer{
    private String styling;

    public FronEnd(int id, String name, double salary, String language, String styling) {
        super(id, name, salary, language);
        this.styling = styling;
    }

    public String getStyling() {
        return styling;
    }

    public void setStyling(String styling) {
        this.styling = styling;
    }
    public void printDetails() {
        super.printDetails();
        System.out.println("Styling : "+styling);
    }
}
