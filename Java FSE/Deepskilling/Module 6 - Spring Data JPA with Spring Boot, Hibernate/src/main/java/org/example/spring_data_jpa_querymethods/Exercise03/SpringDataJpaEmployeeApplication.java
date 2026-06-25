package org.example.spring_data_jpa_querymethods.Exercise03;

import org.example.spring_data_jpa_querymethods.Exercise03.model.Department;
import org.example.spring_data_jpa_querymethods.Exercise03.model.Employee;
import org.example.spring_data_jpa_querymethods.Exercise03.service.DepartmentService;
import org.example.spring_data_jpa_querymethods.Exercise03.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.example.spring_data_jpa_querymethods.Exercise03")
public class SpringDataJpaEmployeeApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaEmployeeApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("===== EMPLOYEE DETAILS =====");

        Employee employee = employeeService.getEmployee(1);

        if (employee != null) {
            System.out.println(employee);
            System.out.println("Department : " + employee.getDepartment());
        }

        System.out.println("\n===== DEPARTMENT DETAILS =====");

        Department department = departmentService.getDepartment(2);

        if (department != null) {
            System.out.println(department);
            System.out.println("Employees :");
            department.getEmployeeList().forEach(System.out::println);
        }
    }
}