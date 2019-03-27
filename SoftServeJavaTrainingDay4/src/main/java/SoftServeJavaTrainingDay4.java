import com.sun.org.apache.xml.internal.security.signature.reference.ReferenceNodeSetData;

public class SoftServeJavaTrainingDay4 {

    public static void main(String[] args) {
        System.out.println("START.");

        Employee Alex = new Employee("Alex","m",28);
        System.out.println(Alex);

        Employee Robot = new Employee ();
        System.out.println(Robot);

        Manager Regina = new Manager("RND",10, "Regina","f",40 );
        System.out.println(Regina);

        Manager Bob = new Manager("RND",1,"Bob","m",50);
        System.out.println(Bob);

        System.out.println(Employee.getNumberOfInstances());

        Alex.setName("Alex Kordas");
        System.out.println(Alex);

        System.out.println(Robot.getGender("other"));

    }


}
