package homeworks;

import java.util.Scanner;

public class HomeworkTo_25_07 {
    //Homework to 25.07.2022

    public static void main(String[] args) {
        /*
        Enter arrays size and add elements:
        Create a JAVA program that allows you to enter a size of an array (type int). Then ask
        for user to enter each element one by one.
             Ask for user to enter a positive number that will be the arrays size
             Create an empty array that will contain int data type values in size of entered
                    value
             Using for loop ask user to enter array elements one by one
             Print out all array elements
            */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of the array:");
        int arraySize = scanner.nextInt();

        int[] numberArray = new int[arraySize];

        System.out.println("Enter the the elements of the array one by one:");
        for (int i = 0; i <= numberArray.length-1; i++){
            System.out.println("Please enter element number: " + (i+1));
            numberArray[i] = scanner.nextInt();
        }

        System.out.print("Source Array: ");
        //Print out all elements
        for (int i = 0; i < numberArray.length; i++){
            System.out.print(numberArray[i] + " ");
        }

    }
}
