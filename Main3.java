import java.time.LocalDate;
import java.time.Period;

class Employee {
    String name;
    double salary;
    LocalDate hireDate;

    Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    int getYearsOfService() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(hireDate, today);
        return period.getYears();
    }
    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + getYearsOfService());
        System.out.println("-----------------------------");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000, LocalDate.of(2018, 5, 10));
        Employee emp2 = new Employee("Bob", 60000, LocalDate.of(2020, 3, 15));

        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}
