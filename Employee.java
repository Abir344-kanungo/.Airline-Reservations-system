public class Employee {
    private String empId;
    private String name;
    private String position;

    public Employee(String empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    public String getDetails() {
        return empId + ": " + name + " - " + position;
    }
}

