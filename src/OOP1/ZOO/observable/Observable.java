package OOP1.ZOO.observable;

/**
 * Created by ITHILLEL6 on 31.07.2015.
 */
public interface Observable {
    void addObserver(Observer observer);
    void notifyObservers();


}
