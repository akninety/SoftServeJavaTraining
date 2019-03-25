import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SoftServeJavaTrainingDay2 {
    private static String[] array9;

    public static void main(String[] args) {

        /*Exercise 1*/
        int firstarray[]={1,12,28};
        exercise1(firstarray);

        /*Exercise 2*/
        int secondarray[]={1,12,28};
        exercise2(secondarray);

        /*Exercise 3*/
        int thirdarray[]={1,12,28,100,1000,21,1337};
        exercise3(thirdarray);

        /*Exercise 4*/
        int fourtharray[]={1,12,28,};
        exercise4(fourtharray);

        /*Exercise 5*/
        /*Not sure how to do this?*/

        /*Exercise 6*/
        int sixtharray[]={1,28,12,4};
        exercise6(sixtharray);

        /*Exercise 7*/
        int seventharray[]={2,1,100,28};
        exercise7(seventharray);

        /*Exercise 8*/
        int array8a[]={1,2,3};
        int array8b[]={1,2,4};
        exercise8(array8a,array8b);

        /*Exercise 9*/
        String[] array9 = new String[] {"qwerty", "asdf", "abc123"};
        exercise9(array9);

        /*Exercise 10*/
        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("a");
        list1.add("b");
        list1.add("c");

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("d");
        list2.add("e");
        list2.add("f");

        ArrayList<String> merge = new ArrayList<String>();
        merge.addAll(list1);
        merge.addAll(list2);

        System.out.println(merge);

        /*Exercise 11-14: I give up...*/

    }

    /*Exercise 1 Method*/
    public static void exercise1(int[] input1) {
        for (int counter = 0; counter < input1.length; counter++) {
            System.out.println(input1[counter]);
        }
    }

    /*Exercise 2 Method*/
    public static int exercise2(int[] input2) {
        int sum = 0;
        for (int value : input2) {
            System.out.println(sum+=value);
        }
        return sum;
    }

    /*Exercise 3 Method*/
    public static void exercise3(int[] input3) {
        for (int counter = 0; counter < 5; counter++){
            System.out.println(input3[counter]);
        }
    }

    /*Exercise 4 Method*/
    public static void exercise4(int[] input4) {
        for (int counter = 0; counter < input4.length; counter++){
            System.out.println(input4[counter]+=1);
        }
    }

    /*Exercise 5 Method*/
    /*Not sure how to do this?*/

    /*Exercise 6 Method*/
    public static void exercise6(int[] input6) {
        int max = input6[0];
        for (int counter = 0; counter < input6.length; counter++) {
            if (input6[counter] > max){
                max = input6[counter];
            }
            System.out.println(max);
        }
    }

    /*Exercise 7 Method*/
    public static void exercise7(int[] input7) {
        Arrays.sort(input7);
        System.out.println(Arrays.toString(input7));
    }

    /*Exercise 8 Method*/
    public static void exercise8(int[] array8a, int[] array8b) {
        if (Arrays.equals(array8a,array8b))
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal");
    }

    /*Exercise 9 Method*/
    public static void exercise9(String[] input9) {
        for (int counter = 0; counter < input9.length; counter++){
            System.out.println("Item: " + counter + " " + input9[counter]);
        }

    }

}