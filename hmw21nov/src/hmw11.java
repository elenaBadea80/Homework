// 11.Using the Student class, add students to a TreeSet<Student> based on their grade.
// Display the students in ascending order of grades.

import java.util.Set;
import java.util.TreeSet;

public class hmw11 {

    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>();

        students.add(new Student("Alex", 8.5));
        students.add(new Student("Tim", 9.2));
        students.add(new Student("Laura", 8.9));
        students.add(new Student("Chris", 9.0));

        for (Student studentOrdered : students) {
            System.out.println(studentOrdered);

        }


    }
}
