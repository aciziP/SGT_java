package lecture_25_07_tasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
        Average grade in array:
        Use the same functionality from previous task (change array type to float) and create
        array. Sum all elements in the array and calculate average grade.
             Ask for user to enter a positive number that will be the arrays size
             Create an empty array that will contain Float data type values in size of
                    entered value
             Using for loop ask user to enter array elements one by one
             Calculate and print out all value average
             Print out count of grades:
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of the array:");
        int arraySize = scanner.nextInt();
        int sum = 0;

        float[] numberArray = new float[arraySize];

        System.out.println("Enter the grades of the array one by one:");
        for (int i = 0; i <= numberArray.length-1; i++){
            System.out.println("Please enter grade number: " + (i+1));
            numberArray[i] = scanner.nextInt();
            sum += numberArray[i];
        }

        float average = (float) sum/arraySize;
        System.out.println("Average grade: " + average);

        System.out.println("There was passed " + arraySize + " values");

    }
}
