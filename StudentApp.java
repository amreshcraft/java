import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    public int id;
    String name;
    float marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.marks - o.marks);
    }

}

public class StudentApp {

    public static void main(String[] args) {
        Student student = new Student(234, "Amresh", 98);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(new Student(953, "Ajay", 99));
        studentList.add(new Student(455, "Sumit", 89));
        studentList.add(new Student(222, "Krishan", 75));

        System.out.println("Before Sort");
        for (Student s : studentList) {
            System.out.println("id: " + s.id + ", name: " + s.name + ", marks: " + s.marks);
        }

        Collections.sort(studentList);
        System.out.println("After Sort");
        for (Student s : studentList) {
            System.out.println("id: " + s.id + ", name: " + s.name + ", marks: " + s.marks);
        }

    }
}