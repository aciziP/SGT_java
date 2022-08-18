package homeworks;

import java.util.Scanner;

public class HomeworkTo_25_08 {
    /*
    Simulate the Game "Rock, Paper, Scissors":

    Create a method called rockPaperScissors which simulates the game "rock, paper,
    scissors". The method takes the input of both players (rock, paper or scissors),
    first parameter from first player, second from second player. The method returns
    the result as such:
             "Player 1 wins"
             "Player 2 wins"
             "TIE" (if both inputs are the same)

    The rules of rock, paper, scissor, if not known:
             Both players have to say either "rock", "paper" or "scissors" at the same time.
             Rock beats scissors, paper beats rock, scissors beat paper.

    Examples of calling a method and output
             rockPaperScissors ("rock", "paper") ➞ "Player 2 wins"
            
             rockPaperScissors ("paper", "rock") ➞ "Player 1 wins"
            
             rockPaperScissors ("paper", "scissors") ➞ "Player 2 wins"
            
             rockPaperScissors ("scissors", "scissors") ➞ "TIE"
            
             rockPaperScissors ("scissors", "paper") ➞ "Player 1 wins"

    You should use Scanner as input to ask first user what they choose (rock, paper,
    scissors) and then second user. Input should be String type so for example first user
    inputs “scissors” and second enters “paper” then call your created method and pass
    these values as input parameters. How to return result is up to you.

    Note: Make sure that your method works even if users inputs different variants of
    rock, paper, scissors for examples your method should work properly even if inputs
    would be something like this: “Rock”, “pApEr”, “SCISSORS”

    Addition to the task (optional): For those of who have watched “The Big Bang
    Theory” modify your method, so you could play rock paper scissors lizard spock.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.println("Choose game version: ");
            System.out.println("1 - Rock, Paper, Scissors ");
            System.out.println("2 - Rock, Paper, Scissors, Lizard, Spock ");
            int version = scanner.nextInt();

            System.out.println("Enter first player choice: ");
            String firstChoice = scanner.next() + scanner.nextLine();

            System.out.println("Enter second player choice: ");
            String secondChoice = scanner.nextLine();

            if (version == 1){
                System.out.println(rockPaperScissors(formatChoice(firstChoice),formatChoice(secondChoice)));
            } else if (version == 2) {
                System.out.println(rockPaperScissorsLizardSpock(formatChoice(firstChoice),formatChoice(secondChoice)));
            } else {
                System.out.println(boldOn() + "Something went wrong" + boldOff());
            }

            System.out.println("Do you want to continue to play?");
            System.out.println("y - yes");
            System.out.println("n - no");
            String continueChoice = scanner.next() + scanner.nextLine();

            if (continueChoice.equals("n")){
                break;
            }
        }
    }
    public static String formatChoice(String choice){
        return choice.toLowerCase().trim();
    }
    public static String rockPaperScissors(String firstChoice, String secondChoice){

        if(firstChoice.equals(secondChoice)) {
            return boldOn() + "TIE" + boldOff();
        } else if (firstChoice.equals("rock")){
            if (secondChoice.equals("scissors")){
                return boldOn() + "Player 1 wins" + boldOff();
            } else if(secondChoice.equals("paper")) {
                return boldOn() + "Player 2 wins" + boldOff();
            }
        } else if (firstChoice.equals("scissors")){
            if (secondChoice.equals("paper")){
                return boldOn() + "Player 1 wins" + boldOff();
            } else if (secondChoice.equals("rock")) {
                return boldOn() + "Player 2 wins" + boldOff();
            }
        } else if (firstChoice.equals("paper")) {
            if (secondChoice.equals("rock")) {
                return boldOn() + "Player 1 wins" + boldOff();
            } else if (secondChoice.equals("scissors")) {
                return boldOn() + "Player 2 wins" + boldOff();
            }
        }
        return "Something went wrong";
    }


    public static String rockPaperScissorsLizardSpock(String firstChoice, String secondChoice){

        if(firstChoice.equals(secondChoice)) {
            return boldOn() + "TIE" + boldOff();
        } else if (firstChoice.equals("rock")){
            switch (secondChoice) {
                case "scissors":
                case "lizard":
                    return boldOn() + "Player 1 wins" + boldOff();
                case "spock":
                case "paper":
                    return boldOn() + "Player 2 wins" + boldOff();
            }
        } else if (firstChoice.equals("scissors")){
            switch (secondChoice) {
                case "paper":
                case "lizard":
                    return boldOn() + "Player 1 wins" + boldOff();
                case "rock":
                case "spock":
                    return boldOn() + "Player 2 wins" + boldOff();
            }
        } else if (firstChoice.equals("paper")) {
            switch (secondChoice) {
                case "rock":
                case "spock":
                    return boldOn() + "Player 1 wins" + boldOff();
                case "scissors":
                case "lizard":
                    return boldOn() + "Player 2 wins" + boldOff();
            }
        } else if (firstChoice.equals("lizard")) {
            switch (secondChoice) {
                case "paper":
                case "spock":
                    return boldOn() + "Player 1 wins" + boldOff();
                case "scissors":
                case "rock":
                    return boldOn() + "Player 2 wins" + boldOff();
            }
        } else if (firstChoice.equals("spock")) {
            switch (secondChoice) {
                case "rock":
                case "scissors":
                    return boldOn() + "Player 1 wins" + boldOff();
                case "paper":
                case "lizard":
                    return boldOn() + "Player 2 wins" + boldOff();
            }
        }
        return boldOn() + "Something went wrong" + boldOff();
    }

    public static String boldOn(){
        return "\n\033[1m";
    }

    public static String boldOff(){
        return "\033[0m\n";
    }
}

