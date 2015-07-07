package OOP1.StudentOOP2;

/**
 * Created by ITHILLEL6 on 07.07.2015.
 */
public class Student extends Person {
    private int[] marks = new int[24];

    public Student(int id, String surname, int[] marks) {
        super(id, surname);
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
