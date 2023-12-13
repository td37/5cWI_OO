package at.td.DesingPatterns.homeControl;

import java.util.ArrayList;
import java.util.List;

public class Thermometer {
    private boolean tempOverTwenty = true;
    private List<Observer> observers = new ArrayList<>();

    public void informAll() {
        if (tempOverTwenty) {
            for (Observer observer : observers) {
                observer.informTempOver20();
            }

        } else {
            System.out.println("Nothing is happening, temperature unter 20°C");
        }
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
}
