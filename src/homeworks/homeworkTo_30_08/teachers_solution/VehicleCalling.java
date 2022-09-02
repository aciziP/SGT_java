package homeworks.homeworkTo_30_08.teachers_solution;

import java.util.Scanner;

public class VehicleCalling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in your vehicle");
        float fuel = scanner.nextFloat();

        System.out.println("Enter your vehicle's fuel usage per 100km");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter how many passengers will be in the vehicle");
        int passengers = scanner.nextInt();


        Vehicle vehicle = new Vehicle(fuel,fuelUsage,passengers);
        System.out.printf("Your vehicle can drive maximum of %.2f kilometers", vehicle.maxDistance());

        System.out.println();
        System.out.println(vehicle.maxDistance(55.5f,5.5f,5));


    }
}