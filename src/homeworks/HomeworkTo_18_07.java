import java.util.Scanner;

public class HomeworkTo_18_07 {
    //Homework till 18.07.2022
    public static void main(String[] args) {
        /*
        Create a JAVA program that allows you to enter three numbers
        and then will output the greatest of them.
         Ask for user to enter three numbers (int type) one by one
         Determine the greatest of these numbers and print it out.
        Test example:
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
        Expected Output :
        The greatest: 87
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Input the 2nd number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Input the 3rd number: ");
        int numberThree = scanner.nextInt();

/*        if (numberOne>=numberTwo && numberOne>=numberThree){
            System.out.println("The greatest: " + numberOne);
        } else if (numberTwo>=numberOne && numberTwo>=numberThree){
            System.out.println("The greatest: " + numberTwo);
        } else {
            System.out.println("The greatest: " + numberThree);
        }*/

        System.out.println("The greatest: " + Math.max((Math.max(numberOne,numberTwo)),numberThree));


        /*
        Leap year:
        Create a JAVA program that determines if year is leap or not.
        User should enter positive value and program should print out
        either “Leap year” or “Not a leap year”

        How to calculate if it’s a leap year:

         it's divisible by 400, or
         it's divisible by 4 and it's not divisible by 100.

        Example: 1600 and 1512 are leap years, but 1700 and 1514 are not.
         */

        int year = scanner.nextInt();
/*        if (year%400==0){
            System.out.println(year + " are leap year.");
        } else if (year%4==0 && year%100!=0){
            System.out.println(year + " are leap year.");
        } else {
            System.out.println(year + " are not a leap year.");
        }*/

        if ((year%4==0 && year%100!=0)||year%400==0){
            System.out.println(year + " are leap year.");
        } else {
            System.out.println(year + " are not a leap year.");
        }
    }
}
