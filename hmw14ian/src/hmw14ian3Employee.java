import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

//  Create an Employee class with:
//
//- int id
//- String name
//- String department
//- double salary
//
//- Implement Comparable<Employee> to sort by salary in descending order.
//- Override equals and hashCode to ensure employees are distinct based on id.
//- Create a list of employees in multiple departments.
//
//- Use streams to:
//-- Calculate the average salary of employees per department.
//-- Find the top 3 highest-paid employees across all departments.
//-- Partition employees into two groups: those earning more than a given amount and those earning less.
public class hmw14ian3Employee {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Name 1", "Dep 1", 25.50),
                new Employee(2, "Name 2", "Dep 2", 27.30),
                new Employee(3, "Name 3", "Dep 3", 17.80),
                new Employee(4,"Name 4", "Dep 1", 26.20),
                new Employee(5, "Name 1", "Dep 3", 32.50),
                new Employee(6, "Name 6", "Dep 4", 23.70),
                new Employee(7, "Name 7", "Dep 6", 24.50),
                new Employee(8, "Name 1", "Dep 1", 27.20),
                new Employee( 4, "Name 10", "Dep 6", 18.50)
        );

        Map<String, Double> employeeAverage = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee:: getSalary)));

        System.out.println(employeeAverage);

        List<Employee> employeesMaxSalary = employeeList.stream()
                .sorted()
                .limit(3)
                .toList();
        System.out.println(" ");
        employeesMaxSalary.forEach(System.out::println);

        double limitSalary = 25;

        Map<Boolean, List<Employee>> partitionedBySalary = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > limitSalary ));
        System.out.println(" ");
        System.out.println("Salaries over 25: ");
        partitionedBySalary.get(true).forEach(System.out::println);
        System.out.println(" ");
        System.out.println("Salaries up to 25: ");
        partitionedBySalary.get(false).forEach(System.out::println);

    }
}

class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee( int id, String name, String department, double salary ) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.salary, this.salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}



