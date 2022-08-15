package lecture_15_08_tasks;

import java.util.Scanner;

public class CallingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A:");
        double sideA = scanner.nextDouble();
        System.out.println("Enter side B:");
        double sideB = scanner.nextDouble();
        System.out.println("Enter side C:");
        double sideC = scanner.nextDouble();

        //Creating triangle object
        Triangle triangle1 = new Triangle();
        triangle1.setSideA(sideA);
        triangle1.setSideB(sideB);
        triangle1.setSideC(sideC);

        System.out.println(triangle1.areaTriangle());
        System.out.printf("Your triangles area is %.2f cm2",triangle1.areaTriangle());

    }
}