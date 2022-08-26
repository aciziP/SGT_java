package oop;

enum Level{
    //Group of constants
    EASY,
    MEDIUM,
    HARD
}

public class EnumExample {
    public static void main(String[] args) {
        Level myLevel = Level.MEDIUM;

        switch (myLevel) {
            case EASY -> System.out.println("Your level is easy");
            case MEDIUM -> System.out.println("Your level is medium");
            case HARD -> System.out.println("Your level is hard");
        }
    }
}
