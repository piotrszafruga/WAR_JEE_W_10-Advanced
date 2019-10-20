package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double calculateCircuit() {
        return Math.PI * Math.pow(getRadius(), 2.0);
    }
}
