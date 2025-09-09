import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public

class Student {
    public int id;
    public String name;
    public float marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

}

public class StudentComparator {

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

        // ordered by id
        Comparator<Student> orderById = (Student obj1, Student obj2) -> obj1.id - obj2.id;
        Collections.sort(studentList, orderById);
        System.out.println("After Sort");
        for (Student s : studentList) {
            System.out.println("id: " + s.id + ", name: " + s.name + ", marks: " + s.marks);
        }

    }

}
