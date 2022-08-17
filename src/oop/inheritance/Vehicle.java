package oop.inheritance;

public class Vehicle {

    //Fields
    protected String brand; //Protected means - it's still private, but subclasses will have access to the field and all package
    //Methods
    public void honk(){
        System.out.println("My brand is "+ brand);
    }

}

class Bike extends Vehicle{

    public void honk(){ //Method overwriting
        System.out.println("Pffff");
        System.out.println("My brand is "+ brand);
    }
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.honk();
        bike.brand = "Volvo";
        bike.honk();
    }

}
