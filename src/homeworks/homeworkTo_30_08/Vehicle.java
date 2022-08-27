package homeworks.homeworkTo_30_08;

public class Vehicle {
    //Fields
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    //Custom constructor
    public Vehicle(float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public double maxDistance(){

        float additional = ((passengers * 5) * fuelUsage)/100;
        System.out.println("Fuel increase by passengers: " + additional);
        float distance = fuel*100/fuelUsage + additional;
        System.out.println("Maximum distance with fuel increase by passengers: " + distance);
        System.out.print("Rounded maximum distance: ");

        return (double) Math.round(distance * 100.0)/100.0;

    }
}
