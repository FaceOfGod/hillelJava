package OOP1.ZOO.Observers;

import OOP1.ZOO.observable.Observer;

/**
 * Created by ITHILLEL6 on 31.07.2015.
 */
public class SicknessObserver implements Observer {
    @Override
    public void handle() {
        System.out.println("That's not my job!!!");
    }
}
