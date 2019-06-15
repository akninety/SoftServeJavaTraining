import java.sql.SQLOutput;

public class Exercise1 {

    public static void main(String[] args) {


        //Exercise1
        String name = "Alex";
        double money = 3.50;
        int age = 29;

        System.out.println(name + " is " + age + " and has " + money + " dollars.");

        //Exercise 2
        String day = "Tuesday";
        String month = "June";

        System.out.println("Today is " + day + " and the month is " + month + ".");

        //Exercise 3
        System.out.println("Integer Min and Max values:");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println("Float Min and Max values: ");
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println("Double Min and Max values: ");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println("Short Min and Max values: ");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println("Byte Min and Max values: ");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //Exercise 4
        String exerciseThreeString = "This is a really long string.";
        int exerciseThreeStringLength = exerciseThreeString.length();
        System.out.println("Exercise three string length: " + exerciseThreeStringLength);

        //Exercise 5
        if(month.equals("June")){
            System.out.println("The month is June.");
        } else
            System.out.println("The month is not June;");

        //Exercise 6
        int monthNum = 9;

        switch(monthNum){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("The month is June.");
        }

        //Exercise 7
        boolean conditionOne = true;
        boolean conditionTwo = true;

        if (conditionOne == true && conditionTwo == true){
            System.out.println("Both conditions are true.");
        } else if (conditionOne == false && conditionTwo == false){
            System.out.println("Both conditions are false");
        } else
            System.out.println("Combination of true and false conditions.");




    }


}
