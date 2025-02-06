import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeStreamExample {

    public static void main(String[] args) {
      
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 28, 60000));
        employees.add(new Employee("Bob", 35, 75000));
        employees.add(new Employee("Charlie", 32, 80000));
        employees.add(new Employee("David", 25, 50000));
        employees.add(new Employee("Eve", 40, 90000));

        List<String> employeeNames = employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .map(Employee::getName)
                .collect(Collectors.toList());

        double averageSalary = employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

       
        System.out.println("Employees older than 30: " + employeeNames);
        System.out.printf("Average salary of employees older than 30: $%.2f%n", averageSalary);
    }
}
