import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class hmw14ian1Student {
    public static void main(String[] args) {

        List<Student> studentsList = Arrays.asList(
                new Student(1001, "Student 1", 8.75),
                new Student(1002, "Student 2", 8.75),
                new Student(1003, "Student 3", 8.55),
                new Student(1004, "Student 4", 9.75),
                new Student(1007, "Student 2", 8.75),
                new Student(1005, "Student 5", 8.55),
                new Student(1006, "Student 6", 9.20),
                new Student(1004, "Student 4", 8.45),
                new Student(1002, "Student 2", 9.80),
                new Student(1008, "Student 1", 9.40),
                new Student(1002, "Student 2", 8.75),
                new Student(1009, "Student 1", 9.65)
        );

        List<Student> sortedStudent = studentsList.stream()
                .filter(s -> s.getGrade() > 9.00)
                .sorted()
                .toList().reversed();

        sortedStudent.forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.grade, o.grade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}