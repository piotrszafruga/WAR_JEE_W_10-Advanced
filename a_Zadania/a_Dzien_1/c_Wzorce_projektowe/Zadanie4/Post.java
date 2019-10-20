package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie4;

import java.util.ArrayList;

public class Post implements Subject {
    private String content;
    private String title;
    private ArrayList<Observer> observers;

    public Post() {
        observers = new ArrayList<Observer>();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void share() {
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();
    }


    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers) {
            observer.update(this.title);
        }
    }
}
