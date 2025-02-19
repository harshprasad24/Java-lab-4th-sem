class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        if (department != null) {
            System.out.println("Department: " + department);
        }
        if (salary > 0) {
            System.out.println("Salary: $" + salary);
        }
        System.out.println("#######");
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102, "HR");
        Employee emp3 = new Employee("Charlie", 103, "Finance", 60000);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}