import java.util.Scanner;

public class IfStatements {
    //15.07.2022
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade");
        int grade = scanner.nextInt();

        //Print out "Good job!" if grade is over 6

        if (grade > 6){
            System.out.println("Good job!");
        } else{
            System.out.println("Better luck next time");
        }

        //Print out "You have fever!" if temp is over 36.8 and print "You are healthy" if not
        float temp = 36.5f;
        if (temp > 36.8){
            System.out.println("You have fever!");
        }else{
            System.out.println("You are healthy");
        }

        // ELSE IF

        if (grade < 4){
            System.out.println("Very bad!");
        } else if (grade >= 4 && grade <= 5){
            System.out.println("Okey!");
        } else if (grade == 6){
            System.out.println("Nice!");
        } else if (grade >= 7 && grade <=10){
            System.out.println("Very good!");
        }

    }
}
