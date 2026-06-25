package org.example.spring_data_jpa_hql.Exercise04;

import org.example.spring_data_jpa_hql.Exercise04.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.example.spring_data_jpa_hql.Exercise04")
public class SpringDataJpaHqlExercise4Application implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHqlExercise4Application.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("===== Average Salary =====");
        System.out.println(employeeService.getAverageSalary());

        System.out.println("\n===== Average Salary By Department =====");

        for (Object[] row : employeeService.getAverageSalaryByDepartment()) {
            System.out.println("Department : " + row[0]);
            System.out.println("Average Salary : " + row[1]);
            System.out.println("----------------------------");
        }
    }
}