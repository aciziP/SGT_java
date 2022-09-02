package homeworks.homeworkTo_30_08;

public class CallingVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(55.5f, 5.5f, 5);
        System.out.println(vehicle.maxDistance());

        Car car = new Car(36.1f, 8.6f, 3, true);
        System.out.println(car.maxDistance());
    }
}
