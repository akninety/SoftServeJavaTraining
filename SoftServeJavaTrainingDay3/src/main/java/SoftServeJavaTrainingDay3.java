public class SoftServeJavaTrainingDay3 {

    public static void main(String[] args) {

        /*Exercise 1*/
        System.out.println(add(12, 21));

        /*Exercise 2 - Skip*/

        /*Exercise 3*/
        System.out.println(evenNum(11));

        /*Exercise 4 - Skip*/

        /*Exercise 5 and 6*/
        Employee Alex = new Employee();
        Alex.name = "Alex";
        Alex.department = "RND";
        Alex.extension = 12;

        Employee Regina = new Employee();
        Regina.name = "Regina";
        Regina.department = "MGMT";
        Regina.extension = 7;

        Employee Alex2 = new Employee();
        Alex2.name = "Alex";
        Alex2.department = "RND";
        Alex2.extension = 12;

        System.out.println(Alex.toString());
        System.out.println(Regina.toString());

        Alex.eat();
        Regina.hello();

        System.out.println(Alex.equals(Regina));
        System.out.println(Alex.equals(Alex2));

    }

    /*Exercise 1 Method*/
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /*Exercise 3 Method*/
    public static int evenNum (int num) {
        if (num % 2 == 0){
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        return num;
    }
}
