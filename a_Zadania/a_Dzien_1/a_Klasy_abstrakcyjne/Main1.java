package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle (100, "Yaris");

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(
                new Car (210, "Yaris", "Compact"));

        vehicles.add(
                new Train (250, "Pendolino", 1450));

        System.out.println(vehicles.get(0).toString());
        System.out.println(vehicles.get(1).toString());

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(10.0));
        shapes.add(new Rectangle(10.0,20.0));

        System.out.println(shapes.get(0).calculateArea());
        System.out.println(shapes.get(1).calculateCircuit());

    }
}
