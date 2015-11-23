package HILLEL.OOP1.ZOO;

/**
 * Created by ITHILLEL6 on 10.07.2015.
 */
public class Cat extends Domestic {
    public Cat(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public Cat() {
    }

    public String phrase(){
        String result = super.phrase();
        result += " Meow!";

        return result;
    }
}
