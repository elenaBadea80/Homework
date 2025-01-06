import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 7.Using the Student class, create a list of students with different grades. Find and display the top 3 students based on their grades.
public class StudentMain {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alexa", 8.5));
        students.add(new Student("Sam", 7.5));
        students.add(new Student("Lana", 9.7));
        students.add(new Student("Dan", 6.0));
        students.add(new Student("Emma", 9.0));
        students.add(new Student("Brad", 8.5));

        Collections.sort(students);

        System.out.println("Students ordered by grades: ");
        students.forEach(System.out::println);

        List<Student> top3students = students.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("The first 3 students are: ");
        top3students.forEach(System.out::println);
    }
}
