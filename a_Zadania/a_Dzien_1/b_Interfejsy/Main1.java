package a_Zadania.a_Dzien_1.b_Interfejsy;

public class Main1 {
    public static void main(String[] args) {

        Moveable[] moveableTab = new Moveable[3];

        moveableTab[0] = new Car();
        moveableTab[1] = new Cat();
        moveableTab[2] = new Person();

        for (Moveable elem:moveableTab) {
            elem.start();
        }
    }
}
