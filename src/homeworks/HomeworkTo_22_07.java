import java.util.Scanner;

public class HomeworkTo_22_07 {
    // Homework to 22.07.2022.
    public static void main(String[] args) {
        /*Printout numbers:
        Write an application, that will read a number (of type int) and will write in one line
        all numbers starting from given number to 0 (included). Keep in mind that given
        number may be equal to 0 or be negative. Use scanner to read input from user.

        Examples:
             for given number: 5, application should write: 5 4 3 2 1 0
             for given number: 0, application should write: 0
             for given number: -4, application should write: -4 -3 -2 -1 0*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int input = scanner.nextInt();

        if (input == 0){
            System.out.println(0);
        } else if (input > 0) {
            for(int i = input; i >= 0; i--){
                System.out.print(i + " ");
            }
        } else {
            for(int i = input; i <= 0; i++){
                System.out.print(i + " ");
            }
        }
    }

}
