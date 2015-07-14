package OOP1.ZOO;

/**
 * Created by ITHILLEL6 on 10.07.2015.
 */

public class Wolf extends Wild implements Roarbls {
        public Wolf(int id, int age, double weight, String color, boolean isPredator) {
            super(id, age, weight, color, isPredator);
        }

        public Wolf() {
        }

    @Override
    public void roar() {
        System.out.println("Wolf ROAD!!!");
    }
}

