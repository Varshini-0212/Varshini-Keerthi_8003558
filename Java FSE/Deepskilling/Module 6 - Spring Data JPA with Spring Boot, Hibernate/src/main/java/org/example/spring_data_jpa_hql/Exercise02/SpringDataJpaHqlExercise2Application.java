package org.example.spring_data_jpa_hql.Exercise02;

import org.example.spring_data_jpa_hql.Exercise02.model.Employee;
import org.example.spring_data_jpa_hql.Exercise02.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication(scanBasePackages = "org.example.spring_data_jpa_hql.Exercise02")
public class SpringDataJpaHqlExercise2Application implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHqlExercise2Application.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("===== Permanent Employees with Department =====");

        List<Employee> employees = employeeService.getPermanentEmployees();

        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Department : " + employee.getDepartment());
            System.out.println("--------------------------------");
        }
    }
}