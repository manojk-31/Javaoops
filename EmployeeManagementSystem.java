
abstract class Employee {
    protected String name;
    protected int employeeId;


    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();

    public abstract void displayDetails();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public void displayDetails() {
        System.out.println("Full-Time Employee: " + name + " (ID: " + employeeId + ")");
        System.out.println("Monthly Salary: $" + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displayDetails() {
        System.out.println("Part-Time Employee: " + name + " (ID: " + employeeId + ")");
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Calculated Salary: $" + calculateSalary());
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new FullTimeEmployee("Alice", 101, 5000);
        employees[1] = new PartTimeEmployee("Bob", 102, 25, 120);
        employees[2] = new PartTimeEmployee("Charlie", 103, 20, 100);

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println(); 
        }
    }
}

