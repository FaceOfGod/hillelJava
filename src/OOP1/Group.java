package OOP1;

/**
 * Created by ITHILLEL6 on 30.06.2015.
 */
public class Group {
    private Student[] students = new Student[10];
    private int numOfStudents = 0;
    public void addStudents(Student student) {
        if(numOfStudents < students.length-1){
            students[numOfStudents]=student;
            numOfStudents++;
        }else {
            Student[] newStudents = new Student [students.length*2];
            for (int i=0; i<students.length; i++){
                newStudents[i] = students[i];
            }
            newStudents[numOfStudents]=student;
            numOfStudents++;
            students = newStudents;
        }
    }

    public void addStudents(String surname) {
        Student student = new Student(numOfStudents, surname );
        addStudents(student);
    }

    public void print() {
        for(int i = 0; i<numOfStudents; i++){
            System.out.println(students[i].getId() + " " + students[i].getSurname() + '\n');
        }
    }
}
