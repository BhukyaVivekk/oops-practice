package emphierarchy;

public class Manager extends Employee {
    private String teamSize;

    public Manager(int id, String name, Double salary, String teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    public String getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(String teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager Details : ");
        System.out.printf("""
                ID : %d
                Name : %s
                Salary : %.2f
                Team Size : %s
                """,getId(),getName(),getSalary(),teamSize);
    }
}
