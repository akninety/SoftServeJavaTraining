import java.lang.reflect.Array;
import java.util.*;

public class Exercise2 {

    //Exercise 1 Array
    static int arrayOne[] = {1, 2, 3, 4, 5, 10};

    //Exercise 2 Array
    static int arrayTwo[] = {1, 10, 100};

    //Exercise 3 Array
    static int arrayThree[] = {1, 2, 3, 4, 5, 6};

    //Exercise 4 Array
    static int arrayFour[] = {10,100,1000};

    //Exercise 5 Array
    static int arrayFive[] = {100, 29, 12, 47, 1000};

    //Exercise 6 Array
    static int arraySix[] = {1,2,3,100};

    //Exercise 7 Array
    static int arraySeven[] = {23, 35, 1, 100, 47};

    //Exercise 8 Array
    static int arrayEightA[] = {8,6,7,5,309};
    static int arrayEightB[] = {8,6,7,5,309};

    //Exercise 9 Collection
    static String [] arrayNine = {"alex","gordie","blackjack"};

    //Exercise 10 Collections
    static String [] arrayTenA = {"one", "two", "three"};
    static String [] arrayTenB = {"four", "five", "six"};

    //Exercise 11 Collection
    static List<String> arrayEleven = new ArrayList<String>(Arrays.asList("orange","blue","green","red","black"));

    //Exercise 12 Collection
    static List<Integer> arrayTwelve = Arrays.asList(1,2,3,100);

    //Exercise 13 Collection
    static List<Integer> arrayThirteen = Arrays.asList(12, 7, 33, 47, 1);

    public static void main(String[] args) {

        //Exercise 1
        System.out.println("Exercise 1.");
        arrayOneMethod();

        //Exercise 2
        System.out.println("Exercise 2.");
        System.out.println(arrayTwoMethod());

        //Exercise 3
        System.out.println("Exercise 3.");
        arrayThreeMethod();

        //Exercise 4
        System.out.println("Exercise 4.");
        arrayFourMethod();

        //Exercise 5
        System.out.println("Exercise 5.");
        arrayFiveMethod();

        //Exercise 6
        System.out.println("Exercise 6.");
        System.out.println(arraySixMethod());

        //Exercise 7
        System.out.println("Exercise 7.");
        arraySevenMethod();

        //Exercise 8
        System.out.println("Exercise 8");
        arrayEightMethod();

        //Exercise 9
        System.out.println("Exercise 9.");
        arrayNineMethod();

        //Exercise 10
        System.out.println("Exercise 10.");
        arrayTenMethod();

        //Exercise 11.
        //Still not sure about this...
        System.out.println("Exercise 11.");
        arrayElevenMethod();

        //Exercise 12
        System.out.println("Exercise 12.");
        arrayTwelveMethod();

        //Exercise 13
        System.out.println("Exercise 13.");
        arrayThirteenMethod();

        //Exercise 14
        HashMap<Integer,String> numToMonths = new HashMap<Integer, String>();
        numToMonths.put(1,"January");
        numToMonths.put(2,"February");
        numToMonths.put(3,"March");
        numToMonths.put(4,"April");
        numToMonths.put(5,"May");
        numToMonths.put(6,"June");
        numToMonths.put(7,"July");
        numToMonths.put(8,"August");
        numToMonths.put(9,"September");
        numToMonths.put(10,"October");
        numToMonths.put(11,"November");
        numToMonths.put(12,"December");

        System.out.println(numToMonths);

    }

    //Exercise 1 Method
    static void arrayOneMethod(){
        System.out.println(Arrays.toString(arrayOne));
    }

    //Exercise 2 Method
    static int arrayTwoMethod(){
        int sumArrayTwo = 0;
        for(int num : arrayTwo){
            sumArrayTwo+=num;
        }
        return sumArrayTwo;
    }

    //Exercise 3 Method
    static void arrayThreeMethod(){
        for(int i = 0; i < 5; i++){
            System.out.println(arrayThree[i]);
        }
    }

    //Exercise 4 Method
    static void arrayFourMethod(){
        for(int i = 0; i < arrayFour.length; i++){
            System.out.println(arrayFour[i]+1);
        }
    }

    //Exercise 5 Method
    static void arrayFiveMethod(){
        for(int i = 0; i < arrayFive.length; i++){
            if(arrayFive[i] < 47){
                System.out.println(arrayFive[i]);
            }
        }
    }

    //Exercise 6 Method
    static int arraySixMethod(){
        int arraySixMax = arraySix[0];

        for(int i = 0; i < arrayFive.length-1; i++){
            if(arraySix[i] > arraySixMax){
                arraySixMax=arraySix[i];
            }
        }
        return arraySixMax;
    }

    //Exercise 7 Method
    static void arraySevenMethod(){
        Arrays.sort(arraySeven);
        for(int num : arraySeven){
            System.out.println(num);
        }
    }

    //Exercise 8 Method
    static void arrayEightMethod(){
        boolean areEqual = Arrays.equals(arrayEightA,arrayEightB);
        System.out.println("Are arrays 8A and 8B equal? " + areEqual);
    }

    //Exercise 9 Method
    static void arrayNineMethod(){
        int itemNo = 1;
        for(int i = 0; i < arrayNine.length; i++){
            System.out.println("Item: " + itemNo + " " + arrayNine[i]);
            itemNo++;
        }

    }

    //Exercise 10 Method
    static void arrayTenMethod(){
        List<String> newList = new ArrayList<String>();
        newList.addAll(Arrays.asList(arrayTenA));
        newList.addAll(Arrays.asList(arrayTenB));

        System.out.println(newList);
    }

    //Exercise 11 Method.
    static void arrayElevenMethod(){
        for(String colors : arrayEleven) {
            if (colors == "red") {
                arrayEleven.remove("red");
            }
        }

        System.out.println(arrayEleven);

    }

    //Exercise 12 Method.
    static void arrayTwelveMethod(){
        System.out.println("Collections min value: " + Collections.min(arrayTwelve));
        System.out.println("Collections max value: " + Collections.max(arrayTwelve));
    }

    //Exercise 13 Method.
    static void arrayThirteenMethod(){
        Collections.sort(arrayThirteen);
        Collections.reverse(arrayThirteen);
        System.out.println(arrayThirteen);

    }

    //Exercise 14 Method.
    static void arrayFourteenMethod(){

    }

}
