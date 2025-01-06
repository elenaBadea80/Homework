package generic;
// 2. Create a generic class Pair<K, V> to represent a key-value pair. Add methods to set and get the key and value.
public class Pair<K, V> {

    private K student;
    private V grade;

    public Pair(K student, V grade){
        this.student = student;
        this.grade = grade;
    }

    public K getStudent() {
        return student;
    }

    public void setStudent(K student) {
        this.student = student;
    }

    public V getGrade() {
        return grade;
    }

    public void setGrade(V grade) {
        this.grade = grade;
    }

    public void printDetail(){
        System.out.print(getStudent()+"(");
        System.out.println(getGrade() +")");
    }


}
