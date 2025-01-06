// 10. Create a Set<String> to store student names.
// Add several names, some of them duplicates, and verify that the set only keeps unique names.

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hmw10 {

    public static void main(String[] args) {

        Set<String> student1 = new HashSet<>();
        Set<String> student2 = new TreeSet<>();
        Set<String> student3 = new LinkedHashSet<>();

        student1.add("Dylan");
        student1.add("Anna");
        student1.add("Emma");
        student1.add("Dylan");
        student1.add("Legolas");
        student1.add("Anna");

        student2.add("Dylan");
        student2.add("Anna");
        student2.add("Emma");
        student2.add("Dylan");
        student2.add("Legolas");
        student2.add("Anna");

        student3.add("Dylan");
        student3.add("Anna");
        student3.add("Emma");
        student3.add("Dylan");
        student3.add("Legolas");
        student3.add("Anna");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
