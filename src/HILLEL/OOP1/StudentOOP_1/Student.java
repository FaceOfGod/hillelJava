package HILLEL.OOP1.StudentOOP_1;

/**
 * Created by ITHILLEL6 on 30.06.2015.
 */
public class Student {
    private int id;
    private String surname;
    private int[]marks;
    public Student(){
        id = 0;
        surname = "N/A";
        marks = new int[34];
    }
    public Student(int id, String surname, int numOfMarks){
        this.id = id;
        this.surname = surname;
        this.marks = new int[numOfMarks];
    }

    public Student(int id, String surname) {
        this(id,surname,34);
    }
    public Student(Student st){
        id = st.id ;
        surname = st.surname;
        marks = new int[st.marks.length];

        for ( int i = 0; i<st.marks.length; i++ ) {
        marks[i] = st.marks[i];
        }
    }
    public int getId(){
        return this.id;
    }
    public void setId(long id){
        this.id = (int)id;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMarks(int lessonNum,int marks){
        this.marks[lessonNum] = marks;
    }
    public int getMarks(int lessonsNum){
        return this.marks[lessonsNum];
    }
}
