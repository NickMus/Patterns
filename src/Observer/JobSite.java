package Observer;

import Command.Light;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed{
    List<String> vacancies = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyAllObservers();
    }
    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyAllObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o: observers) {
            o.handleEvent(this.vacancies);
        }
    }
}
