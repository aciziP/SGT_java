package homeworks.homeworkTo_30_08;

public class Car extends Vehicle {

    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner){
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    public double maxDistance(){
        float additional = ((passengers * 5) * fuelUsage)/100;
        System.out.println("Fuel increase by passengers: " + additional);
        float distance = fuel*100/fuelUsage + additional;
        System.out.println("Maximum distance with fuel increase by passengers: " + distance);

        if (airConditioner) {
            float additionalConditioner = 10 * (fuelUsage + additional) / 100;
            distance += additionalConditioner;
            System.out.println("Fuel increase by air conditioner: " + additionalConditioner);
        }

        System.out.print("Rounded maximum distance: ");
        return (double) Math.round(distance * 100.0)/100.0;
    }
}
