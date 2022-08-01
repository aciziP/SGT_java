package homeworks;

import java.util.Arrays;

public class HomeworkTo_29_07 {
    //Homework to 29.07.2022.
    public static void main(String[] args) {
        /*
        Copy an array:
        Write a Java program to copy an array by iterating it.
         Create an array (int type) put some random values in array and print out all
                elements (Source Array)
         Create a new empty array same size and type as first array.
         Loop through all elements from first array and put same elements in new
                        array
         Print out all elements from new array and it should look the same as first one
        */
        int[] randomValues = new int[]{25,14,56,15,36,56,77,18,29,49};
        System.out.println("Source Array: " + Arrays.toString(randomValues));


        int[] randomValuesNew = new int[10]; //int[] randomValuesNew = new int[randomValues.length];
        for(int i = 0; i < randomValues.length; i++){
            int a = randomValues[i];
            randomValuesNew[i] = a;
            //randomValuesNew[i] = randomValues[i];
        }

        System.out.println("New Array: " + Arrays.toString(randomValuesNew));


        /*
        Reverse arrays items:
        Write a Java program to reverse an array of integer values.
         Create an array (int type) put some random values in array and print out all
                elements.
         Use for loop to iterate through array and switch places with first and last
                element and then second from beginning and second from end etc. with rest
                of the elements
         Print out array elements using Arrays.toString() method
        PS. You are not allowed to create another array. Only change original one.
        */

        int[] randomValues2 = new int[] {1789,2035,1899,1456,2013,4458,2458,1254,1472,2365,1456,2165,1457,2456};
        System.out.println("Original array: " + Arrays.toString(randomValues2));

        for (int i = 0; i < randomValues2.length / 2; i++) {
            int t = randomValues2[i];
            randomValues2[i] = randomValues2[randomValues2.length - i - 1];
            randomValues2[randomValues2.length - i - 1] = t;
        }

        // printing the reversed array
        System.out.print("Reversed array is: " + Arrays.toString(randomValues2));

    }
}
