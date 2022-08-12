package homeworks;

import java.util.Arrays;
import java.util.OptionalInt;

public class HomeworkTo_12_08 {
    public static void main(String[] args) {
        /*
        Min & Max methods:
        Write a Java program to find arrays max value and min value. Write two methods
        max() and min() that take in as an argument int type array. Loop through array and
        find max value in max() method and min value in min() method. Both methods
        should return int value.
        Example method declaration getting array as argument

             Create example array with int values
             Print out arrays elements
             Call max() passing array and print out max value in array
             Call min() passing array and print out min value in array
        */

        int [] my_array = {1,2,20,4,5,6,0,8,9,10};
        System.out.println("Original Array: " + Arrays.toString(my_array));
        System.out.println("Maximum value for the above array = " + max(my_array));
        System.out.println("Minimum value for the above array = " + min(my_array));

    }

    public static int max(int [] my_array){
        int maxValue = my_array[0];
        for (int i = 0; i <= my_array.length - 1; i ++){
            if (my_array[i] > maxValue){
                maxValue = my_array[i];
            }
        }
        return maxValue;
    }

    public static int min(int [] my_array){
        int minValue = my_array[0];
        for (int i = 0; i <= my_array.length - 1; i ++){
            if (my_array[i]<minValue){
                minValue = my_array[i];
            }
        }
        return minValue;
    }
}
