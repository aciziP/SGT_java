package lecture_10_08_tasks;

import java.util.Scanner;

public class LeapYearInMethod {
    public static void main(String[] args) {
        /*Leap Year in method:
        Create a method that allows to pass any year and it will determine if its leap year or
        not. Use the code we already have developed.

             Transfer this code in structure of method named determine LeapYear
             It should be of returning type void
             It should ask for one argument type int
             And print out it given year is leap or not
                    You should be able to call method like this

        *Additional task: modify method so it has return type of String and return answer in
        text. Something like this:
        */

        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any year");
        year = scanner.nextInt();

        determineLeapYear(year);

        String leap = determineLeapYearReturn(year);
        System.out.println(leap);
    }

    public static void determineLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static String determineLeapYearReturn(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return year + " is a leap year";
        } else {
            return year + " is not a leap year";
        }
    }
}
