package org.example.spring_data_jpa_hql.Exercise01;

import org.example.spring_data_jpa_hql.Exercise01.model.Employee;
import org.example.spring_data_jpa_hql.Exercise01.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication(scanBasePackages = "org.example.spring_data_jpa_hql.Exercise01")
public class SpringDataJpaHqlApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHqlApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("===== Permanent Employees =====");

        List<Employee> employees = employeeService.getPermanentEmployees();

        employees.forEach(System.out::println);
    }
}