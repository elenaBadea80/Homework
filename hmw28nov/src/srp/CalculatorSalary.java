package srp;

public class CalculatorSalary extends Employee{

    public CalculatorSalary (String name, int hoursWorked, double hourlyRate){
        super(name, hoursWorked, hourlyRate);
    }

    public double calculateSalary(){
        return getHoursWorked() * getHourlyRate();
    }

}
