package srp;

public class GenerateRaport extends CalculatorSalary{


    public GenerateRaport (String name, int hoursWorked, double hourlyRate){
        super(name, hoursWorked, hourlyRate);
    }

   public void generateReport(){
        System.out.println("Employee Report:");
        System.out.println("Name: " + getName());
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Hourly Rate: $" + getHourlyRate());
        System.out.println("Salary: $" + calculateSalary());
   }

}
