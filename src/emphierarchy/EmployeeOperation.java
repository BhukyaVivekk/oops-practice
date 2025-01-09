package emphierarchy;

public interface EmployeeOperation {
    void addEmployee(Employee employee);

    void showAllEmployees();

    Employee findEmployeeById(int id);
}
