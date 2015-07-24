package OOP1.StudentOOP_1;


import OOP1.StudentOOP_1.Group;
import OOP1.StudentOOP_1.Student;

/**
 * Created by ITHILLEL6 on 30.06.2015.
 */
public class StudentUp {
    public static void main(String[] args) {
        int [] marks = new int[10];
        Student student1 = new Student(0, "Ivanov");
        Student student2 = new Student(1, "Petrov");
        Student student3 = new Student(3, "Sidorov");
        Student student4 = new Student(4, "Smirnov");
        Student student5 = new Student(5, "Slinko");
        Student student6 = new Student(6, "Chinenov");
        student1.setMarks(2, 5);
        student2.setMarks(6, 2);
        System.out.println(student1.getMarks(2));
        Group group = new Group();
        group.addStudents(student1);
        group.addStudents(student2);
        group.addStudents(student3);
        group.addStudents(student4);
        group.addStudents(student5);
        group.addStudents(student6);
        group.print();






    }
}
