package emphierarchy;

public class Developer extends Employee{
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Developer(int id, String name, Double salary, String language) {
        super(id, name, salary);
        this.language = language;
        System.out.println("programming language :"+language);
    }
    public void displayDetails(){
        System.out.println("Developer Details : ");
        System.out.printf("""
                ID : %d
                Name : %s
                Salary : %.2f
                Language : %s
                """,getId(),getName(),getSalary(),language);
    }




}
