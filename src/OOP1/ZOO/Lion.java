package OOP1.ZOO;

/**
 * Created by ITHILLEL6 on 10.07.2015.
 */

    public class Lion extends Wild implements Roarbls {
        public Lion() {
        }

        public Lion(int id, int age, double weight, String color, boolean isPredator) {

            super(id, age, weight, color, isPredator);
        }

    @Override
    public void roar() {
        System.out.println("Lion ROAR");
    }
}

