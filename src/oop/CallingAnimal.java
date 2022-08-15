package oop;

public class CallingAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Cat","Maine coon", 10.4f, 14);
        animal1.printAnimalInfo();

        Animal animal2 = new Animal("Cat","Nībis", 10.4f);
        animal2.printAnimalInfo();

        Animal animal3 = new Animal();
    }
}
