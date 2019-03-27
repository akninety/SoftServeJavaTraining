public class Manager extends Employee {

    public String department;
    public int tenure;

    public Manager (String department, int tenure, String name, String gender, int age) {
        super(name, gender, age);
        this.department = department;
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                ", tenure=" + tenure +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

}
