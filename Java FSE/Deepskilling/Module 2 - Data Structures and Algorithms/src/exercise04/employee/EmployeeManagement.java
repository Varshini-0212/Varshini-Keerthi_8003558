package exercise04.employee;

public class EmployeeManagement {

    private Employee[] employees;
    private int count;

    public EmployeeManagement(int size) {

        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if(count < employees.length) {

            employees[count++] = employee;

            System.out.println(
                    "Employee Added Successfully");
        }
        else {

            System.out.println(
                    "Employee Array is Full");
        }
    }

    // Search Employee
    public Employee searchEmployee(int id) {

        for(int i = 0; i < count; i++) {

            if(employees[i].employeeId == id) {
                return employees[i];
            }
        }

        return null;
    }

    // Traverse Employees
    public void displayEmployees() {

        System.out.println("\nEmployee Records:");

        for(int i = 0; i < count; i++) {

            System.out.println(employees[i]);
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        int index = -1;

        for(int i = 0; i < count; i++) {

            if(employees[i].employeeId == id) {

                index = i;
                break;
            }
        }

        if(index != -1) {

            for(int i = index; i < count - 1; i++) {

                employees[i] = employees[i + 1];
            }

            employees[count - 1] = null;
            count--;

            System.out.println(
                    "Employee Deleted Successfully");
        }
        else {

            System.out.println(
                    "Employee Not Found");
        }
    }

    public static void main(String[] args) {

        EmployeeManagement system =
                new EmployeeManagement(10);

        system.addEmployee(
                new Employee(
                        101,
                        "Varshini",
                        "Developer",
                        50000));

        system.addEmployee(
                new Employee(
                        102,
                        "Ravi",
                        "Tester",
                        45000));

        system.addEmployee(
                new Employee(
                        103,
                        "Anjali",
                        "Manager",
                        75000));

        system.displayEmployees();

        System.out.println(
                "\nSearch Result:");

        System.out.println(
                system.searchEmployee(102));

        system.deleteEmployee(102);

        system.displayEmployees();
    }
}