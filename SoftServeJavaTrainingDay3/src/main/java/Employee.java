import java.util.Objects;

public class Employee {

    public String name;
    public String department;
    public int extension;

    public void hello(){
        System.out.println(name + " says Hello!");
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", extension=" + extension +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return extension == employee.extension &&
                Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, extension);
    }
}
