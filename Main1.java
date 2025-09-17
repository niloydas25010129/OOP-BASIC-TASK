class Employee {
    String name;
    String jobTitle;
    double salary;
    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    double yearlySalary() {
        return salary * 12;
    }
    void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Yearly Salary: " + yearlySalary());
        System.out.println("---------------------------");
    }
}


public class Main1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "Software Engineer", 50000);
        emp1.displayInfo();
        emp1.updateSalary(55000);
        System.out.println("After Salary Update:");
        emp1.displayInfo();
    }
}
