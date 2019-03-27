public class Employee {

    public String name;
    public String gender;
    public int age;
    private static int counter = 0;

    public Employee(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        counter++;
    }

    public Employee(){
        this.name = "First Name";
        this.gender = "Undefined";
        this.age = 0;
        counter++;
    }

    public static int getNumberOfInstances (){
        return counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name != ""){
        this.name = name;}
    }

    public String getGender(String value) {
        if(value == "m" || value == "f") {
            return gender; }
        return "There are only two genders.";
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }
}

