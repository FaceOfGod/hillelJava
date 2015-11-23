package HILLEL.OOP1.ZOO;

import HILLEL.OOP1.ZOO.observable.Observable;
import HILLEL.OOP1.ZOO.observable.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ITHILLEL6 on 10.07.2015.
 */

    public class Fish extends Domestic implements Observable {

        List<Observer> observers = new ArrayList<Observer>();

        public Fish(int id, int age, double weight, String color, String name, boolean isVaccinated) {
            super(id, age, weight, color, name, isVaccinated);
        }

        public Fish() {
        }

        public String phrase() {
            return "....";
        }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
        o.handle();
        }
    }
}

