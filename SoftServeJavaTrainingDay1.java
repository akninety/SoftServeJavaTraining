public class SoftServeJavaTrainingDay1 {
    public static void main(String[] args) {

        /*Exercise 1*/
        String cards = "Black Jack";
        int num = 21;

        System.out.println(cards + num);

        /*Exercise 2*/
        String name = "Alex";
        int age = 28;

        System.out.println(name + " is " + age + " years old.");

        /*Exercise 3*/
        exercise3(Integer.TYPE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        exercise3(Long.TYPE, Long.MIN_VALUE, Long.MAX_VALUE);
        exercise3(Double.TYPE, Double.MIN_VALUE, Double.MAX_VALUE);
        exercise3(Float.TYPE, Float.MIN_VALUE, Float.MAX_VALUE);
        exercise3(Byte.TYPE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        exercise3(Short.TYPE, Short.MIN_VALUE, Short.MAX_VALUE);

        /*Exercise 4*/
        exercise4("Alex is 1337");

        /*Exercise 5*/
        exercise5(true);

        /*Exercise 6*/
        exercise6(4);

        /*Exercise 7*/
        exercise7(-10,100);


    }
    /*Exercise 3 Method*/
    public static void exercise3(Class<?> type, Number min, Number max) {
        System.out.println("Data Type: " + type + " Minimum value: "+  min + " Maximum value: " + max);
    }

    /*Exercise 4 Method*/
    public static void exercise4(String count) {
        System.out.println(count.length());
    }

    /*Exercise 5 Method*/
    public static void exercise5(boolean value) {
        if(value == true){
            System.out.println("The condition is true");
        } else {
            System.out.println("The condition is false");
        }
    }

    /*Exercise 6 Method*/
    public static void exercise6(int month) {
        switch (month) {
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
        }

    }

    /*Exercise 7 Method*/
    public static void exercise7(int num1, int num2) {
        if (num1 > 0 && num2 != num1)
            System.out.println("The condition is true.");
        else {
            System.out.println("The condition is false.");
        }

    }
}
