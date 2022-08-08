import java.util.Locale;
import java.util.Scanner;
public class StringExamples {
    //03.08.2022

    public static void main(String[] args) {
        String text1 = "This is text example";
        String text2 = text1.intern();
        System.out.println(text2);

        //CONCATENATION OF STRINGS

        String input1 = "This is ";
        String input2 = "input text";

        String inputCombined = input1.concat(input2);
        System.out.println(inputCombined);

        //Comparing strings

        String val1 = "Test";
        String val2 = "Test";
        System.out.println(val1.equals(val2));

        //String class methods

        String inputText = "This is my text";

        System.out.println(inputText.length());
        System.out.println(inputText.toUpperCase());

        //To lowercase
        System.out.println(inputText.toLowerCase());

        //STRING CLASS METHODS - INDEXOF()
        String speakingText = "This is test value";
        System.out.println(speakingText.indexOf('e'));
        System.out.println(speakingText.indexOf(" is "));

        //REPLACEALL()
        //Šūdas

        String textForTV = "This phone is complete šūdas. And this case also is šūdas.";
        System.out.println(textForTV.replaceAll("šūdas", "š***s"));

        //Character index
        System.out.println(textForTV.charAt(textForTV.length()-1));

        //Substring
        System.out.println(textForTV.substring(5));
        System.out.println(textForTV.substring(5,12));

        //Parsing
        //Converting String to primitive Data types

        String intValue = "165";
        String floatValue = "2.0";
        String doubleValue = "2.4545345345";
        String boolValue = "true";
        String longValue = "100000000000000";

        System.out.println(Integer.parseInt(intValue) + 4);
        System.out.println(Float.parseFloat(floatValue));
        System.out.println(Double.parseDouble(doubleValue));
        System.out.println(Boolean.parseBoolean(boolValue));
        System.out.println(Long.parseLong(longValue));

        //Trim method
        System.out.println("      This is test    ".trim());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password (qwert*)");
        String pswd = scanner.nextLine().trim().toLowerCase();

        if (pswd.equals("qwerty")){
            System.out.println("Password correct");
        } else {
            System.out.println("Incorrect password");
        }


    }
}
