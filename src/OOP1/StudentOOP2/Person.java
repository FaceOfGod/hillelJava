package OOP1.StudentOOP2;

/**
 * Created by ITHILLEL6 on 07.07.2015.
 */
public class Person {
    private int id;
    private String surname;

    public Person(int id, String surname) {
        this.id = id;
        this.surname = surname;

    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

