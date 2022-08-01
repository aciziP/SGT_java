package homeworks;

import java.util.Scanner;

public class HomeworkTo_15_07 {
    //Homework till 15.07.2022
    public static void main(String[] args) {
        /*
        Create program that will ask for your name and date of birth
        and print response of your name and age in one sentence
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your year of birth: ");
        int birthDate = scanner.nextInt();
        int age = 2022 - birthDate;
        System.out.println("Your name is "+name + " and you are " + age + " year old");
        /*
        Write an application, that will calculate speed in kilometers
        per hour (km/h) equal to given speed in miles per hour (mph).
        Your application should read one variable from user (of type float)
        and calculate speed, using following formula:
        speed in km/h = 1.6 * speed in mp
         */
        System.out.println("Please enter speed in mp/h: ");
        float speed = scanner.nextInt();
        double speedInKm = 1.6 * speed;
        System.out.println(speed + " mp/h in km/h would be equal to " + speedInKm + " km/h");
    }
}
