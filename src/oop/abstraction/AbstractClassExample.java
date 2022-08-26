package oop.abstraction;

abstract class Animal{ //abstract class keyword, we can not create an object of this class
    protected String name;
    public void sleep(){
        System.out.println("zzzzzz");
    }
    //Abstracted method
    public abstract void animalSound(); //Without curly brackets, without the body
}

class Pig extends Animal{
    public void animalSound(){ //Should be in inherited class
        System.out.println("ruk ruk");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Bark, bark");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        //Animal animal = new Animal();

        Pig pig = new Pig();
        pig.sleep();
        pig.name = "Puu";
        pig.animalSound();
    }
}
