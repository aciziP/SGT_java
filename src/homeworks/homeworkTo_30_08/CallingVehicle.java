package homeworks.homeworkTo_30_08;

public class CallingVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(45.5f, 5.5f, 5);
        System.out.println(vehicle.maxDistance());

        Car car = new Car(70.0f, 7.0f, 1, true);
        System.out.println(car.maxDistance());
    }
}
