import java.util.Objects;

public class Employee {

    private final String name;
    private int salary;
    private int department;
    public int id;
    public int counter = 0;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = counter++;

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalar(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Сотрудник № " + id + "; под именем: " + name + "; из отдела № " + department + "; получает зарплату в размере " + salary + " рублей";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return false;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && salary == employee.salary && department == employee.department && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary);
    }
}
