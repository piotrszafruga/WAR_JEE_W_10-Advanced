package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public class Train extends Vehicle {
    private int trackWidth;


    public Train(Integer maxSpeed, String model, int trackWidth) {
        super(maxSpeed, model);
        this.trackWidth = trackWidth;
    }
}
