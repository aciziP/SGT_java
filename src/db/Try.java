package db;

public class Try {
    //Data base
    public static void main(String[] args) {

        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[2]);
        } catch(Exception e){
            System.out.println(e);
            System.out.println("Something went wrong");
        }

        System.out.println("Hello world");

    }
}
