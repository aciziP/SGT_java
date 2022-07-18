import java.util.Scanner;

public class NestedIf {
    //18.07.2022. Lecture. Nested if statements
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter score");
        float score = scanner.nextFloat();

        if(score <= 40.0f){
            System.out.println("Score: <= 40%");
        } else if (score > 40.0f && score <= 80.0f){
            System.out.println("40% < score <= 80%");
            if(score <= 70.0f){
                System.out.println("<= 70%");
            }else{
                System.out.println(">70%");
            }
        }else{
            System.out.println("80% < score <= 100%");
            // Cast score to int type
            // And determine if score is odd or even and print "odd" or "even"
            int roundedScore = Math.round(score);
            if (roundedScore % 2==0){
                System.out.println(roundedScore + " is odd");
            }else{
                System.out.println(roundedScore + " is even");
            }
        }
    }
}
