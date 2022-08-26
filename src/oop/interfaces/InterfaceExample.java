package oop.interfaces;
//Interface class ar abstract
interface Bug{
    public void bugSound();
    public void bugSize();
}

interface Location{
    public void location();
}

class Ant implements Bug, Location{
    public void bugSound(){
        System.out.println("Tssss");
    }

    public void bugSize(){
        System.out.println("Small");
    }

    public void location(){
        System.out.println("Ant are located in forest");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSound();
        ant.bugSize();
        ant.location();
    }
}
