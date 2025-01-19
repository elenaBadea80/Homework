// 21. Create a class Student with fields name and grade.
//
//Given a list of students, sort them by their grades in ascending order using sorted().
//Collect the sorted list of students.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hmw09ian21SortedStudent {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Student 1", 9.56 ),
                new Student("Student 2", 8.73),
                new Student("Student 3", 9.46),
                new Student("Student 4", 8.77),
                new Student("Student 5", 9.23)
        );

        List<Student> sortedStudent = studentList.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())  // sau  .sorted((s1, s2) -> Double.compare(s1.getGrade(), s2.getGrade()))
                .toList();

        sortedStudent.forEach(System.out::println);
    }
}

class Student{

    private String name;
    private double grade;

    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}