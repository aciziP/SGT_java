import java.util.Scanner;

public class InputClass {
    //13.07.2022
    //User input
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Your name is: " + name);

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);
    }
}
