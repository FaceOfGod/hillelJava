package HILLEL.OOP1.ZOO.Observers;

import HILLEL.OOP1.ZOO.observable.Observer;

/**
 * Created by ITHILLEL6 on 31.07.2015.
 */
public class HungryObserver implements Observer {
    @Override
    public void handle() {
        System.out.println("Going =)");
    }
}
