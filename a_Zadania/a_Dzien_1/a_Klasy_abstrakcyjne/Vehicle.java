package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public abstract class Vehicle {
    private Integer maxSpeed;
    protected String model;

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public Vehicle(Integer maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Klasa: " + getClass().getSimpleName()
                + ", model: " + getModel()
                + ", max speed: " + getMaxSpeed();
    }
}
