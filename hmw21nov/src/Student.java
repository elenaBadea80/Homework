public class Student implements Comparable<Student> {

    private final String name;
    private final Double grade;

    public Student (String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student object) {
        return Double.compare(object.grade, this.grade);
    }


}
