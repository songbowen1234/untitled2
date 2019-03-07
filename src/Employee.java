import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;

    public Employee() {
    }

    public Employee(String name, double salary, LocalDate hireday) {
        this.name = name;
        this.salary = salary;
        this.hireday = hireday;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireday(LocalDate hireday) {
        this.hireday = hireday;
    }
}
