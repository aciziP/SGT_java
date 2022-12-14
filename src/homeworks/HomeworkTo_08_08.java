package homeworks;

import java.util.Scanner;

public class HomeworkTo_08_08 {
    public static void main(String[] args) {
        /*
        Palindrome :
        What is palindrome? - A palindrome is a word, number, phrase, or other sequence
        of characters which reads the same backward as forward, such as madam or racecar.
        Create a JAVA program that allows you to enter a String value and gives you output if
        what you entered is palindrome or not. Make sure that your code will accept
        examples like this (“Anna”, “akA”) where some letters are uppercase they still are
        considered as palindromes. And also cases where some extra spaces have been
        passed (“ madam ”, “ racecar”).
             Ask for user to enter a String value
             Create a for loop to check if first element of the String is equal to the last one
                    and then second is equal to second from the end and so on until you have
                    compared all of the elements.
             Create a logic that will make sure if all of the checks were true and in that
                    case you can print that passed value from the user is Palindrome otherwise
                    not.
             User printf formatting to get output similar to the examples below.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name  = scanner.nextLine().trim();
        String low_name = name.toLowerCase();
        String reverse = "";

        for ( int i = low_name.length() - 1; i >= 0; i-- )
            reverse = reverse + low_name.charAt(i);

        if (low_name.equals(reverse))
            System.out.printf("%s is a palindrome",name);
        else
            System.out.printf("%s is not a palindrome",name);


        //Right solution
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String input = scanner.nextLine().trim().toLowerCase().replaceAll(" ","");
        boolean isPalindrome = true;

        //(userInput.substring(i,i+1) != userInput.substring(userInput.length() - 2 - i,userInput.length() - 1 - i))


        for(int i = 0; i < input.length()/2; i++){

//            if(i == 0){
//                if(input.substring(i,i+1) != input.substring(input.length()-1)){
//                    isPalindrome = false;
//                    break;
//                }
//            } else {
//                if(input.substring(i,i+1) != input.substring(input.length() - 1 - i,input.length()  - i)){
//                    isPalindrome = false;
//                    break;
//                }
//            }
            // System.out.println(input.substring(i,i+1) + " and " + input.substring(input.length() - 2 - i,input.length() - 1 - i) );

            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.printf("Your input %s is a palindrome \n", input);
        }else {
            System.out.printf("Your input %s is not a palindrome \n", input);
        }*/
    }

}
