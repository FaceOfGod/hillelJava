package HILLEL.OOP1.ZOO;

/**
 * Created by ITHILLEL6 on 10.07.2015.
 */
public class Dog extends Domestic implements Roarbls {
    public Dog(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public Dog() {
    }

    public String phrase(){
        String result = super.phrase();
        result += " Woof!";
        return result;
    }

    @Override
    public void roar() {
        System.out.println("Dog ROAR!!!");
    }
}
