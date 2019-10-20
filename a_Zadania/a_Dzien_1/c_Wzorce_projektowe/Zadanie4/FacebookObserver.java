package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie4;

public class FacebookObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("update - FacebookObserver");
        System.out.println(title);
    }
}
