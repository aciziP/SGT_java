package oop.abstraction;
//Interface are completely abstract classes

public class CallingFish {
    public static void main(String[] args) {
        //Pet pet = new Pet("Black","Bread","Water",2);
        Fish fish = new Fish("Black","Bread","Water",4,2);
        fish.printPetInfo();
    }
}
