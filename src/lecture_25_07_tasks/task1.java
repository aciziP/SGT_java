package lecture_25_07_tasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*
        Sum all elements in array:
        Use the same functionality from previous task and create array. Sum all elements in
        the array.
         Ask for user to enter a positive number that will be the arrays size
         Create an empty array that will contain int data type values in size of entered
                value
         Using for loop ask user to enter array elements one by one
         Print out sum of all elements in the array
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

        System.out.println("\nSum of all elements: ");
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++){
            sum += numberArray[i];
        }
        System.out.print(sum);
    }
}
