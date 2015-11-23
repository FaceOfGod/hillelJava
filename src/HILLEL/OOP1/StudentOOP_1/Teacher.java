package HILLEL.OOP1.StudentOOP_1;

/**
 * Created by ITHILLEL6 on 07.07.2015.
 */
public class Teacher {
    private int id;
    private String surname;
    private double salary;

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(int id, String surname, double salary) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }



}
