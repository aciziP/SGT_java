public class CharClass {
    //22.07.2022.
    public static void main(String[] args) {
        //char is under numerical values

        char ch = 'M'; //Single quotation marks
        System.out.println(ch);

        ch++;
        System.out.println(ch);

        ch++;
        System.out.println(ch);

        //Cast from int to char
        System.out.println((char) 122);

        //Print out all lowercase alphabet letters
        for(int i = 97; i <= 122; i++){
            System.out.print((char) i + " ");
        }
    }
}
